package Pacotes.Modelo;

import java.util.Objects;

public class Conta {
    private Pessoa holder;
    private int number;
    private int agency;
    private double balance;
    
    Conta(){
    }

    public Conta(Pessoa holder,int number,int agency){
        Objects.requireNonNull(holder);

        this.holder=holder;
        this.number=number;
        this.agency=agency;
    }

    public void deposit(double value){
        if(value<=0){
            throw new IllegalArgumentException("Valor deve ser superior a 0");
        }
         balance=balance+value;
    }

    public void toWithdraw(double value){
        if(value<=0){
            throw new IllegalArgumentException("Valor deve ser superior a 0");
        }

        if(balance-value <= 0){
            throw new IllegalStateException("Saldo insuficiente");
        }
        balance=balance-value;
    }

    public void toWithdraw(double value,double feeWithdraw){
            toWithdraw(value+feeWithdraw);
    }

    public Pessoa getPessoa(){
        return holder;
    }

    public int getAgency(){
        return agency;
    }

    public int getNumber(){
        return number;
    }
    public double getBalance(){
        return balance;
    }


}
