package com.toncho.controller.weixin;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toncho.controller.AbstractController;
import com.toncho.dao.entity.TProduct;
import com.toncho.dao.entity.TUser;
import com.toncho.service.api.IUserService;
import com.toncho.util.JsonUtils;

/**
 * Controller - 微信用户管理控制器
 * 
 * @author renyi
 */
@Controller("WeixinUserController")
@RequestMapping("/weixin/user")
public class UserController extends AbstractController
{

    @Resource
    private IUserService userService;

    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(  ModelMap model) {
        
            return "weixin/login"; 
       
    }
    
    

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login( TUser user, ModelMap model) {
        int count = userService.find(user);
        if (count<1){
            return "redirect:/weixin/user/index.do";
        }
        TUser loginUser = userService.findUser(user);
        Long userId = loginUser.getUserid();
        if (count>=1){
            model.addAttribute("userId", userId);
            return "redirect:/weixin/product/list.do"; 
        }else{
            return "redirect:/weixin/user/index.do"; 
        }      
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(  ModelMap model) {
        
            return "weixin/register"; 
       
    }
    
    
    /**
     * ajax根据ID名称搜索优惠券
     * 
     */
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void signup(TUser user, HttpServletResponse response)
    {   
        int count = userService.save(user);
        try
        {
            response.setContentType("text/html; charset=UTF-8");
            JsonUtils.writeValue(response.getWriter(), count);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    

}
