package heranca;

public class SavingsaccountPlus extends Savingsaccount{
    @Override
    public void witdraw(double amount){
        balance  -= amount + 2.0;
    } //exemplo de erro de metodo da superclasse pra a subclasse

}
