package edu.sjsu.library.decorator;

import edu.sjsu.library.entity.Product;

/**
 * Created with IntelliJ IDEA.
 * User: simmathew
 * Date: 7/24/14
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class ProductDecorator extends Product {
    public abstract String getDescription();

}
