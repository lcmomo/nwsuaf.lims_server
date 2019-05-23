package cn.edu.nwsuaf.lims.model;

import java.util.Date;
import javax.persistence.*;

public class Repair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String repairno;

    @Column(name = "instr_name")
    private String instrName;

    @Column(name = "hitch_cate")
    private String hitchCate;

    @Column(name = "plat_name")
    private String platName;

    @Column(name = "maintainer_name")
    private String maintainerName;

    @Column(name = "repair_time")
    private Date repairTime;

    private String operator;

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
     * @return repairno
     */
    public String getRepairno() {
        return repairno;
    }

    /**
     * @param repairno
     */
    public void setRepairno(String repairno) {
        this.repairno = repairno;
    }

    /**
     * @return instr_name
     */
    public String getInstrName() {
        return instrName;
    }

    /**
     * @param instrName
     */
    public void setInstrName(String instrName) {
        this.instrName = instrName;
    }

    /**
     * @return hitch_cate
     */
    public String getHitchCate() {
        return hitchCate;
    }

    /**
     * @param hitchCate
     */
    public void setHitchCate(String hitchCate) {
        this.hitchCate = hitchCate;
    }

    /**
     * @return plat_name
     */
    public String getPlatName() {
        return platName;
    }

    /**
     * @param platName
     */
    public void setPlatName(String platName) {
        this.platName = platName;
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
     * @return repair_time
     */
    public Date getRepairTime() {
        return repairTime;
    }

    /**
     * @param repairTime
     */
    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
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