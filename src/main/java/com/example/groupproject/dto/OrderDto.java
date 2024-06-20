package com.example.groupproject.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Data
@Builder
public class OrderDto {
    private int order_id;
    private int user_id;
    private int cart_id;
    private double order_total;
    private int order_quantity;
    private String order_status;
    private List<ProductDto> products;

    public OrderDto(int user_id, int order_id, int cart_id, double order_total, int order_quantity, String order_status, List<ProductDto> products) {
        this.user_id = user_id;
        this.order_id = order_id;
        this.cart_id = cart_id;
        this.order_total = order_total;
        this.order_quantity = order_quantity;
        this.order_status = order_status;
        this.products = products;
    }

    public OrderDto() {

    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public double getOrder_total() {
        return order_total;
    }

    public void setOrder_total(double order_total) {
        this.order_total = order_total;
    }

    public int getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(int order_quantity) {
        this.order_quantity = order_quantity;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}
