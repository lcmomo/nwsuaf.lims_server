package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.ProducerMapper;
import cn.edu.nwsuaf.lims.model.Producer;
import cn.edu.nwsuaf.lims.service.ProducerService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by liuchao Li on 2019/05/21.
 */
@Service
@Transactional
public class ProducerServiceImpl extends AbstractService<Producer> implements ProducerService {
    @Resource
    private ProducerMapper producerMapper;

}
