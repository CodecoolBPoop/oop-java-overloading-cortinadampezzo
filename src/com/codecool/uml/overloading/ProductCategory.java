package com.codecool.uml.overloading;

import java.util.List;

public class ProductCategory {

    private static int counter = 0;
    private int id;
    private String name;
    private String department;
    private String description;

    public ProductCategory() {
        this.id = counter++;
    }

    public ProductCategory(String name, String department, String description) {
        this.id = counter++;
        this.name = name;
        this.department = department;
        this.description = description;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    public String toString() {
        return "id:" + getId() + "," +
                "name:" + getName() + "," +
                "department:" + getDepartment() + "," +
                "description:" + getDescription();
    }

}
