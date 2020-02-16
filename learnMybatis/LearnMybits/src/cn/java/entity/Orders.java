/**
 * Project Name:LearnMybits
 * File Name:Orders.java
 * Package Name:cn.java.dao.impl
 * Date:2020年2月15日下午3:11:54
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.entity;

/**
 * Description: <br/>
 * Date: 2020年2月15日 下午3:11:54 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Orders {
    private Long orderId;

    private String orderName;

    private Float price;

    private Long cusId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getCusId() {
        return cusId;
    }

    public void setCusId(Long cusId) {
        this.cusId = cusId;
    }

    @Override
    public String toString() {
        return "Orders [orderId=" + orderId + ", orderName=" + orderName + ", price=" + price + ", cusId=" + cusId
                + "]";
    }

}
