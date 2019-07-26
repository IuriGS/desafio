package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Personagem;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Personagem> list = new ArrayList<>();

		System.out.print("Digite a quantidades de personagens à registrar: ");
		int n = sc.nextInt();
		

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Personagem #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Genero: ");
			char genero = sc.next().charAt(0);
			System.out.print("Temporadas: ");
			int temporadas = sc.nextInt();
			list.add(new Personagem(id, nome, genero, temporadas));
		}
		System.out.println();
		System.out.println("Escolha a opção abaixo: ");
		System.out.println("1 - Listar Personagens");
		//System.out.println("2 - Buscar por Nomes");
		System.out.println("3 - Buscar por Id");
		System.out.println("4 - Remover personagem");
		System.out.print("Opção: ");
		int op = sc.nextInt();
		System.out.println();

		if (op == 1) {
			System.out.println("Lista de Personagens:");
			for (Personagem x : list) {
				System.out.println(x);
			}
		}
		/*if (op == 2) {
			System.out.print("Digite o nome do personagem: ");
			sc.nextLine();
			String nome = sc.nextLine();
			List<Personagem> resultado = list.stream().filter(x -> x.getNome() == nome).collect(Collectors.toList());
			System.out.println(resultado);
		}*/
		if (op == 3) {
			System.out.print("Digite o id do personagem: ");
			int id = sc.nextInt();
			Personagem per = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			System.out.println(per);
		}

		if (op == 4) {
			System.out.println("Digite o id para remoção:");
			int id = sc.nextInt();
			list.removeIf(x -> x.getId() == id);
			for (Personagem x : list) {
				System.out.println(x);
			}

			sc.close();

		}
	}
}
