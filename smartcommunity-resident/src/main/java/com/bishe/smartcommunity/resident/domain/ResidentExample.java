package com.bishe.smartcommunity.resident.domain;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Repository
public class ResidentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public ResidentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andResidentIdIsNull() {
            addCriterion("resident_id is null");
            return (Criteria) this;
        }

        public Criteria andResidentIdIsNotNull() {
            addCriterion("resident_id is not null");
            return (Criteria) this;
        }

        public Criteria andResidentIdEqualTo(Integer value) {
            addCriterion("resident_id =", value, "residentId");
            return (Criteria) this;
        }

        public Criteria andResidentIdNotEqualTo(Integer value) {
            addCriterion("resident_id <>", value, "residentId");
            return (Criteria) this;
        }

        public Criteria andResidentIdGreaterThan(Integer value) {
            addCriterion("resident_id >", value, "residentId");
            return (Criteria) this;
        }

        public Criteria andResidentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resident_id >=", value, "residentId");
            return (Criteria) this;
        }

        public Criteria andResidentIdLessThan(Integer value) {
            addCriterion("resident_id <", value, "residentId");
            return (Criteria) this;
        }

        public Criteria andResidentIdLessThanOrEqualTo(Integer value) {
            addCriterion("resident_id <=", value, "residentId");
            return (Criteria) this;
        }

        public Criteria andResidentIdIn(List<Integer> values) {
            addCriterion("resident_id in", values, "residentId");
            return (Criteria) this;
        }

        public Criteria andResidentIdNotIn(List<Integer> values) {
            addCriterion("resident_id not in", values, "residentId");
            return (Criteria) this;
        }

        public Criteria andResidentIdBetween(Integer value1, Integer value2) {
            addCriterion("resident_id between", value1, value2, "residentId");
            return (Criteria) this;
        }

        public Criteria andResidentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resident_id not between", value1, value2, "residentId");
            return (Criteria) this;
        }

        public Criteria andResidentNameIsNull() {
            addCriterion("resident_name is null");
            return (Criteria) this;
        }

        public Criteria andResidentNameIsNotNull() {
            addCriterion("resident_name is not null");
            return (Criteria) this;
        }

        public Criteria andResidentNameEqualTo(String value) {
            addCriterion("resident_name =", value, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameNotEqualTo(String value) {
            addCriterion("resident_name <>", value, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameGreaterThan(String value) {
            addCriterion("resident_name >", value, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameGreaterThanOrEqualTo(String value) {
            addCriterion("resident_name >=", value, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameLessThan(String value) {
            addCriterion("resident_name <", value, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameLessThanOrEqualTo(String value) {
            addCriterion("resident_name <=", value, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameLike(String value) {
            addCriterion("resident_name like", value, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameNotLike(String value) {
            addCriterion("resident_name not like", value, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameIn(List<String> values) {
            addCriterion("resident_name in", values, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameNotIn(List<String> values) {
            addCriterion("resident_name not in", values, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameBetween(String value1, String value2) {
            addCriterion("resident_name between", value1, value2, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentNameNotBetween(String value1, String value2) {
            addCriterion("resident_name not between", value1, value2, "residentName");
            return (Criteria) this;
        }

        public Criteria andResidentPwdIsNull() {
            addCriterion("resident_pwd is null");
            return (Criteria) this;
        }

        public Criteria andResidentPwdIsNotNull() {
            addCriterion("resident_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andResidentPwdEqualTo(String value) {
            addCriterion("resident_pwd =", value, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdNotEqualTo(String value) {
            addCriterion("resident_pwd <>", value, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdGreaterThan(String value) {
            addCriterion("resident_pwd >", value, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdGreaterThanOrEqualTo(String value) {
            addCriterion("resident_pwd >=", value, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdLessThan(String value) {
            addCriterion("resident_pwd <", value, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdLessThanOrEqualTo(String value) {
            addCriterion("resident_pwd <=", value, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdLike(String value) {
            addCriterion("resident_pwd like", value, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdNotLike(String value) {
            addCriterion("resident_pwd not like", value, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdIn(List<String> values) {
            addCriterion("resident_pwd in", values, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdNotIn(List<String> values) {
            addCriterion("resident_pwd not in", values, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdBetween(String value1, String value2) {
            addCriterion("resident_pwd between", value1, value2, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPwdNotBetween(String value1, String value2) {
            addCriterion("resident_pwd not between", value1, value2, "residentPwd");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneIsNull() {
            addCriterion("resident_phone is null");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneIsNotNull() {
            addCriterion("resident_phone is not null");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneEqualTo(String value) {
            addCriterion("resident_phone =", value, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneNotEqualTo(String value) {
            addCriterion("resident_phone <>", value, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneGreaterThan(String value) {
            addCriterion("resident_phone >", value, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("resident_phone >=", value, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneLessThan(String value) {
            addCriterion("resident_phone <", value, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneLessThanOrEqualTo(String value) {
            addCriterion("resident_phone <=", value, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneLike(String value) {
            addCriterion("resident_phone like", value, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneNotLike(String value) {
            addCriterion("resident_phone not like", value, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneIn(List<String> values) {
            addCriterion("resident_phone in", values, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneNotIn(List<String> values) {
            addCriterion("resident_phone not in", values, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneBetween(String value1, String value2) {
            addCriterion("resident_phone between", value1, value2, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentPhoneNotBetween(String value1, String value2) {
            addCriterion("resident_phone not between", value1, value2, "residentPhone");
            return (Criteria) this;
        }

        public Criteria andResidentEmailIsNull() {
            addCriterion("resident_email is null");
            return (Criteria) this;
        }

        public Criteria andResidentEmailIsNotNull() {
            addCriterion("resident_email is not null");
            return (Criteria) this;
        }

        public Criteria andResidentEmailEqualTo(String value) {
            addCriterion("resident_email =", value, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailNotEqualTo(String value) {
            addCriterion("resident_email <>", value, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailGreaterThan(String value) {
            addCriterion("resident_email >", value, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("resident_email >=", value, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailLessThan(String value) {
            addCriterion("resident_email <", value, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailLessThanOrEqualTo(String value) {
            addCriterion("resident_email <=", value, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailLike(String value) {
            addCriterion("resident_email like", value, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailNotLike(String value) {
            addCriterion("resident_email not like", value, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailIn(List<String> values) {
            addCriterion("resident_email in", values, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailNotIn(List<String> values) {
            addCriterion("resident_email not in", values, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailBetween(String value1, String value2) {
            addCriterion("resident_email between", value1, value2, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentEmailNotBetween(String value1, String value2) {
            addCriterion("resident_email not between", value1, value2, "residentEmail");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedIsNull() {
            addCriterion("resident_created is null");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedIsNotNull() {
            addCriterion("resident_created is not null");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedEqualTo(Date value) {
            addCriterion("resident_created =", value, "residentCreated");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedNotEqualTo(Date value) {
            addCriterion("resident_created <>", value, "residentCreated");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedGreaterThan(Date value) {
            addCriterion("resident_created >", value, "residentCreated");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("resident_created >=", value, "residentCreated");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedLessThan(Date value) {
            addCriterion("resident_created <", value, "residentCreated");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedLessThanOrEqualTo(Date value) {
            addCriterion("resident_created <=", value, "residentCreated");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedIn(List<Date> values) {
            addCriterion("resident_created in", values, "residentCreated");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedNotIn(List<Date> values) {
            addCriterion("resident_created not in", values, "residentCreated");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedBetween(Date value1, Date value2) {
            addCriterion("resident_created between", value1, value2, "residentCreated");
            return (Criteria) this;
        }

        public Criteria andResidentCreatedNotBetween(Date value1, Date value2) {
            addCriterion("resident_created not between", value1, value2, "residentCreated");
            return (Criteria) this;
        }

        public Criteria andResidentStateIsNull() {
            addCriterion("resident_state is null");
            return (Criteria) this;
        }

        public Criteria andResidentStateIsNotNull() {
            addCriterion("resident_state is not null");
            return (Criteria) this;
        }

        public Criteria andResidentStateEqualTo(Integer value) {
            addCriterion("resident_state =", value, "residentState");
            return (Criteria) this;
        }

        public Criteria andResidentStateNotEqualTo(Integer value) {
            addCriterion("resident_state <>", value, "residentState");
            return (Criteria) this;
        }

        public Criteria andResidentStateGreaterThan(Integer value) {
            addCriterion("resident_state >", value, "residentState");
            return (Criteria) this;
        }

        public Criteria andResidentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("resident_state >=", value, "residentState");
            return (Criteria) this;
        }

        public Criteria andResidentStateLessThan(Integer value) {
            addCriterion("resident_state <", value, "residentState");
            return (Criteria) this;
        }

        public Criteria andResidentStateLessThanOrEqualTo(Integer value) {
            addCriterion("resident_state <=", value, "residentState");
            return (Criteria) this;
        }

        public Criteria andResidentStateIn(List<Integer> values) {
            addCriterion("resident_state in", values, "residentState");
            return (Criteria) this;
        }

        public Criteria andResidentStateNotIn(List<Integer> values) {
            addCriterion("resident_state not in", values, "residentState");
            return (Criteria) this;
        }

        public Criteria andResidentStateBetween(Integer value1, Integer value2) {
            addCriterion("resident_state between", value1, value2, "residentState");
            return (Criteria) this;
        }

        public Criteria andResidentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("resident_state not between", value1, value2, "residentState");
            return (Criteria) this;
        }

        public Criteria andResidentPlateIsNull() {
            addCriterion("resident_plate is null");
            return (Criteria) this;
        }

        public Criteria andResidentPlateIsNotNull() {
            addCriterion("resident_plate is not null");
            return (Criteria) this;
        }

        public Criteria andResidentPlateEqualTo(String value) {
            addCriterion("resident_plate =", value, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateNotEqualTo(String value) {
            addCriterion("resident_plate <>", value, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateGreaterThan(String value) {
            addCriterion("resident_plate >", value, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateGreaterThanOrEqualTo(String value) {
            addCriterion("resident_plate >=", value, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateLessThan(String value) {
            addCriterion("resident_plate <", value, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateLessThanOrEqualTo(String value) {
            addCriterion("resident_plate <=", value, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateLike(String value) {
            addCriterion("resident_plate like", value, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateNotLike(String value) {
            addCriterion("resident_plate not like", value, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateIn(List<String> values) {
            addCriterion("resident_plate in", values, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateNotIn(List<String> values) {
            addCriterion("resident_plate not in", values, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateBetween(String value1, String value2) {
            addCriterion("resident_plate between", value1, value2, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentPlateNotBetween(String value1, String value2) {
            addCriterion("resident_plate not between", value1, value2, "residentPlate");
            return (Criteria) this;
        }

        public Criteria andResidentTaskIsNull() {
            addCriterion("resident_task is null");
            return (Criteria) this;
        }

        public Criteria andResidentTaskIsNotNull() {
            addCriterion("resident_task is not null");
            return (Criteria) this;
        }

        public Criteria andResidentTaskEqualTo(Integer value) {
            addCriterion("resident_task =", value, "residentTask");
            return (Criteria) this;
        }

        public Criteria andResidentTaskNotEqualTo(Integer value) {
            addCriterion("resident_task <>", value, "residentTask");
            return (Criteria) this;
        }

        public Criteria andResidentTaskGreaterThan(Integer value) {
            addCriterion("resident_task >", value, "residentTask");
            return (Criteria) this;
        }

        public Criteria andResidentTaskGreaterThanOrEqualTo(Integer value) {
            addCriterion("resident_task >=", value, "residentTask");
            return (Criteria) this;
        }

        public Criteria andResidentTaskLessThan(Integer value) {
            addCriterion("resident_task <", value, "residentTask");
            return (Criteria) this;
        }

        public Criteria andResidentTaskLessThanOrEqualTo(Integer value) {
            addCriterion("resident_task <=", value, "residentTask");
            return (Criteria) this;
        }

        public Criteria andResidentTaskIn(List<Integer> values) {
            addCriterion("resident_task in", values, "residentTask");
            return (Criteria) this;
        }

        public Criteria andResidentTaskNotIn(List<Integer> values) {
            addCriterion("resident_task not in", values, "residentTask");
            return (Criteria) this;
        }

        public Criteria andResidentTaskBetween(Integer value1, Integer value2) {
            addCriterion("resident_task between", value1, value2, "residentTask");
            return (Criteria) this;
        }

        public Criteria andResidentTaskNotBetween(Integer value1, Integer value2) {
            addCriterion("resident_task not between", value1, value2, "residentTask");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table resident
     *
     * @mbg.generated do_not_delete_during_merge Mon Mar 08 13:49:10 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table resident
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}