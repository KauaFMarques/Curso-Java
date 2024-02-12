package Excecoes.app;

import Excecoes.modelo.*;
import Excecoes.modelo.atm.CaixaEletronico;
import Excecoes.modelo.excecao.SaldoInsuficienteException;
import Excecoes.modelo.pagamento.Boleto;
import Excecoes.modelo.pagamento.Holerite;

public class Principal {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da Silva");
        titular1.setDocumento("12312312311");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("22233344455");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
        ContaEspecial suaConta = new ContaEspecial(titular2, 222, 333, 1_000);

        try {
            minhaConta.depositar(30_000);
            minhaConta.sacar(1_000);

            suaConta.depositar(15_000);
            suaConta.sacar(15_500);
            suaConta.debitarTarifaMensal();

            Boleto boletoEscola = new Boleto(titular2, 35_000);
            Holerite salarioFuncionario = new Holerite(titular2, 100, 160);

            caixaEletronico.pagar(boletoEscola, minhaConta);
            caixaEletronico.pagar(salarioFuncionario, minhaConta);

            caixaEletronico.estornarPagamento(boletoEscola, minhaConta);

            boletoEscola.imprimirRecibo();
            salarioFuncionario.imprimirRecibo();
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao executar operação na conta: " + e.getMessage());
        }

        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);
    }

}
