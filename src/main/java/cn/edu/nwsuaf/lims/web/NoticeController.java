package cn.edu.nwsuaf.lims.web;

import cn.edu.nwsuaf.lims.core.Result;
import cn.edu.nwsuaf.lims.core.ResultGenerator;
import cn.edu.nwsuaf.lims.model.Notice;
import cn.edu.nwsuaf.lims.service.NoticeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
* Created by liuchao Li on 2019/05/20.
*/
@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Resource
    private NoticeService noticeService;

    @PostMapping(value="/add")
    public Result add(@RequestBody Notice notice) {
            Date nowTime=new Date();

          notice.setNoticeTime(nowTime);
        noticeService.save(notice);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping(value="/delete")
    public Result delete(@RequestBody Notice notice) {
        noticeService.deleteById(notice.getId());
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping(value="/update")
    public Result update(@RequestBody Notice notice) {
        noticeService.update(notice);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("user/detail")
    public Result detail(@RequestBody Notice notic) {
        Notice notice = noticeService.findById(notic.getId());
        return ResultGenerator.genSuccessResult(notice);
    }

    @GetMapping(value="/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Notice> list = noticeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
