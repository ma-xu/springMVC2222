package com.toncho.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toncho.dao.Criteria;
import com.toncho.dao.Page;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TUser;
import com.toncho.service.api.CouponService;
import com.toncho.service.api.IUserService;
import com.toncho.util.JsonUtils;

/**
 * Controller - 优惠券管理控制器
 * 
 * @author renyi
 *
 */
@Controller("CouponController")
@RequestMapping("/coupon")
public class CouponController extends AbstractController {

	@Resource
	private CouponService couponService;

	/**
	 * 所有列表
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(ModelMap model) {
		List<TCoupon> coupons = new ArrayList<>();
		coupons = couponService.findAll();
		model.addAttribute("coupons", coupons);
		return "coupon/couponList";
	}
	
	
	/**
    * ajax根据ID名称搜索优惠券
    * 
    */
   @RequestMapping(value = "/edit", method = RequestMethod.POST)
   public void searchApp(Long id, HttpServletResponse response)
   {   
       
       
       
       
       TCoupon coupon = new TCoupon();
       
       coupon=couponService.getById(id);
       
       try
       {
           response.setContentType("text/html; charset=UTF-8");
           JsonUtils.writeValue(response.getWriter(), coupon);
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
   
   
   
   
   
   @RequestMapping(value = "/insert", method = RequestMethod.POST)
   public void insert(TCoupon coupon, HttpServletResponse response)
   {   
       
       
       
      
       
       try
       {
           
            int info = couponService.save(coupon);
           
           
           
           
           response.setContentType("text/html; charset=UTF-8");
           JsonUtils.writeValue(response.getWriter(), info);
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
	
	
	
	
   
   
   @RequestMapping(value = "/update", method = RequestMethod.POST)
   public void update(TCoupon coupon, HttpServletResponse response)
   {   
       try
       {
            int info = couponService.update(coupon);
           response.setContentType("text/html; charset=UTF-8");
           JsonUtils.writeValue(response.getWriter(), info);
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
    
	
	
   @RequestMapping(value = "/delete", method = RequestMethod.POST)
   public void delete(Long couponID, HttpServletResponse response)
   {   
       try
       {
            int info = couponService.delete(couponID);
           response.setContentType("text/html; charset=UTF-8");
           JsonUtils.writeValue(response.getWriter(), info);
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
	
	
	
	
	

}
