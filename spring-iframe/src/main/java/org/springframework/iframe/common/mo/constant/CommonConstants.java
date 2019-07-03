package org.springframework.iframe.common.mo.constant;

public interface CommonConstants {
    /**
     * 数据逻辑删除状态
     */
    Boolean DATA_ENABLE = Boolean.TRUE; //有效
    Boolean DATA_DISABLE = Boolean.FALSE; //已删除

    /**
     * 返回的data key
     */
    String RESPONSE_DATA_KEY = "data";

    // 返回码
    int RESPONSE_CODE_SUCCESS = 0;
    int RESPONSE_CODE_FAILURE = 1;
    int RESPONSE_CODE_RESOURCE_NOT_EXIST = 2;
    int RESPONSE_CODE_ANONYMOUS = 10;
    int RESPONSE_CODE_ACCESS_DENIED = 20;
    int RESPONSE_CODE_LOGIN_OFF = 100;

    // 分页参数
    int DEFAULT_PAGE_NUMBER = 0; // 默认页数，0代表第一页
    int DEFAULT_PAGE_SIZE = 15; //默认分页大小，15
}
