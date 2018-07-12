package modelo;

/**
 * Classe responsável por armazenar os atributos e métodos do objeto VENDEDOR
 * @author Diego Munhoz
 * @since 06/02/2014
 */

public class Vendedor extends Funcionario implements InterfaceFuncionario{//inicio da classe
	
	private double meta;
	private double comissao;

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao){
		this.comissao = comissao;
	}
	
	public double getMeta() {
		return meta;
	}

	public void setMeta(double meta) {
		this.meta = meta;
	}

	public void exibirDados(){
		super.exibirDados();
		System.out.println("Meta....: " + getMeta());
		System.out.println("Comissão: " + getComissao());
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