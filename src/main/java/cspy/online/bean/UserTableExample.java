package cspy.online.bean;

import java.util.ArrayList;
import java.util.List;

public class UserTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(String value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(String value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(String value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(String value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(String value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLike(String value) {
            addCriterion("gmt_create like", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotLike(String value) {
            addCriterion("gmt_create not like", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<String> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<String> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(String value1, String value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(String value1, String value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(String value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(String value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(String value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(String value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(String value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(String value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLike(String value) {
            addCriterion("gmt_modified like", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotLike(String value) {
            addCriterion("gmt_modified not like", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<String> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<String> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(String value1, String value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(String value1, String value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailValidIsNull() {
            addCriterion("email_valid is null");
            return (Criteria) this;
        }

        public Criteria andEmailValidIsNotNull() {
            addCriterion("email_valid is not null");
            return (Criteria) this;
        }

        public Criteria andEmailValidEqualTo(Byte value) {
            addCriterion("email_valid =", value, "emailValid");
            return (Criteria) this;
        }

        public Criteria andEmailValidNotEqualTo(Byte value) {
            addCriterion("email_valid <>", value, "emailValid");
            return (Criteria) this;
        }

        public Criteria andEmailValidGreaterThan(Byte value) {
            addCriterion("email_valid >", value, "emailValid");
            return (Criteria) this;
        }

        public Criteria andEmailValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("email_valid >=", value, "emailValid");
            return (Criteria) this;
        }

        public Criteria andEmailValidLessThan(Byte value) {
            addCriterion("email_valid <", value, "emailValid");
            return (Criteria) this;
        }

        public Criteria andEmailValidLessThanOrEqualTo(Byte value) {
            addCriterion("email_valid <=", value, "emailValid");
            return (Criteria) this;
        }

        public Criteria andEmailValidIn(List<Byte> values) {
            addCriterion("email_valid in", values, "emailValid");
            return (Criteria) this;
        }

        public Criteria andEmailValidNotIn(List<Byte> values) {
            addCriterion("email_valid not in", values, "emailValid");
            return (Criteria) this;
        }

        public Criteria andEmailValidBetween(Byte value1, Byte value2) {
            addCriterion("email_valid between", value1, value2, "emailValid");
            return (Criteria) this;
        }

        public Criteria andEmailValidNotBetween(Byte value1, Byte value2) {
            addCriterion("email_valid not between", value1, value2, "emailValid");
            return (Criteria) this;
        }

        public Criteria andCallIsNull() {
            addCriterion("call is null");
            return (Criteria) this;
        }

        public Criteria andCallIsNotNull() {
            addCriterion("call is not null");
            return (Criteria) this;
        }

        public Criteria andCallEqualTo(String value) {
            addCriterion("call =", value, "call");
            return (Criteria) this;
        }

        public Criteria andCallNotEqualTo(String value) {
            addCriterion("call <>", value, "call");
            return (Criteria) this;
        }

        public Criteria andCallGreaterThan(String value) {
            addCriterion("call >", value, "call");
            return (Criteria) this;
        }

        public Criteria andCallGreaterThanOrEqualTo(String value) {
            addCriterion("call >=", value, "call");
            return (Criteria) this;
        }

        public Criteria andCallLessThan(String value) {
            addCriterion("call <", value, "call");
            return (Criteria) this;
        }

        public Criteria andCallLessThanOrEqualTo(String value) {
            addCriterion("call <=", value, "call");
            return (Criteria) this;
        }

        public Criteria andCallLike(String value) {
            addCriterion("call like", value, "call");
            return (Criteria) this;
        }

        public Criteria andCallNotLike(String value) {
            addCriterion("call not like", value, "call");
            return (Criteria) this;
        }

        public Criteria andCallIn(List<String> values) {
            addCriterion("call in", values, "call");
            return (Criteria) this;
        }

        public Criteria andCallNotIn(List<String> values) {
            addCriterion("call not in", values, "call");
            return (Criteria) this;
        }

        public Criteria andCallBetween(String value1, String value2) {
            addCriterion("call between", value1, value2, "call");
            return (Criteria) this;
        }

        public Criteria andCallNotBetween(String value1, String value2) {
            addCriterion("call not between", value1, value2, "call");
            return (Criteria) this;
        }

        public Criteria andCallValidIsNull() {
            addCriterion("call_valid is null");
            return (Criteria) this;
        }

        public Criteria andCallValidIsNotNull() {
            addCriterion("call_valid is not null");
            return (Criteria) this;
        }

        public Criteria andCallValidEqualTo(Byte value) {
            addCriterion("call_valid =", value, "callValid");
            return (Criteria) this;
        }

        public Criteria andCallValidNotEqualTo(Byte value) {
            addCriterion("call_valid <>", value, "callValid");
            return (Criteria) this;
        }

        public Criteria andCallValidGreaterThan(Byte value) {
            addCriterion("call_valid >", value, "callValid");
            return (Criteria) this;
        }

        public Criteria andCallValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("call_valid >=", value, "callValid");
            return (Criteria) this;
        }

        public Criteria andCallValidLessThan(Byte value) {
            addCriterion("call_valid <", value, "callValid");
            return (Criteria) this;
        }

        public Criteria andCallValidLessThanOrEqualTo(Byte value) {
            addCriterion("call_valid <=", value, "callValid");
            return (Criteria) this;
        }

        public Criteria andCallValidIn(List<Byte> values) {
            addCriterion("call_valid in", values, "callValid");
            return (Criteria) this;
        }

        public Criteria andCallValidNotIn(List<Byte> values) {
            addCriterion("call_valid not in", values, "callValid");
            return (Criteria) this;
        }

        public Criteria andCallValidBetween(Byte value1, Byte value2) {
            addCriterion("call_valid between", value1, value2, "callValid");
            return (Criteria) this;
        }

        public Criteria andCallValidNotBetween(Byte value1, Byte value2) {
            addCriterion("call_valid not between", value1, value2, "callValid");
            return (Criteria) this;
        }

        public Criteria andUserValidIsNull() {
            addCriterion("user_valid is null");
            return (Criteria) this;
        }

        public Criteria andUserValidIsNotNull() {
            addCriterion("user_valid is not null");
            return (Criteria) this;
        }

        public Criteria andUserValidEqualTo(Byte value) {
            addCriterion("user_valid =", value, "userValid");
            return (Criteria) this;
        }

        public Criteria andUserValidNotEqualTo(Byte value) {
            addCriterion("user_valid <>", value, "userValid");
            return (Criteria) this;
        }

        public Criteria andUserValidGreaterThan(Byte value) {
            addCriterion("user_valid >", value, "userValid");
            return (Criteria) this;
        }

        public Criteria andUserValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_valid >=", value, "userValid");
            return (Criteria) this;
        }

        public Criteria andUserValidLessThan(Byte value) {
            addCriterion("user_valid <", value, "userValid");
            return (Criteria) this;
        }

        public Criteria andUserValidLessThanOrEqualTo(Byte value) {
            addCriterion("user_valid <=", value, "userValid");
            return (Criteria) this;
        }

        public Criteria andUserValidIn(List<Byte> values) {
            addCriterion("user_valid in", values, "userValid");
            return (Criteria) this;
        }

        public Criteria andUserValidNotIn(List<Byte> values) {
            addCriterion("user_valid not in", values, "userValid");
            return (Criteria) this;
        }

        public Criteria andUserValidBetween(Byte value1, Byte value2) {
            addCriterion("user_valid between", value1, value2, "userValid");
            return (Criteria) this;
        }

        public Criteria andUserValidNotBetween(Byte value1, Byte value2) {
            addCriterion("user_valid not between", value1, value2, "userValid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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