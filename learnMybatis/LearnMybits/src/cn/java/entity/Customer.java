/**
 * Project Name:LearnMybits
 * File Name:Customer.java
 * Package Name:cn.java.dao.impl
 * Date:2020年2月15日下午3:10:33
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.entity;

import java.util.List;

/**
 * Description: <br/>
 * Date: 2020年2月15日 下午3:10:33 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Customer {
    private Long customerId;

    private String customerName;

    private List<Orders> orderList;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Orders> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", orderList=" + orderList
                + "]";
    }

}
