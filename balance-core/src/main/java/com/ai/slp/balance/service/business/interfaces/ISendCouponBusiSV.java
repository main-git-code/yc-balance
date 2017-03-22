package com.ai.slp.balance.service.business.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.balance.api.sendcoupon.param.DeductionCouponRequest;
import com.ai.slp.balance.api.sendcoupon.param.DeductionCouponResponse;
import com.ai.slp.balance.api.sendcoupon.param.FunDiscountCouponResponse;

public interface ISendCouponBusiSV {
	public void registerSendCoupon(String activityName,String userId) throws BusinessException,SystemException;
	/*public void offLineSendCoupon(int maxCount,String couponName,String userId) throws BusinessException,SystemException;*/
	/**
	 * 查询优惠券
	 */
	public List<DeductionCouponResponse> deducionCoupon(String couponId);

	
	/**
	 * 查询可使用的优惠券
	 */
	public List<DeductionCouponResponse> queryDeducionCoupon(DeductionCouponRequest param);

	
	/**
	 * 根据用户ID查询优惠券
	 */
	public List<FunDiscountCouponResponse> queryCouponByUserId(String userId);
	
	
	/**
	 * 查询优惠券状态变为解冻
	 */
	public void updateStateThaw(String couponId);
	
	
	/**
	 * 查询优惠券状态变为冻结
	 */
	public void updateStateFreeze(String couponId);
}
