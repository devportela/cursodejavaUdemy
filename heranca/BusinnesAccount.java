package heranca;

public class BusinnesAccount extends account {

    private Double loanLimit;

    public BusinnesAccount() {
        super();
    }

    public BusinnesAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
          balance += amount - 10.0;
        }
    }
    @Override //indica ao complilador que estamos sobrepondo o metodo withdraw
    public void withdraw(double amount){
    super.withdraw(amount);
    balance -= 2.0;
    }

}