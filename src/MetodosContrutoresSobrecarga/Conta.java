package MetodosContrutoresSobrecarga;

import java.util.Objects;

public class Conta {
    People person;//titular
    int agency;
    int number;
    double balance;//saldo
    public int initialBalance;

    Conta(){
    }
    
    Conta(People person, int agency,int number,int initialBalance){
        Objects.requireNonNull(person);
        this.person=person;
        this.agency=agency;
        this.number=number;
        this.balance=initialBalance;
    }

    void deposit(double value){
        if(value<=0){
            throw new IllegalArgumentException("Valor deve ser maior que 0 para ser aceito!");
        }
        balance+=value;
    }

    void withdraw(double value){//to withdraw-.withdraw==sacar
        if(value<=0){
            throw new IllegalArgumentException("Valor deve ser maior que 0 para ser aceito!");
        }
        if(balance-value<0){
            throw new IllegalArgumentException("Saldo insuficiente para o saque");
        }
        balance-=value;
    }

    //withdrawfee taxa de saque
    void withdraw(double value, double withdrawFee) {
        withdraw(value + withdrawFee);
    }

}
