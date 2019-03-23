package com.eschool.domain;

import org.springframework.stereotype.Component;

@Component
public class Response {
	private int statusCode;
	private String statusMsg;
	private Object data;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMsg() {
		return statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Response(int statusCode, String statusMsg, Object data) {
		super();
		this.statusCode = statusCode;
		this.statusMsg = statusMsg;
		this.data = data;
	}
	public Response() {
		super();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + statusCode;
		result = prime * result + ((statusMsg == null) ? 0 : statusMsg.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Response other = (Response) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (statusCode != other.statusCode)
			return false;
		if (statusMsg == null) {
			if (other.statusMsg != null)
				return false;
		} else if (!statusMsg.equals(other.statusMsg))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Response [statusCode=" + statusCode + ", statusMsg=" + statusMsg + ", data=" + data + "]";
	}
	
	
	

}
