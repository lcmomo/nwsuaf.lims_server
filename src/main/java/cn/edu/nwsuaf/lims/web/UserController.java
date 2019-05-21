package cn.edu.nwsuaf.lims.web;

import cn.edu.nwsuaf.lims.core.Result;
import cn.edu.nwsuaf.lims.core.ResultGenerator;
import cn.edu.nwsuaf.lims.model.User;
import cn.edu.nwsuaf.lims.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
* Created by liuchao Li on 2019/05/12.
*/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping(value="/add")
    public Result add(@RequestBody User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody User user) {
        userService.deleteById(user.getId());
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestBody User user) {
        System.out.println(user.getEmail());
        userService.update(user);
        //userService.findById(user.getId());
       // User u=userService.findById(user.getId());
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam(defaultValue = "0") Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping(value="login")
//    public Result login(@RequestParam(name="username")String username,@RequestParam(name="password")String password
//                        )
    public Result login(@RequestBody User use)

    {
       String username=use.getUsername();
       String password=use.getPassword();
        //System.out.println(username);
            User user=userService.login(username,password);
            long  redate=new Date().getTime();
            user.setRedate(redate);
            System.out.println((user.getUsername()));
            if(user!=null){
                return ResultGenerator.genSuccessResult(user);
            }else{
                return ResultGenerator.genFailResult("用户名或密码错误");
            }
    }
}
