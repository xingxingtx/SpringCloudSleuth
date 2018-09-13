package userservice.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/13.
 */
@RestController
public class UserController {

    @RequestMapping("/user/hi")
    public String hi(){
        return "I'm forezp";
    }
}
