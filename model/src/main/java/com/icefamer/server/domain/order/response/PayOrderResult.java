package com.icefamer.server.domain.order.response;

import com.icefamer.server.domain.order.OrdersPay;
import com.icefamer.server.model.response.ResponseResult;
import com.icefamer.server.model.response.ResultCode;
import lombok.Data;
import lombok.ToString;

/**
 * Created by mrt on 2018/3/27.
 */
@Data
@ToString
public class PayOrderResult extends ResponseResult {
    public PayOrderResult(ResultCode resultCode) {
        super(resultCode);
    }
    public PayOrderResult(ResultCode resultCode, OrdersPay ordersPay) {
        super(resultCode);
        this.ordersPay = ordersPay;
    }
    private OrdersPay ordersPay;
    private String orderNumber;

    //当tradeState为NOTPAY（未支付）时显示支付二维码
    private String codeUrl;
    private Float money;


}
