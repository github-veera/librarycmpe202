package edu.sjsu.library.decorator;

import edu.sjsu.library.entity.Product;

/**
 * Created with IntelliJ IDEA.
 * User: simmathew
 * Date: 7/24/14
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Borrowable extends ProductDecorator {
    Product product;

    public Borrowable(Product product){
          this.product = product;
    }

    @Override
    public String getDescription() {
        return "Borrowable " +product.getDescription();
    }

    public void borrow(){

    }

    public void returnProduct(){

    }

}
