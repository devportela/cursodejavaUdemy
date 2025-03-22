package heranca;

public class Savingsaccount extends account{

    private Double interestRate;

    public Savingsaccount(){
        super();
    }

    public Savingsaccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance(){
        balance += balance * interestRate;
    }
}
