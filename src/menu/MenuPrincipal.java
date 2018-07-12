package menu;

import java.util.Scanner;

import modelo.Endereco;
import modelo.Faxineira;
import modelo.Livro;
import modelo.Mensagem;
import modelo.Vendedor;

/**
 * Classe responsável por controlar locação de livros
 * @author Diego
 * @since 06/02/2014
 */

public class MenuPrincipal {//inicio da classe

	public static void main(String[] args) {//inicio do método main
		
		Scanner teclado = new Scanner(System.in);
		Livro listaLivro[] = new Livro[3];
		Vendedor listaVendedor[] = new Vendedor[3];
		Faxineira listaFaxineira[] = new Faxineira[3];
		int v = 0;
		int f = 0;
		int l = 0;
		
		for (;true;) {
			System.out.println(Mensagem.OPCAO);
			System.out.println(Mensagem.INCLUIRVENDEDOR);
			System.out.println(Mensagem.INCLUIRFAXINEIRA);
			System.out.println(Mensagem.INCLUIRLIVRO);
			System.out.println(Mensagem.INCLUIRVENDALIVRO);
			System.out.println(Mensagem.CONSULTARFUNCIONARIO);
			System.out.println(Mensagem.CONSULTARVENDALIVRO);
			System.out.println(Mensagem.OPCAOSAIR);
			System.out.println(Mensagem.OPCAO);
			int opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcao) {
			case 1:
				Vendedor vendedor = new Vendedor();
				Endereco enderecoVendedor = new Endereco();
				vendedor.setEndereco(enderecoVendedor);
				if (v >= listaVendedor.length) {
					System.out.println("NÃO É POSSÍVEL CADASTRAR");
				} else {
					System.out.println(Mensagem.NOME);
					vendedor.setNome(teclado.nextLine());
					System.out.println(Mensagem.LOGADOURO);
					vendedor.getEndereco().setLogradouro(teclado.nextLine());
					try {
						System.out.println(Mensagem.NUMERO);
						vendedor.getEndereco().setNumero(teclado.nextByte());						
					} catch (Exception e) {
						System.out.println("Valor digitado incompatível");
					}
					teclado.nextLine();
					System.out.println(Mensagem.COMPLEMENTO);
					vendedor.getEndereco().setComplemento(teclado.nextLine());
					System.out.println(Mensagem.BAIRRO);
					vendedor.getEndereco().setBairro(teclado.nextLine());
					System.out.println(Mensagem.CIDADE);
					vendedor.getEndereco().setCidade(teclado.nextLine());
					System.out.println(Mensagem.ESTADO);
					vendedor.getEndereco().setEstado(teclado.nextLine());
					System.out.println(Mensagem.CEP);
					vendedor.getEndereco().setCep(teclado.nextLine());
					try {						
						System.out.println(Mensagem.IDADE);
						vendedor.setIdade(teclado.nextByte());
					} catch (Exception e) {
						System.out.println("Valor digitado incompatível");
					}
					try {
						System.out.println(Mensagem.SALARIO);
						vendedor.setSalario(teclado.nextDouble());						
					} catch (Exception e) {
						System.out.println("Valor digitado incompatível");
					}
					try {						
						System.out.println(Mensagem.META);
						vendedor.setMeta(teclado.nextDouble());
					} catch (Exception e) {
						System.out.println("Valor digitado incompatível");
					}
					try {
						System.out.println(Mensagem.COMISSAO);
						vendedor.setComissao(teclado.nextDouble());						
					} catch (Exception e) {
						System.out.println("Valor digitado incompatível");
					}
					teclado.nextLine();
					listaVendedor[v] = vendedor;
					v++;
				}
				break;
				
			case 2:
				Faxineira faxineira = new Faxineira();
				Endereco enderecoFaxineira = new Endereco();
				faxineira.setEndereco(enderecoFaxineira);
				if (f >= listaFaxineira.length) {
					System.out.println("NÃO É POSSÍVEL CADASTRAR");
				} else {
					System.out.println(Mensagem.NOME);
					faxineira.setNome(teclado.nextLine());
					System.out.println(Mensagem.LOGADOURO);
					faxineira.getEndereco().setLogradouro(teclado.nextLine());
					try {
						System.out.println(Mensagem.NUMERO);
						faxineira.getEndereco().setNumero(teclado.nextByte());						
					} catch (NumberFormatException e) {
						System.out.println("Valor digitado incompatível");
					}
					teclado.nextLine();
					System.out.println(Mensagem.COMPLEMENTO);
					faxineira.getEndereco().setComplemento(teclado.nextLine());
					System.out.println(Mensagem.BAIRRO);
					faxineira.getEndereco().setBairro(teclado.nextLine());
					System.out.println(Mensagem.CIDADE);
					faxineira.getEndereco().setCidade(teclado.nextLine());
					System.out.println(Mensagem.ESTADO);
					faxineira.getEndereco().setEstado(teclado.nextLine());
					System.out.println(Mensagem.CEP);
					faxineira.getEndereco().setCep(teclado.nextLine());
					try {
						System.out.println(Mensagem.IDADE);
						faxineira.setIdade(teclado.nextByte());						
					} catch (Exception e) {
						System.out.println("Valor digitado incompatível");
					}
					try {
						System.out.println(Mensagem.SALARIO);
						faxineira.setSalario(teclado.nextDouble());
					} catch (Exception e) {
						System.out.println("Valor digitado incompatível");
					}
					teclado.nextLine();
					System.out.println(Mensagem.TELEFONE);
					faxineira.setTelefone(teclado.nextLine());
					System.out.println(Mensagem.CELULAR);
					faxineira.setCelular(teclado.nextLine());
					System.out.println(Mensagem.EMAIL);
					faxineira.setEmail(teclado.nextLine());
					listaFaxineira[f] = faxineira;
					f++;
				}
				break;
				
			case 3:
				Livro livro = new Livro();				
				if (l >= listaLivro.length) {
					System.out.println("NÃO É POSSÍVEL CADASTRAR");
				} else {
					System.out.println(Mensagem.TITULO);
					livro.setTitulo(teclado.nextLine());
					System.out.println(Mensagem.AUTOR);
					livro.setAutor(teclado.nextLine());
					System.out.println(Mensagem.EDITORA);
					livro.setEditora(teclado.nextLine());
					System.out.println(Mensagem.ANOLANCAMENTO);
					livro.setAnoLancamento(teclado.nextLine());
					try {
						System.out.println(Mensagem.CUSTO);
						livro.setCusto(teclado.nextDouble());						
					} catch (Exception e) {
						System.out.println("Valor digitado incompatível");
					}
					try {
						System.out.println(Mensagem.VENDA);
						livro.setVenda(teclado.nextDouble());
					} catch (Exception e) {
						System.out.println("Valor digitado incompatível");
					}
					try {
						System.out.println(Mensagem.ESTOQUE);
						livro.setEstoque(teclado.nextInt());						
					} catch (Exception e) {
						System.out.println("Valor digitado incompatível");
					}
					teclado.nextLine();
					System.out.println(Mensagem.GENERO);
					livro.setGenero(teclado.nextLine());	
					listaLivro[l] = livro;
					l++;
				}
				break;
				
			case 4:

				break;

			case 5:
				if (v > 0) {
					for (int j = 0; j < v; j++) {
						listaVendedor[v].exibirDados();
					}
				}else{
					System.out.println("NÃO HA DADOS A SEREM EXIBIDOS");
				}
				break;
				
			case 6:
				if (l > 0) {
					for (int j = 0; j < l; j++) {
						listaVendedor[l].exibirDados();
					}
				}else{
					System.out.println("NÃO HA DADOS A SEREM EXIBIDOS");
				}				
				break;
				
			case 0:
				System.exit(0);
				break;

			default:
				System.out.println("MENSAGEM: OPÇÃO INVÁLIDA!");
				break;
				
			}//fim do case
			
		}//fim do for
		
	}//fim do main

}//fim da classe