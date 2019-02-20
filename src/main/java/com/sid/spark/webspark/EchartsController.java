package com.sid.spark.webspark;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Sky
 * create 2019/02/19
 * email sky.li@ixiaoshuidi.com
 **/
@RestController
public class EchartsController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {

        return "Hello Spring Boot!";

    }

    @RequestMapping(value = "/pie", method = RequestMethod.GET)
    public ModelAndView firstDemo() {

        return new ModelAndView("pie");//跟templates文件夹下的test.html名字一样，返回这个界面

    }

    @RequestMapping(value = "/bar", method = RequestMethod.GET)
    public ModelAndView secondDemo(ModelAndView modelAndView) {
        modelAndView.setViewName("bar");
        return modelAndView;
    }

    @RequestMapping(value = "/courseClickCount", method = RequestMethod.GET)
    public ModelAndView courseClickCountStat() {

        return new ModelAndView("demo");//跟templates文件夹下的demo.html名字一样，返回这个界面

    }

}
