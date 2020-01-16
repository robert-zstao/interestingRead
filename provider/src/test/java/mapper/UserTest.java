package mapper;


import com.zstao.api.entity.User;
import com.zstao.api.mapper.UserDao;
import com.zstao.provider.ProviderApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试用户
 */

@SpringBootTest(classes = ProviderApplication.class)
public class UserTest {
    @Resource
    private UserDao ud;

    @Test
     public void listUser(){
        List<User> list=ud.listUsers();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
