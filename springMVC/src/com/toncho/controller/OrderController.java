package com.toncho.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toncho.dao.entity.TAddress;
import com.toncho.dao.entity.TOrder;
import com.toncho.dao.entity.TProduct;
import com.toncho.dao.entity.TUser;
import com.toncho.dao.map.OrderMap;
import com.toncho.service.api.AddressService;
import com.toncho.service.api.CartService;
import com.toncho.service.api.IUserService;
import com.toncho.service.api.OrderService;
import com.toncho.util.JsonUtils;

/**
 * Controller - 微信用户管理控制器
 * 
 * @author renyi
 */
@Controller("OrderController")
@RequestMapping("/order")
public class OrderController extends AbstractController
{

    @Resource
    private OrderService orderService;
    
    @Resource
    private CartService cartService;
    @Resource
    private IUserService userService;
    @Resource
    private AddressService addressService;
    
    
    
    /**
     * 生成订单
     * 
     */
    @RequestMapping(value = "/paymoney", method = RequestMethod.POST)
    public void paymoney(TOrder order, HttpServletResponse response)
    {   
        
        order.setDate(new Date().toString());
        int count = orderService.save(order);
        
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
    
    
    /**
     * 生成订单
     * 
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(Long id, HttpServletResponse response)
    {   
        int count = orderService.delete(id);
        
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

   
    
    /**
     * 所有列表
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(ModelMap model) {
       List<TOrder> orders = orderService.findAll();
       List<OrderMap> orderMaps = new ArrayList<OrderMap>();
       for(TOrder order:orders){
           OrderMap orderMap = new OrderMap();
           Long userId = order.getUserId();
           List<TAddress> addresses = addressService.findMapbyUserId(userId);
           if(addresses!=null && addresses.size()>0){
               orderMap.setAddress(addresses.get(0).getAddress());
           }else{
               orderMap.setAddress("地址暂未填写");
           }
           
           TUser user =userService.findById(userId);
           
           orderMap.setDate(order.getDate());
           orderMap.setId(order.getId());
           orderMap.setMoney(order.getMoney());
           orderMap.setUsername(user.getUsername());
           orderMaps.add(orderMap);
       }
        model.addAttribute("orderMaps", orderMaps);
        return "order/orderList";
    }
    

}
