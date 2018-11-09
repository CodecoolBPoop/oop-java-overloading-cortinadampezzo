package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {

    private Date startDate;
    private Date endDate;

    public void schedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(
                "FeaturedProductCategory:" +
                        "id:" + getId() + "," +
                        "name:" + getName() + "," +
                        "department:" + getDepartment() + "," +
                        "description:" + getDescription() + "," +
                        "startdate:" + getStartDate() + "," +
                        "enddate:" + getEndDate()

        );
        return stringBuilder.toString();
    }

}
