package edu.sjsu.library.entity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: simmathew
 * Date: 7/24/14
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Product {
    private Integer productId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public  String getDescription(){
        return "Product";
    }
}
