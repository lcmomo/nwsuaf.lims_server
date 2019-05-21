package cn.edu.nwsuaf.lims.model;

import javax.persistence.*;

public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String instrumentno;

    @Column(name = "instru_name")
    private String instruName;

    private String platname;

    private String status;

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
     * @return instrumentno
     */
    public String getInstrumentno() {
        return instrumentno;
    }

    /**
     * @param instrumentno
     */
    public void setInstrumentno(String instrumentno) {
        this.instrumentno = instrumentno;
    }

    /**
     * @return instru_name
     */
    public String getInstruName() {
        return instruName;
    }

    /**
     * @param instruName
     */
    public void setInstruName(String instruName) {
        this.instruName = instruName;
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
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
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