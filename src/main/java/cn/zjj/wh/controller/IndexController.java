package cn.zjj.wh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
* @ClassName: IndexController  
* @Description: TODO(工作助手首页)  
* @author Jack 
* @date 2018年7月6日 下午7:21:35  
*
 */
@Controller
@RequestMapping(value = {"","/","list"})
public class IndexController {

	@RequestMapping(value = {"","/","index"})
	 public String Index(){
	        return "/index/index";
	    }
}
