package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.PrimitiveIterator;

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
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
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
        for (Product product : productList) {
            if (product.getProductCategory() == productCategory) {
                productList.add(product);
            }
        }
        return productList;
    }

    public static List<Product> getAllProductsBy(Supplier supplier) {
        for (Product product : productList) {
            if (product.getSupplier() == supplier) {
                productList.add(product);
            }
        }
        return productList;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(
                "id:" + getId() + "," +
                "name:" + getName() + "," +
                "defaultprice:" + getDefaultPrice() + "," +
                "defaultcurrency:" + getDefaultCurrency() + "," +
                "productcategory:" + getProductCategory().getName() + "," +
                "supplier:" + getSupplier().getName()
        );
        return stringBuilder.toString();
    }

}
