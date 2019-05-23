package cn.edu.nwsuaf.lims.model;

import java.util.Date;
import javax.persistence.*;

public class Appoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String orderno;

    private String username;

    @Column(name = "instr_name")
    private String instrName;

    @Column(name = "order_time")
    private Date orderTime;

    @Column(name = "use_starttime")
    private Date useStarttime;

    @Column(name = "use_endtime")
    private Date useEndtime;

    private String status;

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
     * @return orderno
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * @param orderno
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
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
     * @return order_time
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * @param orderTime
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * @return use_starttime
     */
    public Date getUseStarttime() {
        return useStarttime;
    }

    /**
     * @param useStarttime
     */
    public void setUseStarttime(Date useStarttime) {
        this.useStarttime = useStarttime;
    }

    /**
     * @return use_endtime
     */
    public Date getUseEndtime() {
        return useEndtime;
    }

    /**
     * @param useEndtime
     */
    public void setUseEndtime(Date useEndtime) {
        this.useEndtime = useEndtime;
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

