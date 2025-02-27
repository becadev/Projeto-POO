package GerenciadorFinanceiro;
import java.util.Scanner;

public class GerenciadorFinanceiroMain {
    public static void main(String[] args) {

        System.out.println("\n+-------------------------------------------------------------+");
        System.out.println("| Bem vind@ ao seu sistema de gerenciamento financeiro pessoal|");
        System.out.println("+-------------------------------------------------------------+");
        Scanner input = new Scanner(System.in);
        int op = 0;
        Gerenciador sistema = new Gerenciador();
        while(op != 8){
            System.out.println(
                    "\nOPÇÕES DO SISTEMA:\n" +
                    "1 - Cadastrar Receita\n" +
                    "2 - Cadastrar Gasto\n" +
                    "3 - Cadastrar Meta\n" +
                    "4 - Visualizar Finanças do Mês\n" +
                    "5 - Atualizar Meta\n" +
                    "6 - Visualizar Categoria Específica\n" +
                    "7 - Visualizar Finanças gerais\n" +
                    "8 - Sair");
            System.out.print("Opção: ");
            op = input.nextInt();
            System.out.println("\n");
            if(op == 1){
                System.out.println("\n-----------------CADASTRAR RECEITA-----------------\n");
                System.out.print("Descrição: ");
                input.nextLine();
                String descricao = input.nextLine();
                System.out.print("Valor: R$ ");
                double valor = input.nextDouble();
                input.nextLine();
                System.out.print("Data: ");
                String data = input.nextLine();
                sistema.cadastrarReceita(descricao, valor, data);
            }
            if(op == 2){
                System.out.println("-----------------CADASTRAR GASTO-----------------");
                System.out.print("Descrição: ");
                input.nextLine();
                String descricao = input.nextLine();
                System.out.print("Valor: R$ ");
                double valor = input.nextDouble();
                input.nextLine();
                System.out.print("Data: ");
                String data = input.nextLine();
                sistema.cadastrarGasto(descricao, valor, data);
            }

            if(op == 3){
                System.out.println("-----------------CADASTRAR META-----------------");
                System.out.print("Descrição: ");
                String descricao = input.nextLine();
                input.nextLine();
                System.out.print("Data de início: ");
                String dataIn= input.nextLine();
                System.out.print("Data de término: ");
                String dataFim = input.nextLine();
                System.out.print("Qual valor deseja economizar: R$ ");
                double valor = input.nextDouble();
                String situacao = "iniciada";
                sistema.cadastrarMeta(descricao, dataIn, dataFim, situacao, valor);
            }
            if(op == 4){
                System.out.println("-----------------VISUALIZAR FINANÇAS DO MÊS-----------------");
                System.out.print("Mês(minúsculo e sem acento): ");
                input.nextLine();
                String mes = input.nextLine();
                sistema.visuGeralMes(mes);
            }
            if(op == 5){
                System.out.println("----------------ATUALIZAR META-----------------");
                listarMetas();
                System.out.print("Qual meta deseja atualizar: ");
                input.nextLine();
                String meta = input.nextLine();
                System.out.print("Novo status da meta: ");
                input.nextLine();
                String m = input.nextLine();

                sistema.atualizarMeta(meta, m);
            }
        }
        input.close();
    }
}
