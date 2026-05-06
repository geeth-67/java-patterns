package BuilderPattern;

public class InsurancePolicy {

    private String policyType;
    private String holderName;
    private Double coverageAmount;
    private Double monthlyPayment;
    private Boolean isActive;

    private InsurancePolicy() {}


    public static final class Builder {    // nested class

        private String policyType;
        private String holderName;
        private Double coverageAmount;
        private Double monthlyPayment;
        private Boolean isActive;

        public Builder() {}
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" + "policyType='" + policyType + '\'' + ", holderName='" + holderName + '\'' +
                ", coverageAmount=" + coverageAmount + ", monthlyPayment=" + monthlyPayment + ", isActive=" + isActive + '}';
    }
}