/**
 * Project Name:LearnMybits
 * File Name:Wife.java
 * Package Name:cn.java.entity
 * Date:2020年2月15日下午1:01:54
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.entity;

/**
 * Description: <br/>
 * Date: 2020年2月15日 下午1:01:54 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Wife {
    private Long wifeId;

    private String wifeName;

    private String sex;

    private Integer wifeAge;

    public Long getWifeId() {
        return wifeId;
    }

    public void setWifeId(Long wifeId) {
        this.wifeId = wifeId;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getWifeAge() {
        return wifeAge;
    }

    public void setWifeAge(Integer wifeAge) {
        this.wifeAge = wifeAge;
    }

    @Override
    public String toString() {
        return "Wife [wifeId=" + wifeId + ", wifeName=" + wifeName + ", sex=" + sex + ", wifeAge=" + wifeAge + "]";
    }

}
