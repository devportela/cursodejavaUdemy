package heranca;
import heranca.account;
public class program {
    public static void main(String[] args) {
        account acc = new account(1001,"Alex",0.0);
        BusinnesAccount bacc = new BusinnesAccount(1002,"Marinalva",0.0,500.0);


        //upcasting
        account acc1 = bacc;
        account acc2 = new BusinnesAccount(1003,"bob",0.0,200.0);
        account acc3 = new Savingsaccount(1004,"ana",0.0,0.01);


        //downcasting

        BusinnesAccount acc4 = (BusinnesAccount)acc2; //forçando casting
        //exemplo de emprestimo
        acc4.loan(100.0);


        if (acc3 instanceof BusinnesAccount){
            BusinnesAccount acc5 = (BusinnesAccount) acc3; //complidador nao reconhece que o acc3 é do tipo savingsAccount
            System.out.println("emprestimo feito");
        }
        if (acc3 instanceof Savingsaccount){
            Savingsaccount acc5 = (Savingsaccount)acc3;
            acc5.updateBalance();
            System.out.println("update!");
        }

    }
}
