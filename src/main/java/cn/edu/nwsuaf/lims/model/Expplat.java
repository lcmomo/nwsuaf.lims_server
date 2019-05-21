package cn.edu.nwsuaf.lims.model;

import javax.persistence.*;

public class Expplat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String platno;

    private String platname;

    private String manager;

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
     * @return platno
     */
    public String getPlatno() {
        return platno;
    }

    /**
     * @param platno
     */
    public void setPlatno(String platno) {
        this.platno = platno;
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
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * @param manager
     */
    public void setManager(String manager) {
        this.manager = manager;
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