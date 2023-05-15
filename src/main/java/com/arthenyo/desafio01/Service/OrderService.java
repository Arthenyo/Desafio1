package com.arthenyo.desafio01.Service;

import com.arthenyo.desafio01.Entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;
    public Double total(Order order){
        var precototal =
                order.getBasic() - (order.getBasic() * (order.getDiscount()/100)) +
                        shippingService.shipment(order);
        return precototal;
    }
}
