package QuIz;
import java.util.Scanner;
public class Quizfodinhs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		// número ou letras?
		
		int resposta[] = new int [2];
		int resposta_player[] = new int [2];
		
		int pontuacao = 0;


		for (int i = 0; i < resposta.length; i++) {
			if (i == 0) {
				resposta[i] = pergunta_1();
				resposta_player[i] = input.nextInt();
			}
			else {
				resposta[i] = pergunta_2();
				resposta_player[i] = input.nextInt();
			}
		}
		
		for (int i = 0; i < resposta.length; i++) {
			if (resposta[i] == resposta_player[i]) {
				pontuacao += 10;
			}
		}
		
		System.out.println(pontuacao);
		
		}
	
		// vai virar um classe
	
		public static int pergunta_1(){
			System.out.println("Quantas cordas tem o violão/guitarra?\n\n a. 5\n b. 3\n c. 6\n d. 4\n");
			return 3;
		}
		public static int pergunta_2(){
			System.out.println("Em que pais o samba se originou?\n\n a. Nigeria\n b. Congo\n c. Espanha\n d. Brasil\n");
			return 4;
			}


}

