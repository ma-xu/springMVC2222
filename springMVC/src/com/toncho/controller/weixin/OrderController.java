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
@Controller("WeixinOrderController")
@RequestMapping("/weixin/order")
public class OrderController extends AbstractController
{

    @Resource
    private IUserService userService;

   
    

}
