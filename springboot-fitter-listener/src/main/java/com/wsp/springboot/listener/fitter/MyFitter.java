package com.wsp.springboot.listener.fitter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(urlPatterns = "/*",description = "自定义fitter")
public class MyFitter implements Filter {
    private final Logger _logger= LoggerFactory.getLogger(MyFitter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        _logger.info("MyFilter init ...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        _logger.info("处理 filter 业务 ...");
    }

    @Override
    public void destroy() {
        _logger.info("MyFilter destroy ...");
    }
}
