package cn.edu.nwsuaf.lims.model;

import javax.persistence.*;

public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String supplierno;

    @Column(name = "supp_name")
    private String suppName;

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
     * @return supplierno
     */
    public String getSupplierno() {
        return supplierno;
    }

    /**
     * @param supplierno
     */
    public void setSupplierno(String supplierno) {
        this.supplierno = supplierno;
    }

    /**
     * @return supp_name
     */
    public String getSuppName() {
        return suppName;
    }

    /**
     * @param suppName
     */
    public void setSuppName(String suppName) {
        this.suppName = suppName;
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