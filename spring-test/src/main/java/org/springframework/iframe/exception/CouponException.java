package org.springframework.iframe.exception;

/**
 * @author JH.TAO
 * @create 2018-06-19 下午7:30
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
