package cn.edu.nwsuaf.lims.service;
import cn.edu.nwsuaf.lims.model.User;
import cn.edu.nwsuaf.lims.core.Service;


/**
 * Created by liuchao Li on 2019/05/12.
 */
public interface UserService extends Service<User> {
  public User login(String username,String password);
  public User findByUsername(String username);
  public User findByPhone(String phone);
}
