package org.springframework.iframe.exception;

/**
 * @author songsy
 * @date 2019/5/23 11:10
 */
public class CouponException extends Exception{

    public CouponException(String message) {
        super(message);
    }

    public CouponException(Throwable cause) {
        super(cause);
    }

    public CouponException(String message, Throwable cause) {
        super(message, cause);
    }
}
