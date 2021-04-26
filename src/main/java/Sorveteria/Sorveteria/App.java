package Sorveteria.Sorveteria;


import java.util.List;
import java.util.Scanner;


import dao.SorveteDAO;
import dao.impl.SorveteDAOImpl;
import entidade.Sorvete;


public class App {

	

	

	public static void main(String[] args) {
		
		SorveteDAO sorveteDAO = new SorveteDAOImpl();
		
        Scanner sc = new Scanner(System.in);
        
		
		int opc = 0;
		
		while(opc != 4) {
			
			System.out.println("SORVETERIA ABC");
			System.out.println("1- Inserir Sorvete ");
			System.out.println("2- Remover Sorvete ");
			System.out.println("3- Listar Sorvetes ");
			System.out.println("4- Sair ");
			opc = sc.nextInt();
			
			switch(opc) {
			
				case (1):					
				
				
				
				System.out.println("Digite os dados do Sorvete: ");
				System.out.print("Nome: ");
				String nomes = sc.next();
				
				
				System.out.print("Tipo: ");
				String tipos = sc.next();

				System.out.print("Marca: ");
				String marcas = sc.next();

				System.out.print("Ingredientes: ");
				String ingredientess = sc.next();

				System.out.print("Validade: ");
				String validades = sc.next();

				System.out.print("Fabricação: ");
				String fabricacaos = sc.next();

				Sorvete sorvete = new Sorvete();
				sorvete.setNome(nomes);
				sorvete.setTipo(tipos);
				sorvete.setMarca(marcas);
				sorvete.setIngredientes(ingredientess);
				sorvete.setValidade(validades);
				sorvete.setFabricacao(fabricacaos);

				sorveteDAO.adicionarSorvete(sorvete);
				
				break;
				
				case (2):
												
					System.out.println("Informe o nome para remover: ");
					String nomeRemove = sc.nextLine();
					sorveteDAO.removerSorvete(nomeRemove);
								
					
				break;
				
				case (3):
														
					List<Sorvete> listaSorvete = sorveteDAO.listarSorvete();
				for (Sorvete s : listaSorvete) {
				System.out.println(s.toString());
								
				}
				break;
				
				case (4):
				
					System.out.println("Saindo...");
					
				break;
				
				default:
					
					System.out.println("\nOpção Invalida, \ntente outra vez:\n");
					
				break;
			}
		}
		sc.close();
    }
		
		
	}
