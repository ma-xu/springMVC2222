package com.toncho.controller.weixin;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toncho.controller.AbstractController;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TProduct;
import com.toncho.service.api.ProductService;

/**
 * Controller - 微信商品管理控制器
 * 
 * @author renyi
 */
@Controller("WeixinProductController")
@RequestMapping("/weixin/product")
public class ProductController extends AbstractController
{

    @Resource
    private ProductService productService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listCoupon(Long userId,ModelMap model)
    {
        List<TProduct> products = new ArrayList<>();
        products = productService.findByType(null);
        model.addAttribute("products", products);
        model.addAttribute("userId", userId);
        return "weixin/productList";
    }

}
