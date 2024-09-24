package bob;
import java.util.HashSet;

public class HashSetExercise {
	public static void main(String[] args) {
		HashSet<String> food = new HashSet<String>();
		
		//Adiciona elementos ao set
		food.add("Macarrão");
		food.add("Achocolatado");
		food.add("Biscoito");

		System.out.println(food);
		
		//Verifica se um elemento está ou não no set
		if (food.contains("Biscoito")) {
			System.out.println("Biscoito foi encontrado no set");
		}
		else {
			System.out.println("Biscoito não foi encontrado no set");
		}
	
		//Remove elementos da lista
		food.remove("Macarrão");
	
		//Limpa o set
		//food.clear();
	
		//Verifica o tamanho do set
		System.out.println(food.size());
		
		for (String y : food) {
			System.out.println(y);
		}
		
		HashSet<Integer> num = new HashSet<Integer>();
		num.add(10);
		num.add(85);
		num.add(5);
		
		for (int i = 1; i <= 10; i++) {
			if (num.contains(i)) {
				System.out.println(i+" foi encontrado");
			}
			else {
				System.out.println(i+" não foi encontrado");
			}
		}

/*
[1] - Crie um HashSet vazio chamado "mySet".
[2] - Adicione os números 1, 2, 3, 4 e 5 ao HashSet "mySet".
[3] - Verifique se o HashSet "mySet" contém o número 3.
[4] - Remova o número 2 do HashSet "mySet".
[5] - Verifique se o HashSet "mySet" está vazio.
[6] - Crie outro HashSet chamado "otherSet" e adicione os números 4, 5, 6 e 7.
[7] - Retenha no HashSet "mySet" apenas os elementos presentes em "otherSet".
[8] - Adicione todos os elementos de "otherSet" ao HashSet "mySet".
[9] - Obtenha o tamanho atual do HashSet "mySet".
[10] - Percorra todos os elementos do HashSet "mySet" e imprima cada um deles.
 */


		//1
		HashSet<Integer> mySet = new HashSet<Integer>();
		
		//2
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(4);
		mySet.add(5);
	
		//3
		if (mySet.contains(3)) {
			System.out.println("O número 3 está na lista");
		}
		else {
			System.out.println("O número 3 não está lista");
		}
	
		//4
		mySet.remove(2);
		
		//5
		if (mySet.size() != 0) {
			System.out.println("A lista não está vazia");
		}
			else {
			System.out.println("A lista está vazia");	
		}
	
		//6
		HashSet<Integer> otherSet = new HashSet<Integer>();
			otherSet.add(4);
			otherSet.add(5);
			otherSet.add(6);
			otherSet.add(7);
			
		//7

			
		//8
		for (Integer p : otherSet) {
			mySet.add(p);
		}
		System.out.println(mySet);
			
			
		//9
		System.out.println(mySet.size());
			
		//10
		for (Integer q : mySet) {
			System.out.println(q);
		}
		}
	}