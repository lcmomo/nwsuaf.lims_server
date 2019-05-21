package cn.edu.nwsuaf.lims.model;

import javax.persistence.*;

public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String consumeno;

    @Column(name = "consume_name")
    private String consumeName;

    private String specs;

    private String producer;

    private Integer amount;

    private Integer price;

    @Column(name = "total_price")
    private Integer totalPrice;

    private String supplyer;

    private String category;

    private String platname;

    private String remark;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return consumeno
     */
    public String getConsumeno() {
        return consumeno;
    }

    /**
     * @param consumeno
     */
    public void setConsumeno(String consumeno) {
        this.consumeno = consumeno;
    }

    /**
     * @return consume_name
     */
    public String getConsumeName() {
        return consumeName;
    }

    /**
     * @param consumeName
     */
    public void setConsumeName(String consumeName) {
        this.consumeName = consumeName;
    }

    /**
     * @return specs
     */
    public String getSpecs() {
        return specs;
    }

    /**
     * @param specs
     */
    public void setSpecs(String specs) {
        this.specs = specs;
    }

    /**
     * @return producer
     */
    public String getProducer() {
        return producer;
    }

    /**
     * @param producer
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return total_price
     */
    public Integer getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice
     */
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return supplyer
     */
    public String getSupplyer() {
        return supplyer;
    }

    /**
     * @param supplyer
     */
    public void setSupplyer(String supplyer) {
        this.supplyer = supplyer;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return platname
     */
    public String getPlatname() {
        return platname;
    }

    /**
     * @param platname
     */
    public void setPlatname(String platname) {
        this.platname = platname;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}