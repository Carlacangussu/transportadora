//incompletaaaaa
public class Main {

	public static void main(String[] args){
	//Scanner botao = new Scanner (System.in);
	System.out.println("Insira 1 cadastrar um novo veiculo, 2 para cadastrar uma nova viagem;
	int apertar = botao.nextInt();
	
	if(apertar == 1){
	//Scanner pesquisa = new Scanner (System.in);
		
		System.out.println("Tipo do veiculo: ");
		String cadastro = leitor.readLine(); 
		
		if(cadastro.equals("Moto" || "moto"){
			Moto * moto1 = new moto1();
		}
		else if(cadastro.equals("Carro" || "carro"){
			Carro * carro1 = new carro1();
		}
		else if(cadastro.equals("Carreta" || "carreta"){
			Carreta * carreta1 = new carreta1();
		}
		else if(cadastro.equals("Van" || "van"){
			Van* van1 = new van1();
		}

        }else if(apertar == 2){
		
		Scanner botao1 = new Scanner (System.in);
			
		Viagem * viagem1 = new viagem1;
				
			Scanner entrada = new Scanner(System.in);
			Scanner entradaString = new Scanner(System.in);
				
			System.out.println("Digite a distnacia da viagem: ");

			viagem1.setDistancia(entradaString.nextLine());
			System.out.println("Digite a carga a ser transportada: ");
			viagem.setCarga(entrada.nextInt());
			System.out.println("Digite o tempo em horas inteiras: ");
			viagem.setTempo(entradaString.nextInt());
			
			
				}catch(FileNotFoundException e){}
			}
			else{
				System.out.println("Treinador cadastrado com sucesso.");		
			}
		}
	}
			
	else { System.out.println("Opção invalida");}

