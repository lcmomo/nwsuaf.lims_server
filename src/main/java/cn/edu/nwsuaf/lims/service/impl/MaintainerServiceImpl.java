package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.MaintainerMapper;
import cn.edu.nwsuaf.lims.model.Maintainer;
import cn.edu.nwsuaf.lims.service.MaintainerService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by liuchao Li on 2019/05/21.
 */
@Service
@Transactional
public class MaintainerServiceImpl extends AbstractService<Maintainer> implements MaintainerService {
    @Resource
    private MaintainerMapper maintainerMapper;

}
