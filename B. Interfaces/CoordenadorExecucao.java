// ----------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : INTERFACES em JAVA
// Ano/S: 2026/1S
// ----------------------------------------
 
// importação de pacotes - AMBIENTE
import java.util.Scanner;

// classe principal (faz o papel efetivo de 'main',
// sendo instanciada pelo programa principal do projeto):
// classe coordenadora da execução dos testes
// ------------------------------------------------------
public class CoordenadorExecucao {

    // método que realiza todos os testes
    public void executaTudo() {

        // criação de um objeto 'Scanner' para a interação com o teclado
        Scanner teclado = new Scanner(System.in);

        // declaração de constantes para uso no menu
        final int PROCESSAMENTO_COMPRAS  = 1;
        final int PROCESSAMENTO_SALARIOS = 2;
        final int PROCESSAMENTO_CONJUNTO = 3;
        final int SAIR = 9;

        // declaração de variáveis a serem usadas (independentemente da Atividade)
        int escolha;

        // menu de escolha da Atividade a ser executada
        do {
            // apresentação das opções de escolha
            System.out.println("\n");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Atividade 1: Processamento exclusivo de objetos da  classe  'Compra'");
            System.out.println("2 - Atividade 2: Processamento exclusivo de objetos da  classe  'EmpregadoAssalariado'");
            System.out.println("3 - Atividade 3: Processamento conjunto  de objetos das classes 'Compra' e 'EmpregadoAssalariado'");
            System.out.println("9 - Sair");

            System.out.print("\nDigite aqui a sua opção: ");
            // coleta da opção digitada
            escolha = teclado.nextInt();
            teclado.nextLine();

            // avaliação da opção e acionamento da respectiva Atividade
            switch (escolha) {

                case PROCESSAMENTO_COMPRAS:
                    System.out.println("\n1 - Atividade 1: Processamento de objetos da classe 'Compra'");
                    System.out.println("--------------------------------------------------------------");

                    // cria um array de objetos 'Compra' de quatro elementos
                    Compra compras[] = new Compra[4];

                    // inicializa o array com objetos da classe 'Compra'          
                    compras[0] = new Compra("012", "celular",  2,  999.00 );
                    compras[1] = new Compra("345", "smartTV",  1, 1999.00 );;
                    compras[2] = new Compra("678", "notebook", 1, 3999.00 );;
                    compras[3] = new Compra("910", "fones",    4,  199.00 );;
                    
                    System.out.println("Compras processadas exclusivamente:\n");

                    // processa genericamente cada elemento do array 'compras'
                    for (Compra compraAtual : compras) {
                        
                        // exibe dados de cada compra, invocando toString e calculando pagamento
                        System.out.printf("%s\n%s: R$%,.2f\n\n",
                                compraAtual,"Valor total", compraAtual.getPagamento());

                    } // final do 'for'

                    break;

                case PROCESSAMENTO_SALARIOS:
                    System.out.println("\n2 - Atividade 2: Processamento de objetos da classe 'EmpregadoAssalariado'");
                    System.out.println("----------------------------------------------------------------------------");

                    // cria um array de objetos 'EmpregadoAssalariado' de quatro elementos
                    EmpregadoAssalariado empregadosAssalariados[] = new EmpregadoAssalariado[4];

                    // inicializa o array com objetos 'EmpregadoAssalariado'

                    empregadosAssalariados[0] =
                        new EmpregadoAssalariado(
                            "Carlos",
                            "Filho",
                            "111.111.111-11",
                            13,
                            8,
                            1979,
                            1000.00 );

                    empregadosAssalariados[1] =
                        new EmpregadoAssalariado(
                            "Marcos",
                            "Neto",
                            "222.222.222-22",
                            31,
                            3,
                            1991,
                            1500.00 );;

                    empregadosAssalariados[2] =
                        new EmpregadoAssalariado(
                            "Renato",
                            "Sobrinho",
                            "333.333.333-33",
                            5,
                            11,
                            1998,
                            2000.00 );;

                    empregadosAssalariados[3] =
                        new EmpregadoAssalariado(
                            "Robert",
                            "Junior",
                            "444.444.444-44",
                            25,
                            10,
                            2001,
                            2500.00 );;
                    
                    System.out.println("Empregados assalariados processados exclusivamente:\n");

                    // processa cada elemento do array 'empregadosAssalariados'
                    for (EmpregadoAssalariado empregadoAtual : empregadosAssalariados) {
                        
                        // exibe dados de cada empregado, invocando toString e calculando pagamento
                        System.out.printf("%s\n%s: R$%,.2f\n\n",
                                empregadoAtual,"Salário total", empregadoAtual.getPagamento());

                    } // final do 'for'

                    break;

                case PROCESSAMENTO_CONJUNTO:
                    System.out.println("\n3 - Atividade 3: Processamento conjunto de objetos das classes 'Compra' e 'EmpregadoAssalariado'");
                    System.out.println("---------------------------------------------------------------------------------------------------");

                    // cria array de objetos 'Pagavel' de quatro elementos
                    Pagavel objetosPagaveis[] = new Pagavel[ 4 ];
      
                    // preenche o array com objetos que implementam 'Pagavel'

                    objetosPagaveis[ 0 ] = new Compra( "01234", "power bank", 2, 375.00 );

                    objetosPagaveis[ 1 ] = new Compra( "56789", "cabo HDMI", 4, 79.95 );

                    objetosPagaveis[ 2 ] =  
                        new EmpregadoAssalariado(
                            "Joel",
                            "Oliveira",
                            "555.555.555-55",
                            29,
                            2,
                            2004,
                            800.00 );

                    objetosPagaveis[ 3 ] = 
                        new EmpregadoAssalariado(
                            "Lisa",
                            "Fernandes",
                            "666.666.666-66",
                            24,
                            6,
                            1994,
                            1200.00 );

                    System.out.println( 
                        "Compras e EmpregadosAssalariados processados polimorficamente:\n" ); 

                    // processa genericamente cada elemento no array 'objetosPagaveis' 
                    for ( Pagavel pagavelAtual : objetosPagaveis )
                    {
                        // gera saída de pagavelAtual e seu quantia de pagamento apropriado 
                        System.out.printf( "%s \n%s: R$%,.2f\n\n", 
                            pagavelAtual.toString(),
                            "Pagamento total", pagavelAtual.getPagamento() ); 
                    } // final do 'for'

                    // exibe os respectivos nomes das classes efetivas de cada objeto
                    System.out.println("Nome da classe efetiva de cada objeto que implementa a interface 'Pagavel':");

                    // obtém o nome do tipo de cada objeto no array 'objetosPagaveis'
                    for (int j = 0; j < objetosPagaveis.length; j++) {
                        System.out.printf("objetosPagaveis[%d] é um(a) %s\n", j,
                                objetosPagaveis[j].getClass().getName());
                    }

                    break;

                case SAIR:
                    System.out.println("\nSair ...\n");
                    break;

                default:
                    System.out.println("\nOpção inválida !  Tente novamente ...\n");
            }

        } while (escolha != SAIR);

        teclado.close();

        // aciona método para exibição dos dados do autor do trabalho
        Autor autor = new Autor();
        autor.exibeDadosAutor(
                "ESTRUTURAS DE DADOS - 2026/1S",
                "INTERFACES em JAVA",
                "GABRIEL FERNANDES RIGUETTO",
                "121 092 251 1 025");


    }

}
