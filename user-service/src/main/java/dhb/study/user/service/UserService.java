package dhb.study.user.service;

import dhb.study.user.domain.User;
import dhb.study.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description
 * @Author MR DI
 * @Date 2021/10/13 10:33
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String userId){
        return userMapper.getUser(userId);
    }
}
