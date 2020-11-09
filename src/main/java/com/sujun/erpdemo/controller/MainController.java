package com.sujun.erpdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 在我们访问  http://主机名：端口号/context-path/Controller的URI/方法的URI
 * http://localhost:80/boot/user/list
 * @author Administrator
 * @Controller 加入Spring容器管理,单例
 */
@Controller
public class MainController {

    /**
     * String 类型的返回值，会找模板文件
     *
     *   context/ + /user +  /list
     *   context/ + list
     * @return
     */
    @RequestMapping("/list")
//    @ResponseBody  //json格式返回
    public String list(ModelMap map) {

        return "list";
    }
}