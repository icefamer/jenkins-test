package com.icefamer.server.domain.order.response;

import com.icefamer.server.domain.order.Orders;
import com.icefamer.server.model.response.ResponseResult;
import com.icefamer.server.model.response.ResultCode;
import lombok.Data;
import lombok.ToString;

/**
 * Created by mrt on 2018/3/26.
 */
@Data
@ToString
public class OrderResult extends ResponseResult {
    private Orders orders;
    public OrderResult(ResultCode resultCode, Orders orders) {
        super(resultCode);
        this.orders = orders;
    }


}
