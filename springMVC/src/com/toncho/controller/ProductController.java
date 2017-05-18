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
import com.toncho.dao.entity.TProduct;
import com.toncho.dao.entity.TUser;
import com.toncho.service.api.CouponService;
import com.toncho.service.api.IUserService;
import com.toncho.service.api.ProductService;
import com.toncho.util.JsonUtils;

/**
 * Controller - 产品管理控制器
 * 
 * @author renyi
 *
 */
@Controller("ProductController")
@RequestMapping("/product")
public class ProductController extends AbstractController {

	@Resource
	private CouponService couponService;
	
	@Resource
    private ProductService productService;

	/**
	 * 所有列表
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list( String type,ModelMap model) {
		List<TProduct> products = new ArrayList<>();
		products = productService.findByType(type);
		model.addAttribute("products", products);
		return "product/productList";
	}
	
	
	/**
    * ajax根据ID名称搜索优惠券
    * 
    */
   @RequestMapping(value = "/edit", method = RequestMethod.POST)
   public void searchApp(Long id, HttpServletResponse response)
   {   
       
       
       
       
       TProduct product = new TProduct();
       
       product=productService.getById(id);
       
       try
       {
           response.setContentType("text/html; charset=UTF-8");
           JsonUtils.writeValue(response.getWriter(), product);
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
   
   
   
   
   
   @RequestMapping(value = "/insert", method = RequestMethod.POST)
   public void insert(TProduct product, HttpServletResponse response)
   {   

       try
       {
           
            int info = productService.save(product);
           
           
           
           
           response.setContentType("text/html; charset=UTF-8");
           JsonUtils.writeValue(response.getWriter(), info);
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
	
	
	
	
   
   
   @RequestMapping(value = "/update", method = RequestMethod.POST)
   public void update(TProduct product, HttpServletResponse response)
   {   
       try
       {
            int info = productService.update(product);
           response.setContentType("text/html; charset=UTF-8");
           JsonUtils.writeValue(response.getWriter(), info);
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
    
	
	
   @RequestMapping(value = "/delete", method = RequestMethod.POST)
   public void delete(Long id, HttpServletResponse response)
   {   
       try
       {
           int info = productService.delete(id);
           response.setContentType("text/html; charset=UTF-8");
           JsonUtils.writeValue(response.getWriter(), info);
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
	
	
	
	
	

}
