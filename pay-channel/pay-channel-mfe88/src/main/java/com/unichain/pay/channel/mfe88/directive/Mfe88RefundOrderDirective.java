package com.unichain.pay.channel.mfe88.directive;

import com.unichain.pay.channel.mfe88.domain.RefundOrderParam;
import com.unichain.pay.channel.mfe88.domain.RefundOrderResponse;
import com.unichain.pay.core.ChannelConfig;
import com.unichain.pay.core.PayDirective;
import com.unichain.pay.core.PayRequest;
import com.unichain.pay.core.PayResponse;
import org.springframework.stereotype.Service;

/**
 * @Author lait.zhang@gmail.com
 * @Tel 15801818092
 * @Date 12/4/2019
 * @Description ${Description}
 */
@Service("Mfe88RefundOrderDirective")
public class Mfe88RefundOrderDirective implements PayDirective<RefundOrderParam, RefundOrderResponse> {

    @Override
    public PayResponse exec(PayRequest payRequest, ChannelConfig channelConfig) {
        return null;
    }

    @Override
    public RefundOrderParam buildPayParam(PayRequest payRequest, ChannelConfig channelConfig) {
        return null;
    }


    @Override
    public String getDirectiveCode() {
        return "Mfe88RefundOrderDirective";
    }

    @Override
    public RefundOrderResponse record(RefundOrderParam payParam, PayRequest payRequest, RefundOrderResponse payResponse) {
        return null;
    }


//    @Autowired
//    private ChannelDirectiveRecordService channelDirectiveRecordService;
//
//    @Override
//    public PayResponse exec(Mfe88ChannelDirecvite channelDirective, RefundOrderParam payParam, PayRequest payRequest) {
////        String privateKey = channelDirective.getPrivateKey();
//        String oidPartner = channelDirective.getMerchantNo();
////        String publicKey = channelDirective.getPublicKey();
//        payParam.setMerchantNo(oidPartner);
////        //银通公钥隐藏
////        String ytPublicKey = channelDirective.getSecretKey();
//        String uri = channelDirective.getDirectiveUri();
//        // 响应结果
//        String data = Mfe88PayRequestHandler.build(payParam, channelDirective)
//                /*.sign(privateKey).encrypt(oidPartner,ytPublicKey)*/
//                .exec(uri);
//        record(payParam, payRequest, data);
//        PayResponse payResponse = new PayResponse();
//        return payResponse.data(data);
//    }
//
//    @Override
//    public RefundOrderParam buildPayParam(PayRequest payRequest) {
//        RefundOrderParam refundOrderParam = new RefundOrderParam();
//        Mfe88PayRequestHandler.buildPayParam(refundOrderParam, payRequest);
//        return refundOrderParam;
//    }
//
//    @Override
//    public Mfe88ChannelDirecvite buildChannelDirective() {
//        return new Mfe88ChannelDirecvite();
//    }
//
//    @Override
//    public PayResponse record(RefundOrderParam payParam, PayRequest payRequest, String data) {
//        RefundOrderResponse response = JSONUtil.toBean(data, RefundOrderResponse.class);
//
//        ChannelDirectiveRecord save = new ChannelDirectiveRecord();
//        save.setAccountId(payRequest.getAccountId());
//        save.setAppId(payRequest.getAppId());
//        save.setUserId(payRequest.getUserId());
//        save.setChannelId(payRequest.getChannelId());
//        save.setDirectiveCode(getDirectiveCode());
//        save.setCompanyId(payRequest.getCompanyId());
//        save.setReturnCode(response.getDealCode());
//        save.setReturnMsg(response.getDealMsg());
//        save.setPaymentId(payRequest.getPaymentId());
//
//        PayResponse result = new PayResponse();
//        if (!"10000".equals(response.getDealCode())) {
//            // 0默认表示成功，1表示失败
//            save.setState(1);
//        } else {
//            result.data(payRequest.getPaymentId());
//        }
//        channelDirectiveRecordService.save(save);
//        return result;
//    }


}
