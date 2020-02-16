/**
 * Project Name:LearnMybits
 * File Name:Computer.java
 * Package Name:cn.java.entity
 * Date:2020年2月16日上午9:59:39
 * Copyright (c) 2020, bluemobi All Rights Reserved.
 *
*/

package cn.java.entity;

/**
 * Description: <br/>
 * Date: 2020年2月16日 上午9:59:39 <br/>
 * 
 * @author songXZ
 * @version
 * @see
 */
public class Computer {
    private Long id;

    private String brand;

    private Float memory;

    private String system;

    private Float price;

    private String cpu;

    public Computer() {

    }

    public Computer(Long id, String brand, Float memory, String system, Float price, String cpu) {
        super();
        this.id = id;
        this.brand = brand;
        this.memory = memory;
        this.system = system;
        this.price = price;
        this.cpu = cpu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Float getMemory() {
        return memory;
    }

    public void setMemory(Float memory) {
        this.memory = memory;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer [id=" + id + ", brand=" + brand + ", memory=" + memory + ", system=" + system + ", price="
                + price + ", cpu=" + cpu + "]";
    }

}
