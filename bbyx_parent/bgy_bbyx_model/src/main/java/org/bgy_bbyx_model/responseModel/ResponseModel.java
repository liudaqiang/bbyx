package org.bgy_bbyx_model.responseModel;

public class ResponseModel {
	private String code;	//返回值
	private Object data;		//返回数据
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ResponseModel(String code, Object data) {
		super();
		this.code = code;
		this.data = data;
	}
	
}
