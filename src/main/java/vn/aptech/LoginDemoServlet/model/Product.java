/*
 * © Copyright 2021 by AnhNBT™
 */
package vn.aptech.LoginDemoServlet.model;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 */
public class Product {
    private int id;
    private String name;
    private Double price;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String getPriceVND() {
        Locale localeVN = new Locale("vi", "VN");
        return NumberFormat.getCurrencyInstance(localeVN).format(price);
    }
    
}
