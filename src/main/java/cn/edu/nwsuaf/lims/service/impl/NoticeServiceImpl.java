package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.NoticeMapper;
import cn.edu.nwsuaf.lims.model.Notice;
import cn.edu.nwsuaf.lims.service.NoticeService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by liuchao Li on 2019/05/20.
 */
@Service
@Transactional
public class NoticeServiceImpl extends AbstractService<Notice> implements NoticeService {
    @Resource
    private NoticeMapper noticeMapper;

}
