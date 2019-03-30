package com.wwc.game.chess.ky.po;

import java.util.ArrayList;
import java.util.List;

public class GameBettingRecordExample {
    /**
     * game_betting_record
     */
    protected String orderByClause;

    /**
     * game_betting_record
     */
    protected boolean distinct;

    /**
     * game_betting_record
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public GameBettingRecordExample() {
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
     * game_betting_record null
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

        public Criteria andGamePlatformNameIsNull() {
            addCriterion("game_platform_name is null");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameIsNotNull() {
            addCriterion("game_platform_name is not null");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameEqualTo(String value) {
            addCriterion("game_platform_name =", value, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameNotEqualTo(String value) {
            addCriterion("game_platform_name <>", value, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameGreaterThan(String value) {
            addCriterion("game_platform_name >", value, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameGreaterThanOrEqualTo(String value) {
            addCriterion("game_platform_name >=", value, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameLessThan(String value) {
            addCriterion("game_platform_name <", value, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameLessThanOrEqualTo(String value) {
            addCriterion("game_platform_name <=", value, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameLike(String value) {
            addCriterion("game_platform_name like", value, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameNotLike(String value) {
            addCriterion("game_platform_name not like", value, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameIn(List<String> values) {
            addCriterion("game_platform_name in", values, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameNotIn(List<String> values) {
            addCriterion("game_platform_name not in", values, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameBetween(String value1, String value2) {
            addCriterion("game_platform_name between", value1, value2, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGamePlatformNameNotBetween(String value1, String value2) {
            addCriterion("game_platform_name not between", value1, value2, "gamePlatformName");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdIsNull() {
            addCriterion("game_bureau_id is null");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdIsNotNull() {
            addCriterion("game_bureau_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdEqualTo(String value) {
            addCriterion("game_bureau_id =", value, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdNotEqualTo(String value) {
            addCriterion("game_bureau_id <>", value, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdGreaterThan(String value) {
            addCriterion("game_bureau_id >", value, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdGreaterThanOrEqualTo(String value) {
            addCriterion("game_bureau_id >=", value, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdLessThan(String value) {
            addCriterion("game_bureau_id <", value, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdLessThanOrEqualTo(String value) {
            addCriterion("game_bureau_id <=", value, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdLike(String value) {
            addCriterion("game_bureau_id like", value, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdNotLike(String value) {
            addCriterion("game_bureau_id not like", value, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdIn(List<String> values) {
            addCriterion("game_bureau_id in", values, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdNotIn(List<String> values) {
            addCriterion("game_bureau_id not in", values, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdBetween(String value1, String value2) {
            addCriterion("game_bureau_id between", value1, value2, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andGameBureauIdNotBetween(String value1, String value2) {
            addCriterion("game_bureau_id not between", value1, value2, "gameBureauId");
            return (Criteria) this;
        }

        public Criteria andAccountsIsNull() {
            addCriterion("accounts is null");
            return (Criteria) this;
        }

        public Criteria andAccountsIsNotNull() {
            addCriterion("accounts is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsEqualTo(String value) {
            addCriterion("accounts =", value, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsNotEqualTo(String value) {
            addCriterion("accounts <>", value, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsGreaterThan(String value) {
            addCriterion("accounts >", value, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsGreaterThanOrEqualTo(String value) {
            addCriterion("accounts >=", value, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsLessThan(String value) {
            addCriterion("accounts <", value, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsLessThanOrEqualTo(String value) {
            addCriterion("accounts <=", value, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsLike(String value) {
            addCriterion("accounts like", value, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsNotLike(String value) {
            addCriterion("accounts not like", value, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsIn(List<String> values) {
            addCriterion("accounts in", values, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsNotIn(List<String> values) {
            addCriterion("accounts not in", values, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsBetween(String value1, String value2) {
            addCriterion("accounts between", value1, value2, "accounts");
            return (Criteria) this;
        }

        public Criteria andAccountsNotBetween(String value1, String value2) {
            addCriterion("accounts not between", value1, value2, "accounts");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(Integer value) {
            addCriterion("server_id =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Integer value) {
            addCriterion("server_id <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Integer value) {
            addCriterion("server_id >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_id >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Integer value) {
            addCriterion("server_id <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Integer value) {
            addCriterion("server_id <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Integer> values) {
            addCriterion("server_id in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Integer> values) {
            addCriterion("server_id not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Integer value1, Integer value2) {
            addCriterion("server_id between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("server_id not between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNull() {
            addCriterion("kind_id is null");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNotNull() {
            addCriterion("kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andKindIdEqualTo(Integer value) {
            addCriterion("kind_id =", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotEqualTo(Integer value) {
            addCriterion("kind_id <>", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThan(Integer value) {
            addCriterion("kind_id >", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("kind_id >=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThan(Integer value) {
            addCriterion("kind_id <", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("kind_id <=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdIn(List<Integer> values) {
            addCriterion("kind_id in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotIn(List<Integer> values) {
            addCriterion("kind_id not in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdBetween(Integer value1, Integer value2) {
            addCriterion("kind_id between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("kind_id not between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNull() {
            addCriterion("table_id is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("table_id is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(Integer value) {
            addCriterion("table_id =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(Integer value) {
            addCriterion("table_id <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(Integer value) {
            addCriterion("table_id >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_id >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(Integer value) {
            addCriterion("table_id <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("table_id <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<Integer> values) {
            addCriterion("table_id in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<Integer> values) {
            addCriterion("table_id not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(Integer value1, Integer value2) {
            addCriterion("table_id between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("table_id not between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andChairIdIsNull() {
            addCriterion("chair_id is null");
            return (Criteria) this;
        }

        public Criteria andChairIdIsNotNull() {
            addCriterion("chair_id is not null");
            return (Criteria) this;
        }

        public Criteria andChairIdEqualTo(Integer value) {
            addCriterion("chair_id =", value, "chairId");
            return (Criteria) this;
        }

        public Criteria andChairIdNotEqualTo(Integer value) {
            addCriterion("chair_id <>", value, "chairId");
            return (Criteria) this;
        }

        public Criteria andChairIdGreaterThan(Integer value) {
            addCriterion("chair_id >", value, "chairId");
            return (Criteria) this;
        }

        public Criteria andChairIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chair_id >=", value, "chairId");
            return (Criteria) this;
        }

        public Criteria andChairIdLessThan(Integer value) {
            addCriterion("chair_id <", value, "chairId");
            return (Criteria) this;
        }

        public Criteria andChairIdLessThanOrEqualTo(Integer value) {
            addCriterion("chair_id <=", value, "chairId");
            return (Criteria) this;
        }

        public Criteria andChairIdIn(List<Integer> values) {
            addCriterion("chair_id in", values, "chairId");
            return (Criteria) this;
        }

        public Criteria andChairIdNotIn(List<Integer> values) {
            addCriterion("chair_id not in", values, "chairId");
            return (Criteria) this;
        }

        public Criteria andChairIdBetween(Integer value1, Integer value2) {
            addCriterion("chair_id between", value1, value2, "chairId");
            return (Criteria) this;
        }

        public Criteria andChairIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chair_id not between", value1, value2, "chairId");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNull() {
            addCriterion("user_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNotNull() {
            addCriterion("user_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountEqualTo(Integer value) {
            addCriterion("user_count =", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotEqualTo(Integer value) {
            addCriterion("user_count <>", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThan(Integer value) {
            addCriterion("user_count >", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_count >=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThan(Integer value) {
            addCriterion("user_count <", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_count <=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountIn(List<Integer> values) {
            addCriterion("user_count in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotIn(List<Integer> values) {
            addCriterion("user_count not in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountBetween(Integer value1, Integer value2) {
            addCriterion("user_count between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_count not between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andCardValueIsNull() {
            addCriterion("card_value is null");
            return (Criteria) this;
        }

        public Criteria andCardValueIsNotNull() {
            addCriterion("card_value is not null");
            return (Criteria) this;
        }

        public Criteria andCardValueEqualTo(Integer value) {
            addCriterion("card_value =", value, "cardValue");
            return (Criteria) this;
        }

        public Criteria andCardValueNotEqualTo(Integer value) {
            addCriterion("card_value <>", value, "cardValue");
            return (Criteria) this;
        }

        public Criteria andCardValueGreaterThan(Integer value) {
            addCriterion("card_value >", value, "cardValue");
            return (Criteria) this;
        }

        public Criteria andCardValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_value >=", value, "cardValue");
            return (Criteria) this;
        }

        public Criteria andCardValueLessThan(Integer value) {
            addCriterion("card_value <", value, "cardValue");
            return (Criteria) this;
        }

        public Criteria andCardValueLessThanOrEqualTo(Integer value) {
            addCriterion("card_value <=", value, "cardValue");
            return (Criteria) this;
        }

        public Criteria andCardValueIn(List<Integer> values) {
            addCriterion("card_value in", values, "cardValue");
            return (Criteria) this;
        }

        public Criteria andCardValueNotIn(List<Integer> values) {
            addCriterion("card_value not in", values, "cardValue");
            return (Criteria) this;
        }

        public Criteria andCardValueBetween(Integer value1, Integer value2) {
            addCriterion("card_value between", value1, value2, "cardValue");
            return (Criteria) this;
        }

        public Criteria andCardValueNotBetween(Integer value1, Integer value2) {
            addCriterion("card_value not between", value1, value2, "cardValue");
            return (Criteria) this;
        }

        public Criteria andCellScoreIsNull() {
            addCriterion("cell_score is null");
            return (Criteria) this;
        }

        public Criteria andCellScoreIsNotNull() {
            addCriterion("cell_score is not null");
            return (Criteria) this;
        }

        public Criteria andCellScoreEqualTo(Double value) {
            addCriterion("cell_score =", value, "cellScore");
            return (Criteria) this;
        }

        public Criteria andCellScoreNotEqualTo(Double value) {
            addCriterion("cell_score <>", value, "cellScore");
            return (Criteria) this;
        }

        public Criteria andCellScoreGreaterThan(Double value) {
            addCriterion("cell_score >", value, "cellScore");
            return (Criteria) this;
        }

        public Criteria andCellScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("cell_score >=", value, "cellScore");
            return (Criteria) this;
        }

        public Criteria andCellScoreLessThan(Double value) {
            addCriterion("cell_score <", value, "cellScore");
            return (Criteria) this;
        }

        public Criteria andCellScoreLessThanOrEqualTo(Double value) {
            addCriterion("cell_score <=", value, "cellScore");
            return (Criteria) this;
        }

        public Criteria andCellScoreIn(List<Double> values) {
            addCriterion("cell_score in", values, "cellScore");
            return (Criteria) this;
        }

        public Criteria andCellScoreNotIn(List<Double> values) {
            addCriterion("cell_score not in", values, "cellScore");
            return (Criteria) this;
        }

        public Criteria andCellScoreBetween(Double value1, Double value2) {
            addCriterion("cell_score between", value1, value2, "cellScore");
            return (Criteria) this;
        }

        public Criteria andCellScoreNotBetween(Double value1, Double value2) {
            addCriterion("cell_score not between", value1, value2, "cellScore");
            return (Criteria) this;
        }

        public Criteria andAllBetIsNull() {
            addCriterion("all_bet is null");
            return (Criteria) this;
        }

        public Criteria andAllBetIsNotNull() {
            addCriterion("all_bet is not null");
            return (Criteria) this;
        }

        public Criteria andAllBetEqualTo(Double value) {
            addCriterion("all_bet =", value, "allBet");
            return (Criteria) this;
        }

        public Criteria andAllBetNotEqualTo(Double value) {
            addCriterion("all_bet <>", value, "allBet");
            return (Criteria) this;
        }

        public Criteria andAllBetGreaterThan(Double value) {
            addCriterion("all_bet >", value, "allBet");
            return (Criteria) this;
        }

        public Criteria andAllBetGreaterThanOrEqualTo(Double value) {
            addCriterion("all_bet >=", value, "allBet");
            return (Criteria) this;
        }

        public Criteria andAllBetLessThan(Double value) {
            addCriterion("all_bet <", value, "allBet");
            return (Criteria) this;
        }

        public Criteria andAllBetLessThanOrEqualTo(Double value) {
            addCriterion("all_bet <=", value, "allBet");
            return (Criteria) this;
        }

        public Criteria andAllBetIn(List<Double> values) {
            addCriterion("all_bet in", values, "allBet");
            return (Criteria) this;
        }

        public Criteria andAllBetNotIn(List<Double> values) {
            addCriterion("all_bet not in", values, "allBet");
            return (Criteria) this;
        }

        public Criteria andAllBetBetween(Double value1, Double value2) {
            addCriterion("all_bet between", value1, value2, "allBet");
            return (Criteria) this;
        }

        public Criteria andAllBetNotBetween(Double value1, Double value2) {
            addCriterion("all_bet not between", value1, value2, "allBet");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(Double value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(Double value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(Double value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(Double value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(Double value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<Double> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<Double> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(Double value1, Double value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(Double value1, Double value2) {
            addCriterion("profit not between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andRevenueIsNull() {
            addCriterion("revenue is null");
            return (Criteria) this;
        }

        public Criteria andRevenueIsNotNull() {
            addCriterion("revenue is not null");
            return (Criteria) this;
        }

        public Criteria andRevenueEqualTo(Double value) {
            addCriterion("revenue =", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotEqualTo(Double value) {
            addCriterion("revenue <>", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueGreaterThan(Double value) {
            addCriterion("revenue >", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueGreaterThanOrEqualTo(Double value) {
            addCriterion("revenue >=", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLessThan(Double value) {
            addCriterion("revenue <", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLessThanOrEqualTo(Double value) {
            addCriterion("revenue <=", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueIn(List<Double> values) {
            addCriterion("revenue in", values, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotIn(List<Double> values) {
            addCriterion("revenue not in", values, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueBetween(Double value1, Double value2) {
            addCriterion("revenue between", value1, value2, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotBetween(Double value1, Double value2) {
            addCriterion("revenue not between", value1, value2, "revenue");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeIsNull() {
            addCriterion("game_start_time is null");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeIsNotNull() {
            addCriterion("game_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeEqualTo(String value) {
            addCriterion("game_start_time =", value, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeNotEqualTo(String value) {
            addCriterion("game_start_time <>", value, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeGreaterThan(String value) {
            addCriterion("game_start_time >", value, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("game_start_time >=", value, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeLessThan(String value) {
            addCriterion("game_start_time <", value, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeLessThanOrEqualTo(String value) {
            addCriterion("game_start_time <=", value, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeLike(String value) {
            addCriterion("game_start_time like", value, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeNotLike(String value) {
            addCriterion("game_start_time not like", value, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeIn(List<String> values) {
            addCriterion("game_start_time in", values, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeNotIn(List<String> values) {
            addCriterion("game_start_time not in", values, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeBetween(String value1, String value2) {
            addCriterion("game_start_time between", value1, value2, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameStartTimeNotBetween(String value1, String value2) {
            addCriterion("game_start_time not between", value1, value2, "gameStartTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeIsNull() {
            addCriterion("game_end_time is null");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeIsNotNull() {
            addCriterion("game_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeEqualTo(String value) {
            addCriterion("game_end_time =", value, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeNotEqualTo(String value) {
            addCriterion("game_end_time <>", value, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeGreaterThan(String value) {
            addCriterion("game_end_time >", value, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("game_end_time >=", value, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeLessThan(String value) {
            addCriterion("game_end_time <", value, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeLessThanOrEqualTo(String value) {
            addCriterion("game_end_time <=", value, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeLike(String value) {
            addCriterion("game_end_time like", value, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeNotLike(String value) {
            addCriterion("game_end_time not like", value, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeIn(List<String> values) {
            addCriterion("game_end_time in", values, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeNotIn(List<String> values) {
            addCriterion("game_end_time not in", values, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeBetween(String value1, String value2) {
            addCriterion("game_end_time between", value1, value2, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andGameEndTimeNotBetween(String value1, String value2) {
            addCriterion("game_end_time not between", value1, value2, "gameEndTime");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
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
     * game_betting_record
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * game_betting_record null
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