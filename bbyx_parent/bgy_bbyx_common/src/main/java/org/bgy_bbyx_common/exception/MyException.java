package org.bgy_bbyx_common.exception;

public class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String code,String errorType, String msg) {
		this.code = code;
		this.msg = msg;
		this.errorType = errorType;
	}

	private String code;
	private String msg;
	private String errorType;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

}
