package com.arthenyo.desafio01.Service;

import com.arthenyo.desafio01.Entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order){

        var frete = 0.00;
        if(order.getBasic() < 100.00){
            frete = 20;
        }else if(order.getBasic() < 200.00){
            frete = 12;
        }

        return frete;
    }
}
