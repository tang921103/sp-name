package com.spdemo.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:conf.properties")
@ConfigurationProperties(prefix="goods")
@Component
public class Goods {
    @Value("${goods.prices}")
    private String price;
    @Value("${goods.nums}")
    private String num;

    @Override
    public String toString() {
        return "Goods{" +
                "price='" + price + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
