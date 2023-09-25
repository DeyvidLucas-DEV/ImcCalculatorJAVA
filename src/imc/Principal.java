package imc;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idade, opG;	
		float peso,altura;
		
		Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		
		
		System.out.println("-------------------");
		System.out.println("Calculadora de IMC");
		System.out.println("Feito por: DEYVID LUCAS");
		System.out.println("-------------------\n");
		
		System.out.println("Voce é gestante? (1- SIM 2-NAO) ");
        opG = input.nextInt();

		//gestante
		 if (opG != 1 && opG != 2) {
	            System.out.println("Opção inválida. Por favor, escolha 1 (SIM) ou 2 (NAO).");
	            return;
	        }
		
		//INICIO DO PROGRAMA
		System.out.println("Insira sua idade: ");
		idade = input.nextInt();
		System.out.println("Insira sua altura: (METROS) ");
		altura = input.nextFloat();
		System.out.println("Insira sua peso: (KILOS) ");
		peso = input.nextFloat();
		
		if(idade < 18) {
			CalcularImcCrianca(idade, peso, altura);
		}
		else if(idade >= 18 && idade < 60) {
			CalcularImcAdulto(peso, altura);
		}
		else if(idade >= 60 ) {
			CalcularImcIdoso(peso,altura);
		}
		
		 // Verificação do IMC para gestantes
        if (opG == 1) { // Se a pessoa for gestante
            System.out.println("Insira seu peso durante a gestação: (KILOS) ");
            float pesoGestante = input.nextFloat();

            float imcGestante = pesoGestante / (altura * altura);

            if (imcGestante < 18.5) {
                System.out.println("A gestante está magra!");
            } else if (imcGestante >= 18.5 && imcGestante < 24.9) {
                System.out.println("A gestante está com o peso normal!");
            } else {
                System.out.println("A gestante está obesa!");
            }}
		
		
		
	}
	
	static void CalcularImcCrianca(int idade, float peso, float altura) {
	    float imc = peso / (altura * altura);
	    
	    if (idade < 5) {
	        if (imc < 14.4) {
	            System.out.println("A criança está normal!");
	        } else {
	            System.out.println("A criança está com sobrepeso!");
	        }
	    } else if (idade == 5) {
	        if (imc < 14.4) {
	            System.out.println("A criança está normal!");
	        } else if (imc < 19.3) {
	            System.out.println("A criança está com sobrepeso!");
	        } else {
	            System.out.println("A criança está com obesidade!");
	        }
	    } else if (idade == 6) {
	        if (imc < 17.6) {
	            System.out.println("A criança está normal!");
	        } else if (imc < 19.8) {
	            System.out.println("A criança está com sobrepeso!");
	        } else {
	            System.out.println("A criança está com obesidade!");
	        }
	    } else if (idade == 7) {
	        if (imc < 17.9) {
	            System.out.println("A criança está normal!");
	        } else if (imc < 20.6) {
	            System.out.println("A criança está com sobrepeso!");
	        } else {
	            System.out.println("A criança está com obesidade!");
	        }
	    } else if (idade == 8) {
	        if (imc < 18.4) {
	            System.out.println("A criança está normal!");
	        } else if (imc < 21.6) {
	            System.out.println("A criança está com sobrepeso!");
	        } else {
	            System.out.println("A criança está com obesidade!");
	        }
	    } else if (idade == 9) {
	        if (imc < 19.1) {
	            System.out.println("A criança está normal!");
	        } else if (imc < 22.8) {
	            System.out.println("A criança está com sobrepeso!");
	        } else {
	            System.out.println("A criança está com obesidade!");
	        }
	    } else if (idade == 10) {
	        if (imc < 19.8) {
	            System.out.println("A criança está normal!");
	        } else if (imc < 24.0) {
	            System.out.println("A criança está com sobrepeso!");
	        } else {
	            System.out.println("A criança está com obesidade!");
	        }
	    } else if (idade == 11) {
	        if (imc < 21.5) {
	            System.out.println("A criança está normal!");
	        } else if (imc < 22.5) {
	            System.out.println("A criança está com sobrepeso!");
	        } else {
	            System.out.println("A criança está com obesidade!");
	        }
	    } else if (idade == 12) {
	        if (imc < 21.7) {
	            System.out.println("A criança está normal!");
	        } else if (imc < 23.7) {
	            System.out.println("A criança está com sobrepeso!");
	        } else {
	            System.out.println("A criança está com obesidade!");
	        }
	    } else if (idade == 13) {
	        if (imc < 22.2) {
	            System.out.println("A adolescente está normal!");
	        } else if (imc < 24.0) {
	            System.out.println("A adolescente está com sobrepeso!");
	        } else {
	            System.out.println("A adolescente está com obesidade!");
	        }
	    } else if (idade == 14) {
	        if (imc < 23.1) {
	            System.out.println("O adolescente está normal!");
	        } else if (imc < 24.1) {
	            System.out.println("O adolescente está com sobrepeso!");
	        } else {
	            System.out.println("O adolescente está com obesidade!");
	        }
	    } else if (idade == 15) {
	        if (imc < 23.4) {
	            System.out.println("O adolescente está normal!");
	        } else if (imc < 24.2) {
	            System.out.println("O adolescente está com sobrepeso!");
	        } else {
	            System.out.println("O adolescente está com obesidade!");
	        }
	    } else if (idade == 16) {
	        if (imc < 24.8) {
	            System.out.println("O adolescente está normal!");
	        } else if (imc < 25.9) {
	            System.out.println("O adolescente está com sobrepeso!");
	        } else {
	            System.out.println("O adolescente está com obesidade!");
	        }
	    } else if (idade == 17) {
	        if (imc < 24.9) {
	            System.out.println("A adolescente está normal!");
	        } else if (imc < 26.1) {
	            System.out.println("O adolescente está com sobrepeso!");
	        } else {
	            System.out.println("O adolescente está com obesidade!");
	        }
	        }
	}
	
	static void CalcularImcAdulto(float peso, float altura){
		float IMC = peso / (altura*altura);
		
		if(IMC < 18.5) {
			System.out.println("O adulto está magro! ");
		}
		else if(IMC >= 18.5 && IMC < 25){
			System.out.println("O adulto está normal! ");
		}
		else if(IMC >= 25 && IMC <29.9 ){
			System.out.println("O adulto está sobrepeso! ");
		}
		else if(IMC >= 29.9){
			System.out.println("O adulto está obeso! ");
		}
	}
	
	static void CalcularImcIdoso(float peso, float altura) {
		float IMC = peso / (altura*altura);
		
		if(IMC < 22) {
			System.out.println("O idoso está magro!");
		}
		else if(IMC >= 22 && IMC < 28 ) {
			System.out.println("O idoso está normal!");
		}
		else if(IMC >= 28 && IMC < 29.9 ) {
			System.out.println("O idoso está sobrepeso!");
		}
		
		else if(IMC >= 29.9 ) {
			System.out.println("O idoso está obeso!");
		}
	}

}
