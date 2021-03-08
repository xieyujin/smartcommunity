package com.bishe.smartcommunity.resident.domain;

import java.io.Serializable;
import java.util.Date;

public class Resident implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resident.resident_id
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private Integer residentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resident.resident_name
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private String residentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resident.resident_pwd
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private String residentPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resident.resident_phone
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private String residentPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resident.resident_email
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private String residentEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resident.resident_created
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private Date residentCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resident.resident_state
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private Integer residentState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resident.resident_plate
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private String residentPlate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resident.resident_task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private Integer residentTask;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resident.resident_id
     *
     * @return the value of resident.resident_id
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public Integer getResidentId() {
        return residentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resident.resident_id
     *
     * @param residentId the value for resident.resident_id
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setResidentId(Integer residentId) {
        this.residentId = residentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resident.resident_name
     *
     * @return the value of resident.resident_name
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public String getResidentName() {
        return residentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resident.resident_name
     *
     * @param residentName the value for resident.resident_name
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setResidentName(String residentName) {
        this.residentName = residentName == null ? null : residentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resident.resident_pwd
     *
     * @return the value of resident.resident_pwd
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public String getResidentPwd() {
        return residentPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resident.resident_pwd
     *
     * @param residentPwd the value for resident.resident_pwd
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setResidentPwd(String residentPwd) {
        this.residentPwd = residentPwd == null ? null : residentPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resident.resident_phone
     *
     * @return the value of resident.resident_phone
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public String getResidentPhone() {
        return residentPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resident.resident_phone
     *
     * @param residentPhone the value for resident.resident_phone
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setResidentPhone(String residentPhone) {
        this.residentPhone = residentPhone == null ? null : residentPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resident.resident_email
     *
     * @return the value of resident.resident_email
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public String getResidentEmail() {
        return residentEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resident.resident_email
     *
     * @param residentEmail the value for resident.resident_email
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setResidentEmail(String residentEmail) {
        this.residentEmail = residentEmail == null ? null : residentEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resident.resident_created
     *
     * @return the value of resident.resident_created
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public Date getResidentCreated() {
        return residentCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resident.resident_created
     *
     * @param residentCreated the value for resident.resident_created
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setResidentCreated(Date residentCreated) {
        this.residentCreated = residentCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resident.resident_state
     *
     * @return the value of resident.resident_state
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public Integer getResidentState() {
        return residentState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resident.resident_state
     *
     * @param residentState the value for resident.resident_state
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setResidentState(Integer residentState) {
        this.residentState = residentState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resident.resident_plate
     *
     * @return the value of resident.resident_plate
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public String getResidentPlate() {
        return residentPlate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resident.resident_plate
     *
     * @param residentPlate the value for resident.resident_plate
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setResidentPlate(String residentPlate) {
        this.residentPlate = residentPlate == null ? null : residentPlate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resident.resident_task
     *
     * @return the value of resident.resident_task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public Integer getResidentTask() {
        return residentTask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resident.resident_task
     *
     * @param residentTask the value for resident.resident_task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setResidentTask(Integer residentTask) {
        this.residentTask = residentTask;
    }
}