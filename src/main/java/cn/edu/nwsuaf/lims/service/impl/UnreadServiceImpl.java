package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.UnreadMapper;
import cn.edu.nwsuaf.lims.model.Unread;
import cn.edu.nwsuaf.lims.service.UnreadService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by liuchao Li on 2019/05/28.
 */
@Service
@Transactional
public class UnreadServiceImpl extends AbstractService<Unread> implements UnreadService {
    @Resource
    private UnreadMapper unreadMapper;

}
