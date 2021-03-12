package com.bishe.smartcommunity.property.domain;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public class Property implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property.property_id
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    private Integer propertyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property.property_name
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    private String propertyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property.property_pwd
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    private String propertyPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property.property_phone
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    private String propertyPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property.property_state
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    private Integer propertyState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property.Property_score
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    private Integer propertyScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property.Property_task
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    private Integer propertyTask;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column property.property_notice
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    private String propertyNotice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property.property_id
     *
     * @return the value of property.property_id
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property.property_id
     *
     * @param propertyId the value for property.property_id
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property.property_name
     *
     * @return the value of property.property_name
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property.property_name
     *
     * @param propertyName the value for property.property_name
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName == null ? null : propertyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property.property_pwd
     *
     * @return the value of property.property_pwd
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public String getPropertyPwd() {
        return propertyPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property.property_pwd
     *
     * @param propertyPwd the value for property.property_pwd
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public void setPropertyPwd(String propertyPwd) {
        this.propertyPwd = propertyPwd == null ? null : propertyPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property.property_phone
     *
     * @return the value of property.property_phone
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public String getPropertyPhone() {
        return propertyPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property.property_phone
     *
     * @param propertyPhone the value for property.property_phone
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public void setPropertyPhone(String propertyPhone) {
        this.propertyPhone = propertyPhone == null ? null : propertyPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property.property_state
     *
     * @return the value of property.property_state
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public Integer getPropertyState() {
        return propertyState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property.property_state
     *
     * @param propertyState the value for property.property_state
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public void setPropertyState(Integer propertyState) {
        this.propertyState = propertyState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property.Property_score
     *
     * @return the value of property.Property_score
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public Integer getPropertyScore() {
        return propertyScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property.Property_score
     *
     * @param propertyScore the value for property.Property_score
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public void setPropertyScore(Integer propertyScore) {
        this.propertyScore = propertyScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property.Property_task
     *
     * @return the value of property.Property_task
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public Integer getPropertyTask() {
        return propertyTask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property.Property_task
     *
     * @param propertyTask the value for property.Property_task
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public void setPropertyTask(Integer propertyTask) {
        this.propertyTask = propertyTask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column property.property_notice
     *
     * @return the value of property.property_notice
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public String getPropertyNotice() {
        return propertyNotice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column property.property_notice
     *
     * @param propertyNotice the value for property.property_notice
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    public void setPropertyNotice(String propertyNotice) {
        this.propertyNotice = propertyNotice == null ? null : propertyNotice.trim();
    }
}