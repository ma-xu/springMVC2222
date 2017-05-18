package com.toncho.controller.weixin;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toncho.controller.AbstractController;
import com.toncho.dao.Criteria;
import com.toncho.dao.Page;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TUser;
import com.toncho.service.api.CouponService;
import com.toncho.service.api.IUserService;

/**
 * Controller - 微信管理控制器
 * 
 * @author renyi
 */
@Controller("WeixinCouPonController")
@RequestMapping("/weixin/coupon")
public class CouponController extends AbstractController
{

    @Resource
    private IUserService userService;
    @Resource
    private CouponService couponService;
   

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listCoupon(Long userId, ModelMap model)
    {
        List<TCoupon> coupons = new ArrayList<>();
        coupons = couponService.findAll();
        model.addAttribute("coupons", coupons);
        model.addAttribute("userId", userId);
        return "weixin/couponList";
    }

}
