package com.bishe.smartcommunity.resident.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public TaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
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
     * This method corresponds to the database table task
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
     * This method corresponds to the database table task
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
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
     * This class corresponds to the database table task
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNull() {
            addCriterion("task_state is null");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNotNull() {
            addCriterion("task_state is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStateEqualTo(Integer value) {
            addCriterion("task_state =", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotEqualTo(Integer value) {
            addCriterion("task_state <>", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThan(Integer value) {
            addCriterion("task_state >", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_state >=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThan(Integer value) {
            addCriterion("task_state <", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThanOrEqualTo(Integer value) {
            addCriterion("task_state <=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateIn(List<Integer> values) {
            addCriterion("task_state in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotIn(List<Integer> values) {
            addCriterion("task_state not in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateBetween(Integer value1, Integer value2) {
            addCriterion("task_state between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotBetween(Integer value1, Integer value2) {
            addCriterion("task_state not between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionIsNull() {
            addCriterion("task_introduction is null");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionIsNotNull() {
            addCriterion("task_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionEqualTo(String value) {
            addCriterion("task_introduction =", value, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionNotEqualTo(String value) {
            addCriterion("task_introduction <>", value, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionGreaterThan(String value) {
            addCriterion("task_introduction >", value, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("task_introduction >=", value, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionLessThan(String value) {
            addCriterion("task_introduction <", value, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionLessThanOrEqualTo(String value) {
            addCriterion("task_introduction <=", value, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionLike(String value) {
            addCriterion("task_introduction like", value, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionNotLike(String value) {
            addCriterion("task_introduction not like", value, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionIn(List<String> values) {
            addCriterion("task_introduction in", values, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionNotIn(List<String> values) {
            addCriterion("task_introduction not in", values, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionBetween(String value1, String value2) {
            addCriterion("task_introduction between", value1, value2, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskIntroductionNotBetween(String value1, String value2) {
            addCriterion("task_introduction not between", value1, value2, "taskIntroduction");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedIsNull() {
            addCriterion("task_created is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedIsNotNull() {
            addCriterion("task_created is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedEqualTo(Date value) {
            addCriterion("task_created =", value, "taskCreated");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedNotEqualTo(Date value) {
            addCriterion("task_created <>", value, "taskCreated");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedGreaterThan(Date value) {
            addCriterion("task_created >", value, "taskCreated");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("task_created >=", value, "taskCreated");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedLessThan(Date value) {
            addCriterion("task_created <", value, "taskCreated");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedLessThanOrEqualTo(Date value) {
            addCriterion("task_created <=", value, "taskCreated");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedIn(List<Date> values) {
            addCriterion("task_created in", values, "taskCreated");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedNotIn(List<Date> values) {
            addCriterion("task_created not in", values, "taskCreated");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedBetween(Date value1, Date value2) {
            addCriterion("task_created between", value1, value2, "taskCreated");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedNotBetween(Date value1, Date value2) {
            addCriterion("task_created not between", value1, value2, "taskCreated");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionIsNull() {
            addCriterion("task_description is null");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionIsNotNull() {
            addCriterion("task_description is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionEqualTo(String value) {
            addCriterion("task_description =", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotEqualTo(String value) {
            addCriterion("task_description <>", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionGreaterThan(String value) {
            addCriterion("task_description >", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("task_description >=", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionLessThan(String value) {
            addCriterion("task_description <", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionLessThanOrEqualTo(String value) {
            addCriterion("task_description <=", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionLike(String value) {
            addCriterion("task_description like", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotLike(String value) {
            addCriterion("task_description not like", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionIn(List<String> values) {
            addCriterion("task_description in", values, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotIn(List<String> values) {
            addCriterion("task_description not in", values, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionBetween(String value1, String value2) {
            addCriterion("task_description between", value1, value2, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotBetween(String value1, String value2) {
            addCriterion("task_description not between", value1, value2, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridIsNull() {
            addCriterion("task_initiatorID is null");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridIsNotNull() {
            addCriterion("task_initiatorID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridEqualTo(Integer value) {
            addCriterion("task_initiatorID =", value, "taskInitiatorid");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridNotEqualTo(Integer value) {
            addCriterion("task_initiatorID <>", value, "taskInitiatorid");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridGreaterThan(Integer value) {
            addCriterion("task_initiatorID >", value, "taskInitiatorid");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_initiatorID >=", value, "taskInitiatorid");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridLessThan(Integer value) {
            addCriterion("task_initiatorID <", value, "taskInitiatorid");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridLessThanOrEqualTo(Integer value) {
            addCriterion("task_initiatorID <=", value, "taskInitiatorid");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridIn(List<Integer> values) {
            addCriterion("task_initiatorID in", values, "taskInitiatorid");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridNotIn(List<Integer> values) {
            addCriterion("task_initiatorID not in", values, "taskInitiatorid");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridBetween(Integer value1, Integer value2) {
            addCriterion("task_initiatorID between", value1, value2, "taskInitiatorid");
            return (Criteria) this;
        }

        public Criteria andTaskInitiatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("task_initiatorID not between", value1, value2, "taskInitiatorid");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridIsNull() {
            addCriterion("task_sovlerID is null");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridIsNotNull() {
            addCriterion("task_sovlerID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridEqualTo(Integer value) {
            addCriterion("task_sovlerID =", value, "taskSovlerid");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridNotEqualTo(Integer value) {
            addCriterion("task_sovlerID <>", value, "taskSovlerid");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridGreaterThan(Integer value) {
            addCriterion("task_sovlerID >", value, "taskSovlerid");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_sovlerID >=", value, "taskSovlerid");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridLessThan(Integer value) {
            addCriterion("task_sovlerID <", value, "taskSovlerid");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridLessThanOrEqualTo(Integer value) {
            addCriterion("task_sovlerID <=", value, "taskSovlerid");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridIn(List<Integer> values) {
            addCriterion("task_sovlerID in", values, "taskSovlerid");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridNotIn(List<Integer> values) {
            addCriterion("task_sovlerID not in", values, "taskSovlerid");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridBetween(Integer value1, Integer value2) {
            addCriterion("task_sovlerID between", value1, value2, "taskSovlerid");
            return (Criteria) this;
        }

        public Criteria andTaskSovleridNotBetween(Integer value1, Integer value2) {
            addCriterion("task_sovlerID not between", value1, value2, "taskSovlerid");
            return (Criteria) this;
        }

        public Criteria andTaskScoreIsNull() {
            addCriterion("task_score is null");
            return (Criteria) this;
        }

        public Criteria andTaskScoreIsNotNull() {
            addCriterion("task_score is not null");
            return (Criteria) this;
        }

        public Criteria andTaskScoreEqualTo(Integer value) {
            addCriterion("task_score =", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreNotEqualTo(Integer value) {
            addCriterion("task_score <>", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreGreaterThan(Integer value) {
            addCriterion("task_score >", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_score >=", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreLessThan(Integer value) {
            addCriterion("task_score <", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreLessThanOrEqualTo(Integer value) {
            addCriterion("task_score <=", value, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreIn(List<Integer> values) {
            addCriterion("task_score in", values, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreNotIn(List<Integer> values) {
            addCriterion("task_score not in", values, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreBetween(Integer value1, Integer value2) {
            addCriterion("task_score between", value1, value2, "taskScore");
            return (Criteria) this;
        }

        public Criteria andTaskScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("task_score not between", value1, value2, "taskScore");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table task
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
     * This class corresponds to the database table task
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