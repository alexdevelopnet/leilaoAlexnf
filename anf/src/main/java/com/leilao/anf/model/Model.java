package com.leilao.anf.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Model {

	//INSTANCIANFO VARIaVEIS DO TIPO SCANNER PARA LER AS ENTRADAS DO USUaRIO E ARMAZENAR NAS VARIaVEIS DEFINIDAS ABAIXO
	private Scanner le;
	
	
	

	// DEFININDO VARIaVEIS UTILIZADAS NOS MaTODOS
	private String nome, senha, certDig, cnpj, registro, endereco, descricao,  marca, modelo, tipo,
			email;
	//private Date data;
	private Integer numLeilao, qtde, numLote, id, ano;

	
	
	
	/* Instanciando enuns
	TipoVeiculo tipoVeic;
	TipoImovel tipoImovel;*/
	
	
	
	
	//INSTANCIANDO AS CLASSES (LISTAS) 
	private static List<Cliente> clientes;
	private static List<Imovel> imoveis;
	private static List<Veiculo> veiculos;
	private static List<InstituicaoFinanceira> instFinanceiras;
	static List<Leilao> leiloes;
	static List<Lote> lotes;
	static List<Lance> lances;

	
	
	
	
	
	//CRIANDO ARRAYLISTS DAS LISTAS INSTANCIADAS
	public Model() {
		clientes = new ArrayList<>();
		imoveis = new ArrayList<>();
		instFinanceiras = new ArrayList<>();
		leiloes = new ArrayList<>();
		veiculos = new ArrayList<>();
		lotes = new ArrayList<>();
		lances = new ArrayList<>();
		//produtos = new ArrayList<>();
		
		le = new Scanner(System.in);
		
		
	}

	

	
	//FUNaaES DE INSERaaO
	
	
	void darLances() {
		System.out.println("Numero de Certificado Digital: ");
		certDig = le.next();

		for (Cliente cliente : clientes) {
			if (!certDig.equals(cliente.getCertificadoDigital())) {
				System.out.println("Cliente nao encontrado!");
				break;
			}
			// cliente = le.next();
			System.out.println("Insira o namero do Leilao: ");
			numLeilao = le.nextInt();

			for (Leilao leilao : leiloes) {
				if (numLeilao.equals(leilao.getNumeroLeilao())) {
					System.out.println("Insira o valor: ");
					Float valor = le.nextFloat();

					lances.add(new Lance(valor, cliente, leilao));
				}else{
					System.out.println("Leilao nao encontrado!");
					break;
				}
				
			}
			

		}
		

	}
	

	void inserirCliente() {

		System.out.println("Nome: ");
		nome = le.nextLine();
		System.out.println("E-mail: ");
		email = le.nextLine();
		System.out.println("Senha: ");
		nome = le.nextLine();
		System.out.println("Numero de Certificado Digital: ");
		certDig = le.nextLine();

		clientes.add(new Cliente(nome, email, senha, certDig));

		System.out.println("Cadastrado!!!");
	}

	void inserirImovel() {
		System.out.println("Id: ");
		id = le.nextInt();
		System.out.println("Registro: ");
		registro = le.next();
		System.out.println("Endereao: ");
		endereco = le.nextLine();
		System.out.println("Digite uma das opaaes referente ao tipo do Imavel:");
		System.out.println("\nApartamento, Terreno, Casa, Edifacio Comercial");
		tipo = le.nextLine();
		if(tipo.equals("Apartamento")||tipo.equals("Terreno")||tipo.equals("Casa")||tipo.equals("Edifacio Comercial")||tipo.equals("Edificio Comercial")
				||tipo.equals("apartamento")||tipo.equals("terreno")||tipo.equals("casa")||tipo.equals("edifacio comercial")||tipo.equals("edificio comercial")) {
			System.out.println("Descriaao: ");
			descricao = le.nextLine();
		}else {
			System.out.println("Tipo de imavel nao encontrado");
		}
		imoveis.add(new Imovel(id, registro, endereco, descricao));
		System.out.println("Cadastrado!!!");
	}

	void inserirVeiculo() {
		

		System.out.println("Digite uma das opaaes referente ao tipo do Veaculo:");
		System.out.println("\nCarro, Motocicleta, Bicicleta, Patinete, Skate");
		tipo = le.next();
		System.out.println("Id: ");
		id = le.nextInt();
	
		
		if(tipo.equals("Carro")||tipo.equals("Motocicleta")||tipo.equals("Bicicleta")||tipo.equals("Patinete")||tipo.equals("Skate")
				||tipo.equals("carro")||tipo.equals("motocicleta")||tipo.equals("bicicleta")||tipo.equals("patinete")||tipo.equals("skate") ) {
			System.out.println("Ano: ");
			ano = le.nextInt();
			System.out.println("Marca: ");
			marca = le.next();
			System.out.println("Modelo: ");
			modelo = le.next();
			
			
			System.out.println("Descriaao: ");
			descricao = le.nextLine();
			descricao = le.nextLine();
			
		}else {
			System.out.println("Tipo de Veaculo nao encontrado");
			
		}
		
		veiculos.add(new Veiculo( id, tipo, marca, ano, modelo, descricao));
		
	}

	
	
	void inserirInstFin() {
		System.out.println("CNPJ: ");
		cnpj = le.nextLine();
		System.out.println("Nome: ");
		nome = le.nextLine();
		System.out.println("Endereco: ");
		endereco = le.nextLine();

		instFinanceiras.add(new InstituicaoFinanceira(cnpj, nome, endereco));
		System.out.println("Cadastrado!!!");
	}
		
	
	
	void inserirLeilao() {
		System.out.println("Numero do Leilao: ");
		numLeilao = le.nextInt();
		System.out.println("CPNJ da Instituiaao Financeira: ");
		cnpj = le.next();
		System.out.println("Insira o namero do lote: ");
		numLote = le.nextInt();
		
		for (InstituicaoFinanceira instituicaoFinanceira : instFinanceiras) {
			if (!cnpj.equals(instituicaoFinanceira.getCnpj())) {
				System.out.println("Instituiaao Financeira nao encontrada!");

			} else {

				
				for (Lote lote : lotes) {
					if (!numLote.equals(lote.getNumLote())) {
						System.out.println("Lote nao encontrado!");
					} else {

						/*
						 * System.out.println("Insira a Data: "); Date data = le.nextInt();
						 */

						System.out.println("Insira o Endereao: ");
						endereco = le.next();
						
					}
				}
			}
		}

		leiloes.add(new Leilao(numLeilao, numLote, cnpj, endereco));

	}

	
	
	@SuppressWarnings("null")
	void inserirLote() {
		
		List<Integer> produtos;
		produtos = new ArrayList<>();


		System.out.println("Namero do Lote: ");
		numLote = le.nextInt();
		System.out.println("Insira a quantidade de produtos: ");
		qtde = le.nextInt();


		for (int i = 0; i < qtde; i++) {
			System.out.println("Tipo do Lote - V para Veaculos ou I para imaveis");
			tipo = le.next();
			if (tipo.equals("V")  || tipo.equals("v") ) {
				System.out.println("Insira o ID do veaculo: ");
				id = le.nextInt();
				
				//System.out.println(id);
				
				
				for (Veiculo veiculo : veiculos) {
					
					if(id.equals(veiculo.getId())) {
					
					produtos.add(veiculo.getId());
					lotes.add(new Lote(numLote, produtos, null, veiculo));
					System.out.println("Veiculo cadastrado");
					}else {
						System.out.println("Veaculo nao encontrado");
						break;
					}
				}
			}else {

				if (tipo.equals("I")  || tipo.equals("i")) {
					System.out.println("Insira o ID do Imavel: ");
					id = le.nextInt();
					for (Imovel imovel : imoveis) {
						if(id.equals(imovel.getId())) {
							produtos.add(imovel.getId());
							System.out.println(produtos);
							lotes.add(new Lote(numLote, produtos, imovel, null));
							System.out.println("Imavel cadastrado");
							
						}else {
							System.out.println("Imavel nao encontrado");
							break;
						}
					
					}
				}
			}
				
		
			}
		
			System.out.println("Lista de Produtos vazia. Favor cadastrar algum Imavel ou Veaculo");
		
		
	}
	
	
	
	//FUNaaES DE ALTERAaaO
	
	
	void alterarCliente() {
		System.out.println("Insira o certificado Digital do Cliente: ");
		certDig = le.nextLine();
		
		for (Cliente cliente : clientes) {
			if(certDig.equals(cliente.getCertificadoDigital())) {
				System.out.println("Insira o nome: ");
				nome = le.nextLine();
				cliente.setNome(nome);
				System.out.println("Insira a senha: ");
				senha = le.nextLine();
				cliente.setSenha(senha);
				System.out.println("Insira o e-mail:");
				email=le.nextLine();
				cliente.setEmail(email);
				System.out.println("Insira o certificado digital:");
				certDig = le.nextLine();
				cliente.setCertificadoDigital(certDig);
				
				System.out.println("Dados atualizados com sucesso!");
			}else {
				System.out.println("Cliente nao encontrado");
			}
		}
	}
	
	
	void alterarInstFin() {
		System.out.println("Insira o CNPJ da instituiaao: ");
		cnpj = le.nextLine();
		
		for(InstituicaoFinanceira instFin: instFinanceiras ) {
			if(cnpj.equals(instFin.getCnpj())) {
				System.out.println("Insira o nome: ");
				nome = le.nextLine();
				instFin.setNome(nome);
				System.out.println("Insira endereao: ");
				endereco = le.nextLine();
				instFin.setEndereco(endereco);
				
				System.out.println("Dados atualizados com sucesso!");
			}else {
				System.out.println("Instituiaao Financeira nao encontrado");
			}
		}
	}
	
	
	void alterarImovel() {
		System.out.println("Insira o registro do Imavel: ");
		registro = le.nextLine();
		
		for(Imovel imovel: imoveis) {
			if(registro.equals(imovel.getRegistro())) {
				System.out.println("Insira o endereao: ");
				endereco = le.nextLine();
				imovel.setEndereco(endereco);
				descricao = le.nextLine();
				imovel.setDescricao(descricao);
			}else {
				System.out.println("Imavel nao encontrado");
			}
		}
	}
	
	
	void alterarVeiculo() {
		System.out.println("Insira o id do Veaculo: ");
		id = le.nextInt();
		
		for(Veiculo veiculo: veiculos) {
			if(id.equals(veiculo.getId())) {
				
				System.out.println("Insira a marca: ");
				marca = le.next();
				veiculo.setMarca(marca);
				
				System.out.println("Insira o modelo: ");
				modelo = le.nextLine();
				veiculo.setModelo(modelo);
				System.out.println("Insira a descricao: ");
				descricao = le.nextLine();
				veiculo.setDescricao(descricao);
				System.out.println("Insira o ano: ");
				ano = le.nextInt();
				veiculo.setAno(ano);
			}else {
				System.out.println("Veaculo nao encontrado");
			}
		}
	}
	
	
	
	//FUNaaES DE IMPRESSaO

	void imprimirCliente() {
		for (Cliente Cliente : clientes) {
			System.out.println(
					" | Nome: " + Cliente.getNome() + "  \t| Certificado Digital: " + Cliente.getCertificadoDigital());
		}

	}
	
	

	void imprimirImoveis() {
		for (Imovel Imovel : imoveis) {
			System.out.println("Registro: " + Imovel.getRegistro() + " | Endereao: "
					+ Imovel.getEndereco() + "  \t| Descricao: " + Imovel.getDescricao());
		}
	}

	
	
	void imprimirVeiculos() {
		for (Veiculo veiculo : veiculos) {
			System.out.println("ID: " + veiculo.getId() + " | Marca: " + veiculo.getMarca() + "  \t| Ano: "
					+ veiculo.getAno() + "  \t| Modelo: " + veiculo.getModelo());
		}
	}

	
	
	void imprimirInstFin() {
		for (InstituicaoFinanceira instituicaoFinanceira : instFinanceiras) {
			System.out.println("CNPJ: " + instituicaoFinanceira.getCnpj() + " | Nome: "
					+ instituicaoFinanceira.getNome() + "  \t| Endereao: " + instituicaoFinanceira.getEndereco());
		}
	}

	
	
	void imprimirLeiloes() {
		for (Leilao leilao : leiloes) {
			System.out.println("Numero do leiluo: " + leilao.getNumeroLeilao() + " | Lote: " + leilao.getLoteProdutos()
					+ "  \t| Instituiaao Financeira: " + leilao.getInstFin() + "  \t| Data: " + leilao.getDataCriacao()
					+ "  \t| Endereao: " + leilao.getEndereco());
		}
	}

	
	
	void imprimirLotes() {
		for (Lote lote : lotes) {
			System.out.println("Namero do lote: " + lote.getNumLote() + " | Produtos: " + lote.getQtdeProd()+ " | Clientes: " + lote.getImovel()+ " | Veaculo: " + lote.getVeiculo());;
		}
	}
	
	
	
	void imprimirLoteEspecifico() {
		
		System.out.println("Insira o namero do Lote:");
		numLote = le.nextInt();
		
		for (Lote lote : lotes) {
			
			if(numLote.equals(lote.getNumLote())) {
				System.out.println("Namero do lote: " + lote.getNumLote() + " | Produtos: " + lote.getQtdeProd() + " | Veaculos: " + lote.getVeiculo()+ " | Imaveis: " + lote.getImovel());
				
			}
		}
	}
	
	

	void imprimirLances() {
		
		System.out.println("Insira o certificado digital: ");
		certDig = le.next();
		
		for(Cliente cliente: clientes) {
			for (Lance lance : lances) {
				
				if(cliente.getCertificadoDigital().equals(certDig) && cliente.getCertificadoDigital().equals(lance.getCliente().getCertificadoDigital())) {
				System.out.println("Valor: " + lance.getValor() + " | Cliente: " + lance.getCliente() + " | Leilao: "
						+ lance.getLeilao());
			}
		}
	  }
	}

	
	
	
	
	
	
	
	
	//FUNaaES DE REMOaaO
	
	
	void removerCliente() {
		
		System.out.println("Insira o certificado digital: ");
		String ctd = le.next();
		
	for (int i = 0; i < clientes.size(); i++) {
	    if (clientes.get(i).getCertificadoDigital().equals(ctd)) {
	      clientes.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}
	
	
	
	void removerImovel() {
		
		System.out.println("Insira o Registro: ");
		String registro = le.next();
		
	for (int i = 0; i < imoveis.size(); i++) {
	    if (imoveis.get(i).getRegistro().equals(registro)) {
	      imoveis.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}
	
	
	
	void removerVeiculo() {
		
		System.out.println("Insira o ID: ");
		int id = le.nextInt();
		
	for (int i = 0; i < veiculos.size(); i++) {
	    if (veiculos.get(i).getId().equals(id)) {
	      veiculos.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}
	
	
	
	void removerInstFin() {
		
		System.out.println("Insira o CNPJ: ");
		cnpj = le.next();
		
	for (int i = 0; i < instFinanceiras.size(); i++) {
	    if (instFinanceiras.get(i).getCnpj().equals(cnpj)) {
	    	instFinanceiras.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}
	
	
	
	void removerLeilao() {
		
		System.out.println("Insira o numero do Leilao: ");
		numLeilao = le.nextInt();
		
	for (int i = 0; i < leiloes.size(); i++) {
	    if (leiloes.get(i).getNumeroLeilao().equals(numLeilao)) {
	    	leiloes.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}
	
	
	
	void removerLote() {
		
		System.out.println("Insira o numero do Lote: ");
		numLote = le.nextInt();
		
	for (int i = 0; i < lotes.size(); i++) {
	    if (lotes.get(i).getNumLote().equals(numLote)) {
	    	lotes.remove(i);
	    }
	  }
	System.out.println("Removido!!!");
	}

}
