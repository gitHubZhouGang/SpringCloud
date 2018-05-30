package com.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author ZGang
 * @Description:
 * @Date: Create in 14:18 2018/5/30
 * @Modified By:
 */
@Component
public class MethodFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String methodName = request.getMethod();
        System.out.println("请求执行方法:"+methodName);
        //requestContext.set("error.status_code","Error Stat Code");
        if(methodName.equals("GET")) {
            requestContext.setSendZuulResponse(true);
            requestContext.setResponseStatusCode(200);
            requestContext.set("isSuccess", true);
        }else{
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            requestContext.setResponseBody("{\"result\":\"the request method must post!\"}");
            requestContext.set("isSuccess", false);
        }
        //throwException();
        return null;
    }

    private void throwException(){

        throw new RuntimeException("Errors.....");
    }
}
