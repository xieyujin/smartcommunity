package com.bishe.smartcommunity.resident.domain;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public class Courier implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier.courier_id
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private Integer courierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier.courier_name
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private String courierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier.courier_phone
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private String courierPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column courier.courier_state
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private Integer courierState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier.courier_id
     *
     * @return the value of courier.courier_id
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public Integer getCourierId() {
        return courierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier.courier_id
     *
     * @param courierId the value for courier.courier_id
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier.courier_name
     *
     * @return the value of courier.courier_name
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public String getCourierName() {
        return courierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier.courier_name
     *
     * @param courierName the value for courier.courier_name
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setCourierName(String courierName) {
        this.courierName = courierName == null ? null : courierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier.courier_phone
     *
     * @return the value of courier.courier_phone
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public String getCourierPhone() {
        return courierPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier.courier_phone
     *
     * @param courierPhone the value for courier.courier_phone
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setCourierPhone(String courierPhone) {
        this.courierPhone = courierPhone == null ? null : courierPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column courier.courier_state
     *
     * @return the value of courier.courier_state
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public Integer getCourierState() {
        return courierState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column courier.courier_state
     *
     * @param courierState the value for courier.courier_state
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setCourierState(Integer courierState) {
        this.courierState = courierState;
    }
}