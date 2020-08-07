package com.its.config.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;

@RestControllerAdvice(value = "com.its.controller")
public class ItsControllerAdvice {

	@ExceptionHandler(value = Exception.class)
	public String generalExceptionAdvice(Exception exp, HandlerMethod method) {
		return "failed";
	}
}
