package dhb.study.order.mapper;

import dhb.study.order.domain.Order;
import org.springframework.stereotype.Service;

/**
 * 订单mapper
 */
@Service
public interface OrderMapper {

    Order getOrderByOrderId(String orderId);
    Order getOrderByUserId(String userId);
}
