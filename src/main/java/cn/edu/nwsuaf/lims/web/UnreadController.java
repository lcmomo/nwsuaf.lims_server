package cn.edu.nwsuaf.lims.web;

import cn.edu.nwsuaf.lims.core.Result;
import cn.edu.nwsuaf.lims.core.ResultGenerator;
import cn.edu.nwsuaf.lims.model.Unread;
import cn.edu.nwsuaf.lims.service.UnreadService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by liuchao Li on 2019/05/28.
*/
@RestController
@RequestMapping("/unread")
public class UnreadController {
    @Resource
    private UnreadService unreadService;

    @PostMapping("/add")
    public Result add(@RequestBody Unread unread) {
        unreadService.save(unread);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Unread unread) {
        unreadService.deleteById(unread.getId());
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Unread unread) {
        unreadService.update(unread);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam(defaultValue = "0") Integer id) {
        Unread unread = unreadService.findById(id);
        return ResultGenerator.genSuccessResult(unread);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Unread> list = unreadService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping(value="/find")
    public Result findByusername(@RequestParam(defaultValue = "") String username)

    {

       List<Unread> list=unreadService.findByusername(username);

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

}
