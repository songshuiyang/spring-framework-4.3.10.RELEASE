package org.springframework.iframe.common.mo.base;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.iframe.common.mo.ResponseMO;
import org.springframework.iframe.common.mo.constant.CommonConstants;
import org.springframework.iframe.utils.ResponseUtil;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author songsy
 * @date 2019/7/3 9:57
 */
@Slf4j
public abstract class BaseController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	protected ResponseMO success() {
		return ResponseUtil.success();
	}

	protected ResponseMO success(String msg) {
		return ResponseUtil.success(msg);
	}

	protected ResponseMO success(Object obj) {
		return ResponseUtil.successWithData("", obj);
	}

	protected ResponseMO success(Object obj, String msg) {
		return ResponseUtil.successWithData(msg, obj);
	}

	protected ResponseMO error(String msg) {
		return ResponseUtil.error(msg);
	}
}
