package dhb.study.user.mapper;

import dhb.study.user.domain.User;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserMapper
 * @Description
 * @Author MR DI
 * @Date 2021/10/13 10:26
 * @Version 1.0
 */
@Service
public interface UserMapper {

   User getUser(String userId);
}
