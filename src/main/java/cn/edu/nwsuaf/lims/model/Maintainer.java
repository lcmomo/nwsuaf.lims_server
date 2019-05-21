package cn.edu.nwsuaf.lims.model;

import javax.persistence.*;

public class Maintainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String maintainerno;

    @Column(name = "maintainer_name")
    private String maintainerName;

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
     * @return maintainerno
     */
    public String getMaintainerno() {
        return maintainerno;
    }

    /**
     * @param maintainerno
     */
    public void setMaintainerno(String maintainerno) {
        this.maintainerno = maintainerno;
    }

    /**
     * @return maintainer_name
     */
    public String getMaintainerName() {
        return maintainerName;
    }

    /**
     * @param maintainerName
     */
    public void setMaintainerName(String maintainerName) {
        this.maintainerName = maintainerName;
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