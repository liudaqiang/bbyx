package com.pc_interface.exception;

import java.util.HashMap;
import java.util.Map;

import org.bgy_bbyx_common.exception.MyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(value = { MyException.class })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public MyException constraintViolationException(NullPointerException ex) {
		return new MyException("500","NullPointerException",ex.getMessage());
	}

	

	/**
	 * 全局异常捕捉处理
	 * 
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Map<String, Object> errorHandler(Exception ex) {
		Map<String, Object> map = new HashMap<>();
		map.put("code", 101);
		map.put("msg", ex.getMessage());
		return map;
	}
}
