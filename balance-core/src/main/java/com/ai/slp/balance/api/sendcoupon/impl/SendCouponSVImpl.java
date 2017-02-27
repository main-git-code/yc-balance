package com.ai.slp.balance.api.sendcoupon.impl;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.balance.api.sendcoupon.interfaces.ISendCouponSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class SendCouponSVImpl implements ISendCouponSV {
    
    private static final Logger LOG = LogManager.getLogger(SendCouponSVImpl.class);
    
    @Autowired
    private ISendCouponSV sendCouponSV;

	@Override
	public void registerSendCoupon(String activityName, String userId) throws BusinessException, SystemException {
		sendCouponSV.registerSendCoupon(activityName, userId);
	}

	@Override
	public void offLineSendCoupon(int maxCount, String couponName, String userId)
			throws BusinessException, SystemException {
		sendCouponSV.offLineSendCoupon(maxCount, couponName, userId);
	}


}