package dhb.study.order.domain;

import lombok.Data;

/**
 * 订单类
 */
@Data
public class Order {
    private String orderId;
    private String productId;
    private String productName;
    private String quantity;
    private String costs;
    private String createTime;
    private String userId;
    private User user;
}
