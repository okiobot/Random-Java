package bob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListExercise {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		// ArrayList<Integer> num = new ArrayList<Integer> ();
		ArrayList<Integer> num = new ArrayList<Integer>();

		// Add elements to an specific list
		num.add(1);
		num.add(2);
		num.add(8);
		num.add(2);
		num.add(5);
		num.add(6);
		num.add(4);
		cars.add("Chevrolet");
		cars.add("Creta");
		cars.add("Hilux");

		// Set an specific element
		cars.set(1, "HB20");

		// Removes an specific element
		num.remove(2);

		// Clears an list
		// num.clear();

		// Sort the elements on a list
		Collections.sort(num);

		// Acquire the size of an specific list
		System.out.println("List size: " + num.size());

		// Get an specific element from a list
		Integer numelem = num.get(0);
		String element = cars.get(1);
		System.out.println(element);
		System.out.println(num);
		System.out.println(numelem);

		// Prints all of the elements on a list
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		// Another way to prints all the elements on a list
		for (String o : cars) {
			System.out.println(o);
		}
		
/*
[1] - Crie um ArrayList e adicione alguns elementos a ele. Em seguida, imprima o tamanho da lista e verifique se um elemento específico está presente na lista.
[2] - Crie uma função que receba um ArrayList e retorne o número de elementos únicos na lista.
[3] - Crie uma função que receba dois ArrayLists e retorne um novo ArrayList que contenha todos os elementos exclusivos de ambos os ArrayLists.
[4] - Crie uma função que receba um ArrayList de números inteiros e retorne o índice do menor número na lista.
[5] - Crie uma função que receba um ArrayList de strings e retorne o número de ocorrências de uma string específica na lista.
[6] - Crie uma função que receba um ArrayList de números inteiros e remova todos os números pares da lista.
[7] - Crie uma função que receba um ArrayList de objetos e ordene a lista por um atributo específico dos objetos.
[8] - Crie uma função que receba um ArrayList de strings e retorne um novo ArrayList que contenha apenas as strings que começam com uma letra específica.
[9] - Crie uma função que receba um ArrayList de números inteiros e calcule a média dos números na lista.
[10] - Crie uma função que receba um ArrayList de strings e retorne um novo ArrayList que contenha as strings na ordem reversa.
*/

		// 1
		ArrayList<Integer> exerc = new ArrayList<Integer>();
		exerc.add(15);
		exerc.add(40);
		exerc.add(68);
		exerc.add(68);
		exerc.add(11);
		exerc.add(23);

		System.out.println(exerc.size());
		if (exerc.contains(40)) {
			System.out.println("O número 40 está na lista");
		} else {
			System.out.println("O número 40 está na lista");
		}

		// 2
		HashSet<Integer> unico = new HashSet<Integer>();
		unico.addAll(exerc);
		System.out.println(unico);

		// 3
		ArrayList<Integer> one = new ArrayList<Integer>();
		one.add(40);
		one.add(90);
		one.add(68);
		one.add(47);
		one.add(23);

		HashSet<Integer> both = new HashSet<Integer>();
		both.addAll(unico);
		both.addAll(exerc);
		System.out.println(both);

		// 4
		ArrayList<Integer> menor = new ArrayList<Integer>();
		menor.add(69);
		menor.add(12);
		menor.add(30);
		menor.add(79);
		menor.add(1);
		Collections.sort(menor);
		System.out.println(menor.get(0));

		// 5
		ArrayList<String> repete = new ArrayList<String>();
		repete.add("Abacaxi");
		repete.add("Caminhão");
		repete.add("Controle");
		repete.add("Abacaxi");

		HashSet<String> repeat = new HashSet<String>();
		repeat.addAll(repete);
		System.out.println(repeat);

		// 6
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> todos = new ArrayList<Integer>();
		todos.add(2);
		todos.add(75);
		todos.add(44);
		todos.add(37);
		for (Integer i = 0; i < todos.size(); i++) {
			if (todos.get(i) % 2 == 0) {
				pares.add(todos.get(i));
			}
		}
		System.out.println(pares);
	
		//7
		ArrayList<String> ordenado = new ArrayList<String>();
		ordenado.add("Trabalho");
		ordenado.add("Carro");
		ordenado.add("Ornitorrinco");
		ordenado.add("Estado");
	
		Collections.sort(ordenado);
		System.out.println(ordenado);
		
		//8
		ArrayList<String> letra = new ArrayList<String>();
		letra.add("Carteira");
		letra.add("Palavra");
		letra.add("Guepardo");
		letra.add("Plutão");
		
		for (Integer b = 0; b < letra.size(); b++ ) {
			String first = letra.get(0);
			if (first.startsWith("P") ) {
				System.out.println(letra);
		}
			}
		
		//9
		ArrayList<Integer> media = new ArrayList<Integer>();
		media.add(5);
		media.add(80);
		media.add(20);
		media.add(15);
		
		Integer total = 0; 
		for (Integer m = 0; m < media.size(); m++) {
			total += media.get(m);
		}
		Integer mediala = total/media.size();
		System.out.println(mediala);
	
		//10
		ArrayList<String> contrario = new ArrayList<String>();
		contrario.add("Torta");
		contrario.add("Lástima");
		contrario.add("Amor");
		contrario.add("Gato");
		
		Collections.reverse(contrario);
		System.out.println(contrario);
	}
	}
