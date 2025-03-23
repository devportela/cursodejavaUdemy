package heranca;

import heranca.account;

public class program {
    public static void main(String[] args) {

        account acc1 = new account(1001,"gustavo",1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        account acc2 = new Savingsaccount(1002,"joao",1000.0,0.01);
        System.out.println(acc2.getBalance());

        account acc3 = new BusinnesAccount(1003,"bob",1000.0,500.0);
        System.out.println(acc3.getBalance());
    }
}
