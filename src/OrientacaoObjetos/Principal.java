package OrientacaoObjetos;

public class Principal {
    public static void main(String[] args) throws Exception {
        People person1=new People();
        person1.name="joão da Silva";
        person1.document="12312312311";

        People person2=new People();
        person2.name= "Maria Abadia";
        person2.document= "22233344455";

        Conta myAccount= new Conta();
        myAccount.person=person1;
        myAccount.agency=123;
        myAccount.number=987;
        myAccount.balance=15000;
        
        Conta yourAccount= new Conta();
        yourAccount.person=person2;
        yourAccount.agency=222;
        yourAccount.number=333;
        yourAccount.balance=30000;

        System.out.println("Titular:"+myAccount.person.name);
        System.out.println("Saldo:"+myAccount.balance);

        System.out.println("Titular:"+yourAccount.person.name);
        System.out.println("Saldo:"+yourAccount.balance);
    }
}
