package modelo;

/**
 * Classe responsável por armazenar os atributos e métodos do objeto FAXINEIRA
 * @author Diego Munhoz
 * @since 06/02/2014
 */

public class Faxineira extends Funcionario implements InterfaceFuncionario{//inicio da classe
	
	private String telefone;
	private String celular;
	private String email;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void exibirDados(){
		super.exibirDados();
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Celular.: " +getCelular());
		System.out.println("E-mail..: " + getEmail());
	}

	@Override
	public void calculaSalario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar(int codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(int codigo) {
		// TODO Auto-generated method stub
		
	}

}//fim da classe