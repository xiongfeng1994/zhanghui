package com.gto.zhanghui.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.gto.common.exception.RRException;
import com.gto.zhanghui.cache.RedisCacheUtil;

@Component
public class TokenInterceptor implements HandlerInterceptor{
	
	private static final Log log = LogFactory.getLog(TokenInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String authorization = request.getHeader("Authorization");
		String value = RedisCacheUtil.get(authorization);
		log.info("authorization>>>>>>>>>"+authorization);
		log.info("value>>>>>>>>>"+value);
		if(value == null) {
			throw new RRException("请登陆后再试",500);
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
