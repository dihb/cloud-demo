package dhb.study.order.service;

import dhb.study.order.domain.Order;
import dhb.study.order.domain.User;
import dhb.study.order.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 订单处理service
 */
@Service
@Slf4j
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;

    public Order getOrderByOrderId(String orderId){
        Order order = orderMapper.getOrderByOrderId(orderId);
        String url = "http://userservice/user/"+order.getUserId();
        User user = restTemplate.getForObject(url,User.class);
        order.setUser(user);
        return order;
    }


}
