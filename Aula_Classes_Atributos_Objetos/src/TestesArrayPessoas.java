// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRAYS de OBJETOS em JAVA
// Ano/S: 2026/1S
// -------------------------------------

// importação de class para leitura de dados do teclado
import java.util.Scanner;

// classe que realiza os testes solicitados
// ----------------------------------------
public class TestesArrayPessoas {

    // Acionador dos testes (este método é chamado pelo 'CoordenadorExecucao')
    // (recebe como argumento o objeto 'Scanner' para a interação com o teclado)
    public void realizaTestes(Scanner teclado) {

        // Ação 1
        // Criar um array unidimensional de Pessoa, em que cada elemento é um objeto da
        // classe Pessoa.
        // O array deve permitir o armazenamento de dados de 4 pessoas.
        Pessoa[] pessoas = new Pessoa[4];

        // Ação 2
        // Preencher o conteúdo do array a partir de dados obtidos via teclado, uma
        // pessoa por vez.
        // Utilizar o método construtor para transferir os dados a cada objeto da classe
        // Pessoa.
        for(int i = 0; i < pessoas.length; i++) {
            //Coletar dados do obejto da Pessoa
            System.out.println("\n====================================");
            System.out.println("  Cadastro da " + (i+1) + "° Pessoa");
            System.out.println("====================================");
            System.out.print("Informe o nome..................: ");
            String nome = teclado.nextLine();
            System.out.print("Informe o CPF...................: ");
            String cpf = teclado.nextLine();
            System.out.print("Informe a data de nasc. (DD/MM/AAAA): ");
            String dataNascimento = teclado.nextLine();
            System.out.print("Informe a cidade de nascimento..: ");
            String cidadadeNascimento = teclado.nextLine();
            System.out.println("====================================");

            //Instanciando o obejto Pessoa, transferindo os dados para o construtor
            pessoas[i] = new Pessoa(nome, cpf, dataNascimento, cidadadeNascimento);
        }
        // Ação 3
        // Exibir o conteúdo do array utilizando o comando 'for' (convencional, que
        // utiliza um contador)
        // e os métodos 'getters' previstos na classe Pessoa.
        System.out.println("\n====================================");
        System.out.println("  Exibindo Pessoas (for + getters)");
        System.out.println("====================================");
        for(int i = 0; i < pessoas.length; i++) {
            System.out.println("------------------------------------");
            System.out.printf("  Pessoa %d:\n", (i + 1));
            System.out.println("  Nome..............: " + pessoas[i].getNome());
            System.out.println("  CPF...............: " + pessoas[i].getCpf());
            System.out.println("  Data de nascimento: " + pessoas[i].getDataNascimento());
            System.out.println("  Cidade nascimento.: " + pessoas[i].getCidadeNascimento());
        }
        System.out.println("------------------------------------");

        // Ação 4
        // Por meio dos métodos 'setters' previstos na classe Pessoa, alterar os
        // atributos de
        // uma das pessoas cujos dados estão armazenados no array.
        pessoas[2].setNome("Matheus de Paula Santos");
        pessoas[2].setCpf("999.999.999-99");
        pessoas[2].setDataNascimento("08/11/2006");
        pessoas[2].setCidadeNascimento("São Paulo");
    
        // Ação 5
        // Exibir o conteúdo do array utilizando o comando 'for' (na versão
        // simplificada, que não exige
        // um contador para iterar) e o método de impressão previsto na classe Pessoa.
        for (Pessoa p : pessoas) {
            p.exibeDadosPessoa();
        }
    }

}
