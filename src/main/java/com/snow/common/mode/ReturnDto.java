/*
 * 文件名：ReturnDto.java
 * 版权： Copyright 2002-2016 Wsn Group. Co. Ltd. All Rights Reserved.
 * 描述： Controller层非列表结果的调用返回通用类
 * 修改人： 任怀宇
 * 修改时间：2016年7月26日
 * 修改内容：增加代码注释
 */
package com.snow.common.mode;
/**
 * @author tk
 * @version 1.0
 */
public class ReturnDto {
    
    private String  code    = "0";
    private String  message = "操作成功";
    private boolean success = true;
    private Object  object;

    public ReturnDto() {
        // null
    }

    public ReturnDto(String code, String message, boolean success, Object object) {
        this.code = code;
        this.message = message;
        this.success = success;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

	@Override
	public String toString() {
		return "ReturnDto [code=" + code + ", message=" + message + ", success=" + success + ", object=" + object + "]";
	}

}
