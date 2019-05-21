package cn.edu.nwsuaf.lims.model;

import javax.persistence.*;

public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String producerno;

    @Column(name = "pro_name")
    private String proName;

    private String phone;

    private String address;

    private String remark;

    private String linkman;

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
     * @return producerno
     */
    public String getProducerno() {
        return producerno;
    }

    /**
     * @param producerno
     */
    public void setProducerno(String producerno) {
        this.producerno = producerno;
    }

    /**
     * @return pro_name
     */
    public String getProName() {
        return proName;
    }

    /**
     * @param proName
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
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

    /**
     * @return linkman
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * @param linkman
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }
}