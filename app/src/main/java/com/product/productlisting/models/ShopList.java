package com.product.productlisting.models;

import java.io.Serializable;

public class ShopList  implements Serializable {

    private String product_id;

    private String product_name;

    private String product_special;

    private String product_status;

    private String rating;

    private String expected_delivery_time;

    private String price;

    private int product_image;

    public ShopList(String product_id, String product_name, String product_special, String product_status, String rating, String expected_delivery_time, String price, int product_image) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_special = product_special;
        this.product_status = product_status;
        this.rating = rating;
        this.expected_delivery_time = expected_delivery_time;
        this.price = price;
        this.product_image = product_image;
    }

    public String getProduct_special() {
        return product_special;
    }

    public void setProduct_special(String product_special) {
        this.product_special = product_special;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getExpected_delivery_time() {
        return expected_delivery_time;
    }

    public void setExpected_delivery_time(String expected_delivery_time) {
        this.expected_delivery_time = expected_delivery_time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProduct_status() {
        return product_status;
    }

    public void setProduct_status(String product_status) {
        this.product_status = product_status;
    }

    public int getProduct_image() {
        return product_image;
    }

    public void setProduct_image(int product_image) {
        this.product_image = product_image;
    }
}
