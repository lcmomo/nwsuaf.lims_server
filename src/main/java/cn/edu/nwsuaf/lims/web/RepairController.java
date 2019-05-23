package cn.edu.nwsuaf.lims.web;

import cn.edu.nwsuaf.lims.core.Result;
import cn.edu.nwsuaf.lims.core.ResultGenerator;
import cn.edu.nwsuaf.lims.model.Repair;
import cn.edu.nwsuaf.lims.service.RepairService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by liuchao Li on 2019/05/22.
*/
@RestController
@RequestMapping("/repair")
public class RepairController {
    @Resource
    private RepairService repairService;

    @PostMapping("/add")
    public Result add(@RequestBody Repair repair) {
        repairService.save(repair);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Repair repair) {
        repairService.deleteById(repair.getId());
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Repair repair) {
        repairService.update(repair);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam(defaultValue = "0") Integer id) {
        Repair repair = repairService.findById(id);
        return ResultGenerator.genSuccessResult(repair);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Repair> list = repairService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
