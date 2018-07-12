package modelo;

/**
 * Classe responsável por armazenar atributos genéricos utilizados por
 * FUNCIONARIO em outras classes(HERANÇA)
 * @author Diego Munhoz
 * @since 06/02/2014
 */

public abstract class Funcionario {// inicio da classe

	private String nome;
	private byte idade;
	private double salario;
	private Endereco endereco;
	private Data dataContratacao;
	private String turno;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Data getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Data dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void exibirDados() {
		System.out.println("Nome.......: " + getNome());
		System.out.println("Logadouro..: " + endereco.getLogradouro());
		System.out.println("Numero.....: " + endereco.getNumero());
		System.out.println("Complemento: " + endereco.getComplemento());
		System.out.println("Bairro.....: " + endereco.getBairro());
		System.out.println("Cidade.....: " + endereco.getCidade());
		System.out.println("Estado.....: " + endereco.getEstado());
		System.out.println("CEP........: " + endereco.getCep());
		System.out.println("Idade......: " + getIdade());
		System.out.println("Salario....: " + getSalario());
		System.out.println("Data de Contratação: " + getDataContratacao());
		System.out.println("Turno......: " + getTurno());
	}
	
	public abstract void calculaSalario();

}// fim da classe