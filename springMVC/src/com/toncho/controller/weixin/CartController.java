package com.toncho.controller.weixin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toncho.controller.AbstractController;
import com.toncho.dao.entity.TCart;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TProduct;
import com.toncho.dao.map.CartMap;
import com.toncho.service.api.CartService;
import com.toncho.service.api.CouponService;
import com.toncho.util.JsonUtils;

/**
 * Controller - 微信购物车管理控制器
 * 
 * @author renyi
 */
@Controller("WeixinCartController")
@RequestMapping("/weixin/cart")
public class CartController extends AbstractController
{

    @Resource
    private CartService cartService;
    
    @Resource
    private CouponService couponService;

    /**
     * ajax根据添加购物车
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(TCart cart, HttpServletResponse response)
    {
        int count = cartService.save(cart);
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
     * ajax根据添加购物车
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(Long id, HttpServletResponse response)
    {
        int count = cartService.delete(id);
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
    
    
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Long userId,ModelMap model)
    {
        List<CartMap> cartMaps = new ArrayList<>();
        cartMaps = cartService.findMapbyUserId(userId);
        model.addAttribute("cartMaps", cartMaps);
        
       float totalMount = 0;
       for(CartMap cartMap :cartMaps){
           totalMount+=cartMap.getProductPrice();
       }
      
       List<TCoupon> coupons = couponService.findAll();
       if(totalMount <1000){
           for(TCoupon coupon:coupons){
               if(Long.parseLong(coupon.getType())==1000){
                   coupons.remove(coupon);
               }
           }
       }
       if(totalMount <500){
           for(TCoupon coupon:coupons){
               if(Long.parseLong(coupon.getType())==500){
                   coupons.remove(coupon);
               }
           }
       }
       if(totalMount <100){
           for(TCoupon coupon:coupons){
               if(Long.parseLong(coupon.getType())==100){
                   coupons.remove(coupon);
               }
           }
       }
       if(totalMount <50){
           for(TCoupon coupon:coupons){
               if(Long.parseLong(coupon.getType())==50){
                   coupons.remove(coupon);
               }
           }
       }
           
       
       float reduceMount = 0;
       if(coupons.size()==0){
           model.addAttribute("tips", "您无优惠券可用。");  
       }
       else{
           TCoupon canuseCoupon= new TCoupon();
           for(TCoupon coupon:coupons){
               if(coupon.getAmount()>reduceMount){
                   reduceMount = coupon.getAmount();
                   canuseCoupon=coupon;
               }
           }
           model.addAttribute("tips", "您可用一张满"+canuseCoupon.getType()+"元减"+canuseCoupon.getAmount()+"元优惠券。");  
       }
       
       model.addAttribute("reduceMount", reduceMount);
       model.addAttribute("finalMount", totalMount-reduceMount);
       model.addAttribute("totalMount", totalMount);
       model.addAttribute("userId", userId);
        
       return "weixin/cartList";
        
        
    }
}
