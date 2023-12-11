import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String nome, int idade) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
