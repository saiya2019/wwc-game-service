package com.wwc.game.chess.ky.po;

import java.util.ArrayList;
import java.util.List;

public class UserBettingRecordExample {
    /**
     * user_betting_record
     */
    protected String orderByClause;

    /**
     * user_betting_record
     */
    protected boolean distinct;

    /**
     * user_betting_record
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public UserBettingRecordExample() {
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
     * user_betting_record null
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andGamePlatformIdIsNull() {
            addCriterion("game_platform_id is null");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdIsNotNull() {
            addCriterion("game_platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdEqualTo(Integer value) {
            addCriterion("game_platform_id =", value, "gamePlatformId");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdNotEqualTo(Integer value) {
            addCriterion("game_platform_id <>", value, "gamePlatformId");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdGreaterThan(Integer value) {
            addCriterion("game_platform_id >", value, "gamePlatformId");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_platform_id >=", value, "gamePlatformId");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdLessThan(Integer value) {
            addCriterion("game_platform_id <", value, "gamePlatformId");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_platform_id <=", value, "gamePlatformId");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdIn(List<Integer> values) {
            addCriterion("game_platform_id in", values, "gamePlatformId");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdNotIn(List<Integer> values) {
            addCriterion("game_platform_id not in", values, "gamePlatformId");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdBetween(Integer value1, Integer value2) {
            addCriterion("game_platform_id between", value1, value2, "gamePlatformId");
            return (Criteria) this;
        }

        public Criteria andGamePlatformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_platform_id not between", value1, value2, "gamePlatformId");
            return (Criteria) this;
        }

        public Criteria andGameTimeIsNull() {
            addCriterion("game_time is null");
            return (Criteria) this;
        }

        public Criteria andGameTimeIsNotNull() {
            addCriterion("game_time is not null");
            return (Criteria) this;
        }

        public Criteria andGameTimeEqualTo(String value) {
            addCriterion("game_time =", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeNotEqualTo(String value) {
            addCriterion("game_time <>", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeGreaterThan(String value) {
            addCriterion("game_time >", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeGreaterThanOrEqualTo(String value) {
            addCriterion("game_time >=", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeLessThan(String value) {
            addCriterion("game_time <", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeLessThanOrEqualTo(String value) {
            addCriterion("game_time <=", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeLike(String value) {
            addCriterion("game_time like", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeNotLike(String value) {
            addCriterion("game_time not like", value, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeIn(List<String> values) {
            addCriterion("game_time in", values, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeNotIn(List<String> values) {
            addCriterion("game_time not in", values, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeBetween(String value1, String value2) {
            addCriterion("game_time between", value1, value2, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimeNotBetween(String value1, String value2) {
            addCriterion("game_time not between", value1, value2, "gameTime");
            return (Criteria) this;
        }

        public Criteria andGameTimestampIsNull() {
            addCriterion("game_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andGameTimestampIsNotNull() {
            addCriterion("game_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andGameTimestampEqualTo(Long value) {
            addCriterion("game_timestamp =", value, "gameTimestamp");
            return (Criteria) this;
        }

        public Criteria andGameTimestampNotEqualTo(Long value) {
            addCriterion("game_timestamp <>", value, "gameTimestamp");
            return (Criteria) this;
        }

        public Criteria andGameTimestampGreaterThan(Long value) {
            addCriterion("game_timestamp >", value, "gameTimestamp");
            return (Criteria) this;
        }

        public Criteria andGameTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("game_timestamp >=", value, "gameTimestamp");
            return (Criteria) this;
        }

        public Criteria andGameTimestampLessThan(Long value) {
            addCriterion("game_timestamp <", value, "gameTimestamp");
            return (Criteria) this;
        }

        public Criteria andGameTimestampLessThanOrEqualTo(Long value) {
            addCriterion("game_timestamp <=", value, "gameTimestamp");
            return (Criteria) this;
        }

        public Criteria andGameTimestampIn(List<Long> values) {
            addCriterion("game_timestamp in", values, "gameTimestamp");
            return (Criteria) this;
        }

        public Criteria andGameTimestampNotIn(List<Long> values) {
            addCriterion("game_timestamp not in", values, "gameTimestamp");
            return (Criteria) this;
        }

        public Criteria andGameTimestampBetween(Long value1, Long value2) {
            addCriterion("game_timestamp between", value1, value2, "gameTimestamp");
            return (Criteria) this;
        }

        public Criteria andGameTimestampNotBetween(Long value1, Long value2) {
            addCriterion("game_timestamp not between", value1, value2, "gameTimestamp");
            return (Criteria) this;
        }

        public Criteria andBetAmountIsNull() {
            addCriterion("bet_amount is null");
            return (Criteria) this;
        }

        public Criteria andBetAmountIsNotNull() {
            addCriterion("bet_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBetAmountEqualTo(Double value) {
            addCriterion("bet_amount =", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountNotEqualTo(Double value) {
            addCriterion("bet_amount <>", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountGreaterThan(Double value) {
            addCriterion("bet_amount >", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("bet_amount >=", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountLessThan(Double value) {
            addCriterion("bet_amount <", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountLessThanOrEqualTo(Double value) {
            addCriterion("bet_amount <=", value, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountIn(List<Double> values) {
            addCriterion("bet_amount in", values, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountNotIn(List<Double> values) {
            addCriterion("bet_amount not in", values, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountBetween(Double value1, Double value2) {
            addCriterion("bet_amount between", value1, value2, "betAmount");
            return (Criteria) this;
        }

        public Criteria andBetAmountNotBetween(Double value1, Double value2) {
            addCriterion("bet_amount not between", value1, value2, "betAmount");
            return (Criteria) this;
        }

        public Criteria andWinFeeIsNull() {
            addCriterion("win_fee is null");
            return (Criteria) this;
        }

        public Criteria andWinFeeIsNotNull() {
            addCriterion("win_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWinFeeEqualTo(Double value) {
            addCriterion("win_fee =", value, "winFee");
            return (Criteria) this;
        }

        public Criteria andWinFeeNotEqualTo(Double value) {
            addCriterion("win_fee <>", value, "winFee");
            return (Criteria) this;
        }

        public Criteria andWinFeeGreaterThan(Double value) {
            addCriterion("win_fee >", value, "winFee");
            return (Criteria) this;
        }

        public Criteria andWinFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("win_fee >=", value, "winFee");
            return (Criteria) this;
        }

        public Criteria andWinFeeLessThan(Double value) {
            addCriterion("win_fee <", value, "winFee");
            return (Criteria) this;
        }

        public Criteria andWinFeeLessThanOrEqualTo(Double value) {
            addCriterion("win_fee <=", value, "winFee");
            return (Criteria) this;
        }

        public Criteria andWinFeeIn(List<Double> values) {
            addCriterion("win_fee in", values, "winFee");
            return (Criteria) this;
        }

        public Criteria andWinFeeNotIn(List<Double> values) {
            addCriterion("win_fee not in", values, "winFee");
            return (Criteria) this;
        }

        public Criteria andWinFeeBetween(Double value1, Double value2) {
            addCriterion("win_fee between", value1, value2, "winFee");
            return (Criteria) this;
        }

        public Criteria andWinFeeNotBetween(Double value1, Double value2) {
            addCriterion("win_fee not between", value1, value2, "winFee");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNull() {
            addCriterion("line_code is null");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNotNull() {
            addCriterion("line_code is not null");
            return (Criteria) this;
        }

        public Criteria andLineCodeEqualTo(String value) {
            addCriterion("line_code =", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotEqualTo(String value) {
            addCriterion("line_code <>", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThan(String value) {
            addCriterion("line_code >", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("line_code >=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThan(String value) {
            addCriterion("line_code <", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThanOrEqualTo(String value) {
            addCriterion("line_code <=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLike(String value) {
            addCriterion("line_code like", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotLike(String value) {
            addCriterion("line_code not like", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeIn(List<String> values) {
            addCriterion("line_code in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotIn(List<String> values) {
            addCriterion("line_code not in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeBetween(String value1, String value2) {
            addCriterion("line_code between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotBetween(String value1, String value2) {
            addCriterion("line_code not between", value1, value2, "lineCode");
            return (Criteria) this;
        }
    }

    /**
     * user_betting_record
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * user_betting_record null
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