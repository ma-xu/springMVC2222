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
import com.toncho.dao.entity.TAddress;
import com.toncho.dao.entity.TCart;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TProduct;
import com.toncho.dao.map.CartMap;
import com.toncho.service.api.AddressService;
import com.toncho.service.api.CartService;
import com.toncho.service.api.CouponService;
import com.toncho.util.JsonUtils;

/**
 * Controller - 微信地址管理控制器
 * 
 * @author renyi
 */
@Controller("WeixinAddressController")
@RequestMapping("/weixin/address")
public class AddressController extends AbstractController
{

    @Resource
    private AddressService addressService;

    /**
     * ajax根据添加地址
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(TAddress addr, HttpServletResponse response)
    {
        int count = addressService.save(addr);
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
     * ajax根据删除地址
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(Long id, HttpServletResponse response)
    {
        int count = addressService.delete(id);
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
    public String list(Long userId, ModelMap model)
    {
        List<TAddress> addresses = new ArrayList<>();
        addresses = addressService.findMapbyUserId(userId);
        model.addAttribute("addresses", addresses);
        model.addAttribute("userId", userId);
        return "weixin/addressList";
    }
}
