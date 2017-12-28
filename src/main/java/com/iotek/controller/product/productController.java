package com.iotek.controller.product;

import com.iotek.po.Product;
import com.iotek.po.ProductDetail;
import com.iotek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/12/27.
 */
@Controller
@RequestMapping(value = "product")
public class productController {
    @Autowired
    ProductService productService;


    @RequestMapping(value = "/manager.view", method = RequestMethod.GET)
    public String productScan() {
        return "product/manager";
    }

    @RequestMapping(value = "/lookProduct.view", method = RequestMethod.GET)
    public String lookProduct(Model model) {

        List<Product> productList = productService.queryAll();
        System.out.println(productList);
        model.addAttribute("productList", productList);
        return "product/queryProductAll";

    }

    @RequestMapping(value = "/addProduct.view", method = RequestMethod.GET)
    public String addProduct(@ModelAttribute Product product,
                             @ModelAttribute ProductDetail productDetail
    ) {

        return "";
    }
}
