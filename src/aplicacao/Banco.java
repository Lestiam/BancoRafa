package aplicacao;

import aplicacao.entidade.Cliente;
import aplicacao.entidade.ContaCorrente;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        ContaCorrente c1 = new ContaCorrente();
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Pedro");

        c1.setNumero(1);
        c1.setCliente(cliente1);
        c1.setSaldo(50.00);
        c1.deposita(100.0);

        ContaCorrente c2 = new ContaCorrente();
        Cliente cliente2 = new Cliente();
        cliente2.setNome("João");
        c2.setNumero(2);
        c2.setCliente(cliente2);

        c2.setSaldo(100.0);
        c2.deposita(200.00);


        System.out.println(c1);
        System.out.println(c2);

        List contas = new ArrayList();
        contas.add(c1);
        contas.add(c2);


        System.out.println(contas.size());

        for(int i = 0; i < contas.size(); i++) {
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println("A conta " + cc.getNumero() + " do cliente "
                    +cc.getCliente().getNome() + " possui saldo: "
                    +cc.getSaldo());
        }

//        for (int i = 0; i < contas.size(); i++) {
//            System.out.println(contas.get(i));
//        }


        sc.close();
    }
}

