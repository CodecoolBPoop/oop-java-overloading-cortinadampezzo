package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {

    private static int counter = 0;
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList = new ArrayList<>();

    public Product() {
        this.id = counter++;
        productList.add(this);
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.id = counter++;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        productList.add(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public static List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> returnList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getProductCategory() == productCategory) {
                returnList.add(product);
            }
        }
        return returnList;
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> returnList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getSupplier() == supplier) {
                returnList.add(product);
            }
        }
        return returnList;
    }

    public String toString() {
        return "id:" + getId() + "," +
                "name:" + getName() + "," +
                "defaultprice:" + getDefaultPrice() + "," +
                "defaultcurrency:" + getDefaultCurrency() + "," +
                "productcategory:" + getProductCategory().getName() + "," +
                "supplier:" + getSupplier().getName();
    }

}
