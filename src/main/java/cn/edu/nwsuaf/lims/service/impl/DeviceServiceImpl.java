package cn.edu.nwsuaf.lims.service.impl;

import cn.edu.nwsuaf.lims.dao.DeviceMapper;
import cn.edu.nwsuaf.lims.model.Device;
import cn.edu.nwsuaf.lims.service.DeviceService;
import cn.edu.nwsuaf.lims.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by liuchao Li on 2019/05/21.
 */
@Service
@Transactional
public class DeviceServiceImpl extends AbstractService<Device> implements DeviceService {
    @Resource
    private DeviceMapper deviceMapper;

}
