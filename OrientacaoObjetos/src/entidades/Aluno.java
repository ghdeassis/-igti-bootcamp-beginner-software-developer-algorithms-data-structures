package entidades;

public final class Aluno extends Pessoa {
	private Integer matricula;
			
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(String nome, String cpf, String telefone, String endereco, Integer matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.matricula = matricula;		
	}
	
	public String enderecoCompleto() {
		return "Sobreescrevi o m�todo";
	}
	
	public String informaTipo() {
		return "Meu tipo � Aluno";
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
}
