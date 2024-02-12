package MetodosContrutoresSobrecarga;

public class Principal {
    public static void main(String[] args) throws Exception {
        People person1=new People();
        person1.name="joão da Silva";
        person1.document="12312312311";

        People person2=new People();
        person2.name= "Maria Abadia";
        person2.document= "22233344455";

        Conta myAccount = new Conta(person1,123,987,15000);
        Conta yourAccount = new Conta(person2,123,987,15000);

        myAccount.deposit(1);
        System.out.println("Depois do deposito:"+myAccount.balance);
        myAccount.withdraw(1000);
        System.out.println("Depois do saque "+myAccount.balance);

        yourAccount.withdraw(1000,10);
        System.out.println("Depois do saque "+yourAccount.balance);

    }
}
