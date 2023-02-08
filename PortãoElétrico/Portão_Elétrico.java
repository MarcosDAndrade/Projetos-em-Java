import java.util.Scanner;

public class Portão_Elétrico {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int senha = 0,senhaconf = 0,opc=0;
		
		do{		
		System.out.println("1- Cadastrar nova senha");
		System.out.println("2- Abrir o portão");
		System.out.println("3- Sair");
		
		opc = sc.nextInt();
		
		switch(opc) {
		case 1:
			if (senhaconf != 0) {
				System.out.println("Digite a senha anterior: ");
				senha = sc.nextInt();
				if (senha != senhaconf) {
					System.out.println("Senha incorreta, tente novamente!");
				} else {
					System.out.println("Digite a nova senha: ");
					senha = sc.nextInt();
					senhaconf = senha;
					System.out.println("Senha Atualizada!");
				} break;
			} else {
				System.out.println("Digite a nova senha: ");
				senha = sc.nextInt();
				senhaconf = senha;
				System.out.println("Senha cadastrada com sucesso!");
				break;
				
			}
		case 2: 
			senha = senhaconf;
			if (senhaconf == 0000){
				System.out.println("Configure uma senha!");
			}else{
				System.out.println("Digite a senha para abrir o portão: ");
			senha = sc.nextInt();
			if(senhaconf != senha) {
				System.out.println("Senha incorreta!");
			} 
			else {
				System.out.println("PORTÃO ABERTO");
				opc = 3;
			}
			}
			
			break;
		}		
			
	}while (opc !=3);
	}

}
