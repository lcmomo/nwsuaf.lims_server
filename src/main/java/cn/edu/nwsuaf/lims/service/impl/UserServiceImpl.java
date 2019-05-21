package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.UserMapper;
import cn.edu.nwsuaf.lims.model.User;
import cn.edu.nwsuaf.lims.service.UserService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tk.mybatis.mapper.entity.Condition;

/**
 * Created by liuchao Li on 2019/05/12.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public User login(String username, String password) {
        Condition condition = new Condition(User.class);
        condition.createCriteria()
                .andEqualTo("username",username)
                .andEqualTo("password", password);

        //System.out.println("\n\n"+username);
        List<User> users = findByCondition(condition);
        System.out.println("\n\nu"+users);
        if (users.size() > 0) {
            User user = users.get(0);
            System.out.println("\n\nuser"+user);
            return user;

        } else
            return null;
    }
}