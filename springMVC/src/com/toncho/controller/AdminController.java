package com.toncho.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.toncho.dao.Criteria;
import com.toncho.dao.Page;
import com.toncho.dao.entity.TAdmin;
import com.toncho.dao.entity.TUser;
import com.toncho.service.api.AdminService;
import com.toncho.service.api.IUserService;

/**
 * Controller -管理员管理控制器
 * 
 * @author toncho
 *
 */
@Controller("AdminController")
@RequestMapping("/admin")
public class AdminController extends AbstractController {

	@Resource
	private AdminService adminService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(  ModelMap model) {
//      List<TUser> users = new ArrayList<>();
//      users = userService.findAllUsers();
//      model.addAttribute("users", users);
        
        return "admin/index";
    }
	
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String listAllUsers( TAdmin admin, ModelMap model) {
//		List<TUser> users = new ArrayList<>();
//		users = userService.findAllUsers();
//		model.addAttribute("users", users);
	    //TAdmin admin = new TAdmin();
	    int count = adminService.find(admin);
	    if (count>=1){
	        return "redirect:/product/list.do "; 
	    }else{
	        return "redirect:/ "; 
	    }
 
		
	}
	
	

}
