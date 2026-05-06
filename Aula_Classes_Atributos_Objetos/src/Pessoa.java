// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRAYS de OBJETOS em JAVA
// Ano/S: 2026/1S
// -------------------------------------

// classe que modela a entidade 'Pessoa'
public class Pessoa {

	// Atributos
	// ---------
    private String nome;
	private String cpf;
	private String dataNascimento;
	private String cidadeNascimento;

	// Método Construtor
	// -----------------
	public Pessoa(String nome, String cpf, String dataNascimento, String cidadeNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.cidadeNascimento = cidadeNascimento;
	}


	// Métodos 'getters' e 'setters' (sempre 'public')
	// -----------------------------------------------
    //1. Atributo de Nome
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

    //1. Atributo de CPF
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//3. Atributo de Data de Nascimento
	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	//4. Atributo de Cidade de Nascimento
	public String getCidadeNascimento() {
		return cidadeNascimento;
	}


	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
	
	// Outros métodos ('public' ou 'private', conforme a necessidade
	// -------------------------------------------------------------

	// método para exibição dos dados da Pessoa
	public void exibeDadosPessoa() {

		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Pessoa            : " + nome); // nome da pessoa
		System.out.println("CPF               : " + cpf);    // CPF da pessoa
		System.out.println("Data de nascimento: " + dataNascimento);    // data de nascimento da pessoa
		System.out.println("Cidade onde nasceu: " + cidadeNascimento);    // cidade de nascimento da pessoa
		System.out.println("---------------------------------");
		System.out.println();

		// finalização (desnecessário neste caso, pois é procedimento 'void')
		return;
	}
}
