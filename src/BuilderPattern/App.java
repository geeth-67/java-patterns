package BuilderPattern;

public class App {

    public static void main(String[] args) {

        InsurancePolicy.Builder builder = new InsurancePolicy.Builder();

        InsurancePolicy policy = builder.withPolicyType("Housing").withHolderName("Malaka").withCoverageAmount(10.00).build();
        InsurancePolicy policy01 = builder.withPolicyType("Vehicle").withHolderName("test").withCoverageAmount(1000.00).build();

        System.out.println(policy);
        System.out.println(policy01);

    }
}