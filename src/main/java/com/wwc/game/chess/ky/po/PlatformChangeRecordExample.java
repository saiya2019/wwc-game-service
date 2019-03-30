package com.wwc.game.chess.ky.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlatformChangeRecordExample {
    /**
     * platform_change_record
     */
    protected String orderByClause;

    /**
     * platform_change_record
     */
    protected boolean distinct;

    /**
     * platform_change_record
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public PlatformChangeRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * platform_change_record null
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameIsNull() {
            addCriterion("from_platform_name is null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameIsNotNull() {
            addCriterion("from_platform_name is not null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameEqualTo(String value) {
            addCriterion("from_platform_name =", value, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameNotEqualTo(String value) {
            addCriterion("from_platform_name <>", value, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameGreaterThan(String value) {
            addCriterion("from_platform_name >", value, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameGreaterThanOrEqualTo(String value) {
            addCriterion("from_platform_name >=", value, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameLessThan(String value) {
            addCriterion("from_platform_name <", value, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameLessThanOrEqualTo(String value) {
            addCriterion("from_platform_name <=", value, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameLike(String value) {
            addCriterion("from_platform_name like", value, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameNotLike(String value) {
            addCriterion("from_platform_name not like", value, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameIn(List<String> values) {
            addCriterion("from_platform_name in", values, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameNotIn(List<String> values) {
            addCriterion("from_platform_name not in", values, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameBetween(String value1, String value2) {
            addCriterion("from_platform_name between", value1, value2, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformNameNotBetween(String value1, String value2) {
            addCriterion("from_platform_name not between", value1, value2, "fromPlatformName");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeIsNull() {
            addCriterion("from_platform_third_code is null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeIsNotNull() {
            addCriterion("from_platform_third_code is not null");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeEqualTo(String value) {
            addCriterion("from_platform_third_code =", value, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeNotEqualTo(String value) {
            addCriterion("from_platform_third_code <>", value, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeGreaterThan(String value) {
            addCriterion("from_platform_third_code >", value, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("from_platform_third_code >=", value, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeLessThan(String value) {
            addCriterion("from_platform_third_code <", value, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeLessThanOrEqualTo(String value) {
            addCriterion("from_platform_third_code <=", value, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeLike(String value) {
            addCriterion("from_platform_third_code like", value, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeNotLike(String value) {
            addCriterion("from_platform_third_code not like", value, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeIn(List<String> values) {
            addCriterion("from_platform_third_code in", values, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeNotIn(List<String> values) {
            addCriterion("from_platform_third_code not in", values, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeBetween(String value1, String value2) {
            addCriterion("from_platform_third_code between", value1, value2, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andFromPlatformThirdCodeNotBetween(String value1, String value2) {
            addCriterion("from_platform_third_code not between", value1, value2, "fromPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameIsNull() {
            addCriterion("to_platform_name is null");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameIsNotNull() {
            addCriterion("to_platform_name is not null");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameEqualTo(String value) {
            addCriterion("to_platform_name =", value, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameNotEqualTo(String value) {
            addCriterion("to_platform_name <>", value, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameGreaterThan(String value) {
            addCriterion("to_platform_name >", value, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameGreaterThanOrEqualTo(String value) {
            addCriterion("to_platform_name >=", value, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameLessThan(String value) {
            addCriterion("to_platform_name <", value, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameLessThanOrEqualTo(String value) {
            addCriterion("to_platform_name <=", value, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameLike(String value) {
            addCriterion("to_platform_name like", value, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameNotLike(String value) {
            addCriterion("to_platform_name not like", value, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameIn(List<String> values) {
            addCriterion("to_platform_name in", values, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameNotIn(List<String> values) {
            addCriterion("to_platform_name not in", values, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameBetween(String value1, String value2) {
            addCriterion("to_platform_name between", value1, value2, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformNameNotBetween(String value1, String value2) {
            addCriterion("to_platform_name not between", value1, value2, "toPlatformName");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeIsNull() {
            addCriterion("to_platform_third_code is null");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeIsNotNull() {
            addCriterion("to_platform_third_code is not null");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeEqualTo(String value) {
            addCriterion("to_platform_third_code =", value, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeNotEqualTo(String value) {
            addCriterion("to_platform_third_code <>", value, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeGreaterThan(String value) {
            addCriterion("to_platform_third_code >", value, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("to_platform_third_code >=", value, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeLessThan(String value) {
            addCriterion("to_platform_third_code <", value, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeLessThanOrEqualTo(String value) {
            addCriterion("to_platform_third_code <=", value, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeLike(String value) {
            addCriterion("to_platform_third_code like", value, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeNotLike(String value) {
            addCriterion("to_platform_third_code not like", value, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeIn(List<String> values) {
            addCriterion("to_platform_third_code in", values, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeNotIn(List<String> values) {
            addCriterion("to_platform_third_code not in", values, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeBetween(String value1, String value2) {
            addCriterion("to_platform_third_code between", value1, value2, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andToPlatformThirdCodeNotBetween(String value1, String value2) {
            addCriterion("to_platform_third_code not between", value1, value2, "toPlatformThirdCode");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIsNull() {
            addCriterion("change_money is null");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIsNotNull() {
            addCriterion("change_money is not null");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyEqualTo(BigDecimal value) {
            addCriterion("change_money =", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("change_money <>", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyGreaterThan(BigDecimal value) {
            addCriterion("change_money >", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("change_money >=", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyLessThan(BigDecimal value) {
            addCriterion("change_money <", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("change_money <=", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIn(List<BigDecimal> values) {
            addCriterion("change_money in", values, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("change_money not in", values, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_money between", value1, value2, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_money not between", value1, value2, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyIsNull() {
            addCriterion("can_using_money is null");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyIsNotNull() {
            addCriterion("can_using_money is not null");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyEqualTo(BigDecimal value) {
            addCriterion("can_using_money =", value, "canUsingMoney");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyNotEqualTo(BigDecimal value) {
            addCriterion("can_using_money <>", value, "canUsingMoney");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyGreaterThan(BigDecimal value) {
            addCriterion("can_using_money >", value, "canUsingMoney");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("can_using_money >=", value, "canUsingMoney");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyLessThan(BigDecimal value) {
            addCriterion("can_using_money <", value, "canUsingMoney");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("can_using_money <=", value, "canUsingMoney");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyIn(List<BigDecimal> values) {
            addCriterion("can_using_money in", values, "canUsingMoney");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyNotIn(List<BigDecimal> values) {
            addCriterion("can_using_money not in", values, "canUsingMoney");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("can_using_money between", value1, value2, "canUsingMoney");
            return (Criteria) this;
        }

        public Criteria andCanUsingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("can_using_money not between", value1, value2, "canUsingMoney");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(String value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(String value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(String value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(String value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(String value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLike(String value) {
            addCriterion("change_time like", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotLike(String value) {
            addCriterion("change_time not like", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<String> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<String> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(String value1, String value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(String value1, String value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * platform_change_record
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * platform_change_record null
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