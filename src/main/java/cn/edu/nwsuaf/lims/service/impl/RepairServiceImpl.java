package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.RepairMapper;
import cn.edu.nwsuaf.lims.model.Repair;
import cn.edu.nwsuaf.lims.service.RepairService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by liuchao Li on 2019/05/22.
 */
@Service
@Transactional
public class RepairServiceImpl extends AbstractService<Repair> implements RepairService {
    @Resource
    private RepairMapper repairMapper;

}
