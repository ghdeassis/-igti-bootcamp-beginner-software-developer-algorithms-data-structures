package entidades;

public class Diretor extends Pessoa {
	private String setor;
	
	public String informaTipo() {
		return "Meu tipo � Diretor";
	}
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
}
