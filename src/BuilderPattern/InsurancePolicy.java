package BuilderPattern;

public class InsurancePolicy {

    private String policyType;
    private String holderName;
    private Double coverageAmount;
    private Double monthlyPayment;
    private Boolean isActive;

    private InsurancePolicy(Builder builder) {

        this.policyType = builder.policyType;
        this.holderName = builder.holderName;
        this.coverageAmount = builder.coverageAmount;
        this.monthlyPayment = builder.monthlyPayment;
        this.isActive = builder.isActive;
    }


    public static final class Builder {    // nested class

        private String policyType;
        private String holderName;
        private Double coverageAmount = 0.0;
        private Double monthlyPayment;
        private Boolean isActive;

        public Builder() {}

        public Builder withPolicyType(String  type) {

            this.policyType = type;
            return this;
        }

        public Builder withHolderName(String name) {

            this.holderName = name;
            return this;
        }

        public Builder withCoverageAmount(Double amount) {

            this.coverageAmount = amount;
            return this;
        }

        public Builder withMonthlyPayment(Double payment) {

            this.monthlyPayment = payment;
            return this;
        }

        public Builder withIsActive(Boolean active) {

            this.isActive = active;
            return this;
        }

        public InsurancePolicy build() {

            if (this.coverageAmount <= 0) throw new IllegalArgumentException("Coverage amount must be greater than 0");
            return new InsurancePolicy(this);
        }
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" + "policyType='" + policyType + '\'' + ", holderName='" + holderName + '\'' +
                ", coverageAmount=" + coverageAmount + ", monthlyPayment=" + monthlyPayment + ", isActive=" + isActive + '}';
    }
}