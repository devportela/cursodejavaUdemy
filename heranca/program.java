package heranca;
import heranca.account;
import heranca.Savingsaccount;


public class program {
    public static void main(String[] args) {

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        x.withdraw(50.0);
        y.withdraw(50.0);
        // o compilador nao entende o metodo withdraw, ele apenas reconhece as variaveis que foram declaradas com a instacianção da classe.

    }
}
