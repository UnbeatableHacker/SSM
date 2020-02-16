/**
 * Project Name:LearnMybits
 * File Name:Husband.java
 * Package Name:cn.java.entity
 * Date:2020年2月15日下午12:58:34
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.entity;

/**
 * Description: <br/>
 * Date: 2020年2月15日 下午12:58:34 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Husband {
    private Long husbandId;

    private String husName;

    private String gender;

    private Integer husAge;

    private Wife wife;

    private Long wifeId;

    public Long getHusbandId() {
        return husbandId;
    }

    public void setHusbandId(Long husbandId) {
        this.husbandId = husbandId;
    }

    public String getHusName() {
        return husName;
    }

    public void setHusName(String husName) {
        this.husName = husName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getHusAge() {
        return husAge;
    }

    public void setHusAge(Integer husAge) {
        this.husAge = husAge;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public Long getWifeId() {
        return wifeId;
    }

    public void setWifeId(Long wifeId) {
        this.wifeId = wifeId;
    }

    @Override
    public String toString() {
        return "Husband [husbandId=" + husbandId + ", husName=" + husName + ", gender=" + gender + ", husAge=" + husAge
                + ", wife=" + wife + ", wifeId=" + wifeId + "]";
    }

}
