package com.ai.slp.balance.service.business.interfaces;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.balance.api.coupontemplate.param.FunCouponTemplateQueryRequest;
import com.ai.slp.balance.api.coupontemplate.param.FunCouponTemplateResponse;
import com.ai.slp.balance.api.coupontemplate.param.FunDiscountCouponInfoVo;
import com.ai.slp.balance.dao.mapper.bo.FunCouponTemplate;

public interface ICouponTemplateBusiSV {
	//生成优惠券模板接口
	public void BuildCouponTemplet(FunCouponTemplate couponTemplate,Integer requiredMoneyAmount,HttpSession session)throws BusinessException, SystemException;
	//模糊查询优惠券模板列表
	public PageInfo<FunCouponTemplateResponse> queryCouponTemplet(FunCouponTemplateQueryRequest funCouponTemplateQueryRequest);
	//根据优惠券模板iD查询优惠券明细
	public List<FunDiscountCouponInfoVo> queryAccountInfoByCustId(Integer templateId);
	//POI导出优惠券模板列表生成Excel
	public List<FunCouponTemplateResponse> exportCouponTempletList(FunCouponTemplateQueryRequest funCouponTemplateQueryRequest);
}