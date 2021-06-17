package com.trungkhanh.cuoiky.Controller;

import com.trungkhanh.cuoiky.Entity.OrderDetail;
import com.trungkhanh.cuoiky.Repository.OrderDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class OrderDetailController {
    @Autowired
    private OrderDetailRepo orderDetailRepo;

//    @PostMapping(value = "/add")
//    public @ResponseBody String addNewOrder( @RequestParam String name, @RequestParam String quanity,
//                                            @RequestParam String price, @RequestParam String userID){
//        OrderDetail orderDetail = new OrderDetail();
//        orderDetail.setName(name);
//        orderDetail.setQuanity(quanity);
//        orderDetail.setPrice(price);
//        orderDetail.setUserId(userID);
//        orderDetailRepo.save(orderDetail);
//        return "saved";
//
//    }
    @PostMapping(value = "/add")
    @ResponseBody
    public OrderDetail addNewOrder(@RequestBody OrderDetail orderDetail){
        orderDetailRepo.save(orderDetail);
        return orderDetail;
    }


}
