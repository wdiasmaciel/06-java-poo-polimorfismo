package pessoa;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public PessoaFisica(){
	 super("nome não informado"); 
	}
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdentificacao() {
		return "Nome: " + super.getNome() + " CPF: " + this.cpf;
	}

	public String getIdentificacao(String telefone) {
		return "Nome: " + super.getNome() + " CPF: " + this.cpf + " Telefone: " + telefone;
	}
}

