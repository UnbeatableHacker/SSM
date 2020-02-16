/**
 * Project Name:LearnMybits
 * File Name:Caipin.java
 * Package Name:cn.java.entity
 * Date:2020年2月13日下午12:56:33
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.entity;

/**
 * Description: <br/>
 * Date: 2020年2月13日 下午12:56:33 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Caipin {

    private int id;

    private String foodName;

    private Float price;

    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Caipin [id=" + id + ", foodName=" + foodName + ", price=" + price + ", description=" + description
                + "]";
    }

}
