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
import cn.edu.nwsuaf.lims.core.AesUtil;
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
                .andEqualTo("username",username);


        //System.out.println("\n\n"+username);
        List<User> usersn = findByCondition(condition);
        //System.out.println("\n\nu"+usersn);
        User user=null;
        if (usersn.size() > 0) {
            Condition condition2 = new Condition(User.class);
            condition2.createCriteria()
                    .andEqualTo("username",username)
                    .andEqualTo("password",  password);
            System.out.println(password);
            List<User> users = findByCondition(condition2);
            if(users.size()>0) {
                user = users.get(0);
                System.out.println("\n\nuser" + user.getPassword());
                return user;
            }else{
                  user=new User();
                user.setUsername("err");
                    return  user;
            }

        } else
            return null;
    }

    @Override
    public User findByUsername(String username) {
        Condition condition = new Condition(User.class);
        condition.createCriteria()
                .andEqualTo("username",username);
        List<User> usersn = findByCondition(condition);
        User user=null;
        if(usersn.size()>0){
           user=new User();
           return user;
        }
        else

        return null;
    }

    @Override
    public User findByPhone(String phone) {
        Condition condition = new Condition(User.class);
        condition.createCriteria()
                .andEqualTo("phone",phone);
        List<User> usersn = findByCondition(condition);

        if(usersn.size()>0){

            return usersn.get(0);
        }
        else

            return null;
    }
}