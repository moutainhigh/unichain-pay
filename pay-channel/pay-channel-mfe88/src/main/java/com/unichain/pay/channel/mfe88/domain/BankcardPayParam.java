package com.unichain.pay.channel.mfe88.domain;


import com.unichain.pay.core.PayParam;
import com.unichain.pay.core.PayRequest;
import lombok.Data;

import java.util.Map;

/**
 * 支付确认
 *
 * @date
 */
@Data
public class BankcardPayParam implements PayParam {

    /**
     * 接口名称
     */
    private String service = "quickPayConfirm";
    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 网关版本
     */
    private String version = "V3.0";
    /**
     * 签名版本
     */
    private String signVersion = "V3.0";
    /**
     * 风控版本
     */
    private String riskVersion = "V3.0";
    /**
     * 订单来源 1PC，2手机
     */
    private Integer orderSource = 2;
    /**
     * 商户系统产生的唯一订单号
     */
    private String orderNo;
    /**
     * 预下单返回参数needSms值为0时，输入用户收到的短信验证码
     */

    private String smsCode;
    /**
     * 商户签名数据
     */
    private String sign;
    /**
     * 签名类型 1: MD5； 2： RSA； 3：CFCA证书
     */
    private Integer signType = 3;

    @Override
    public PayParam convert(PayRequest payRequest) {
        Map map = payRequest.getPayParamMap();

        this.orderNo = map.get("paymentId").toString();
        this.smsCode = map.get("smsCode").toString();

        return this;
    }

    @Override
    public PayParam encrypt(String encryptKey) {
        return this;
    }
}
