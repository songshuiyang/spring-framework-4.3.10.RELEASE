package org.springframework.iframe.utils;

import org.springframework.iframe.common.mo.ResponseMO;
import org.springframework.iframe.common.mo.constant.CommonConstants;

/**
 * @author songsy
 * @date 2019/7/3 9:57
 */
public class ResponseUtil {

    public static ResponseMO response(int code, String msg, Object data, String debugInfo) {
        ResponseMO responseMO = new ResponseMO();
        responseMO.setCode(code);
        responseMO.setMsg(msg);
        responseMO.setData(data);
        responseMO.setDebugInfo(debugInfo);
        return responseMO;
    }

    public static ResponseMO response(int code, String msg, Object data) {
        return response(code, msg, data, null);
    }

    public static ResponseMO response(int code, String msg) {
        return response(code, msg, null, null);
    }

    public static ResponseMO success(String msg) {
        return response(CommonConstants.RESPONSE_CODE_SUCCESS, msg, null, null);
    }

    public static ResponseMO success() {
        return response(CommonConstants.RESPONSE_CODE_SUCCESS, null, null, null);
    }

    public static ResponseMO successWithData(Object data) {
        return response(CommonConstants.RESPONSE_CODE_SUCCESS, "操作成功", data, null);
    }

    public static ResponseMO successWithData(String msg, Object data) {
        return response(CommonConstants.RESPONSE_CODE_SUCCESS, msg, data, null);
    }

    public static ResponseMO error(int code, String message) {
        return response(code, message);
    }

    public static ResponseMO error(String message, String debugInfo) {
        return response(CommonConstants.RESPONSE_CODE_FAILURE, message, null, debugInfo);
    }

    public static ResponseMO error(String message) {
        return error(CommonConstants.RESPONSE_CODE_FAILURE, message);
    }

    public static ResponseMO errorWithData(String message, Object data) {
        return response(CommonConstants.RESPONSE_CODE_FAILURE, message, data, null);
    }


}
