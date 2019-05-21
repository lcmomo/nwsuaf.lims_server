package cn.edu.nwsuaf.lims.web;

import cn.edu.nwsuaf.lims.core.Result;
import cn.edu.nwsuaf.lims.core.ResultGenerator;
import cn.edu.nwsuaf.lims.model.Maintainer;
import cn.edu.nwsuaf.lims.service.MaintainerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by liuchao Li on 2019/05/21.
*/
@RestController
@RequestMapping("/maintainer")
public class MaintainerController {
    @Resource
    private MaintainerService maintainerService;

    @PostMapping("/add")
    public Result add(@RequestBody Maintainer maintainer) {
        maintainerService.save(maintainer);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Maintainer maintainer) {
        maintainerService.deleteById(maintainer.getId());
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Maintainer maintainer) {
        maintainerService.update(maintainer);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam(defaultValue = "1") Integer id) {
        Maintainer maintainer = maintainerService.findById(id);
        return ResultGenerator.genSuccessResult(maintainer);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Maintainer> list = maintainerService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
