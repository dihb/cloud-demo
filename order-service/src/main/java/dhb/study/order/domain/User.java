package dhb.study.order.domain;

import lombok.Data;

/**
 * @ClassName User
 * @Description
 * @Author MR DI
 * @Date 2021/10/13 10:26
 * @Version 1.0
 */
@Data
public class User {
    private String userId;
    private String userName;
    private String address;
    private String age;
    private String sex;
}
