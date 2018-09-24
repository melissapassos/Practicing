package projeto;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		double soma=0 , media=0;
		
		Aluno [] alunos = new Aluno[2];
		Scanner ReceberNome = new Scanner(System.in);
		Scanner ReceberIdade = new Scanner(System.in);
		Scanner ReceberNota = new Scanner(System.in);
		
		System.out.println("Digite os dados dos alunos:");
		
		for (i=0; i<alunos.length; i++) {
			
			Aluno aluno = new Aluno();
			
			System.out.println("\nInforme o nome do aluno " + (i+1));
			aluno.setNome(ReceberNome.nextLine());
			
			System.out.println("\nInforme a idade do aluno " + (i+1));
			aluno.setIdade(ReceberIdade.nextInt());
			
			System.out.println("\nInforme a nota do aluno " + (i+1));
			aluno.setNota(ReceberNota.nextDouble());
			
			soma += aluno.getNota();
			
			alunos[i] = aluno;
		}
			
			ReceberNome.close();
			ReceberIdade.close();
			ReceberNota.close();
		
		
		media = soma / alunos.length;
		
		System.out.println("A média das notas é: " + media);
		
		for (i=0; i<alunos.length; i++) {
			if (alunos[i].getNota()>media) {
				System.out.println("\nO aluno " + alunos[i].getNome() + "tem nota maior que a média da sala.");
			}
		}
			
	}

}

