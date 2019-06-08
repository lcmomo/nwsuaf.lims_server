package cn.edu.nwsuaf.lims.service;
import cn.edu.nwsuaf.lims.model.Unread;
import cn.edu.nwsuaf.lims.core.Service;

import java.util.List;


/**
 * Created by liuchao Li on 2019/05/28.
 */
public interface UnreadService extends Service<Unread> {
 public List<Unread> findByusername(String userame);
}
