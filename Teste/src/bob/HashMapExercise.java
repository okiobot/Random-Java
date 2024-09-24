package bob;
import java.util.HashMap;

//Hashmaps guardam itens em pares de "chave/valor"

public class HashMapExercise {
	public static void main(String[] args) {
		HashMap<String, String> games = new HashMap<String, String>();
		
		//Adiciona elementos em uma lista
		games.put("Ubisoft","Star Wars Outlaws");
		games.put("EA","Plants vs Zombies" );
		games.put("Microsoft", "Halo");
	
	System.out.println(games);
	
	//Adquire um elemento específico
	System.out.println(games.get("Microsoft"));
	
	//Modifica um valor de uma chave específica
	games.put("EA","Assassin's Creed");
	System.out.println(games.get("EA"));
	
	//Remove um elemento da lista
	games.remove("Ubisoft");
	System.out.println(games);
	
	//Verifica o tamanho de um hashmap
	System.out.println(games.size());
	
	//Mostra as chaves
	for (String i : games.keySet()) {
		System.out.println(i);
	}
	//Mostra os valores
	for (String p : games.values()) {
		System.out.println(p);
	}	
	//Mostra as chaves e os valores
	for (String o : games.keySet()) {
		System.out.println("key: "+o+" value: "+games.get(o));
	}	
	
	/*
[1] - Crie um HashMap vazio chamado "myMap".
[2] - Adicione uma chave "nome" e um valor "João" ao HashMap "myMap".
[3] - Verifique se o HashMap "myMap" contém a chave "nome".
[4] - Adicione mais três pares chave-valor ao HashMap "myMap".
[5] - Obtenha o valor associado à chave "idade" do HashMap "myMap".
[6] - Remova a chave "nome" do HashMap "myMap".
[7] - Verifique se o HashMap "myMap" está vazio.
[8] - Obtenha o tamanho atual do HashMap "myMap".
[9] - Percorra todas as chaves do HashMap "myMap" e imprima cada uma delas.
[10] - Percorra todos os valores do HashMap "myMap" e imprima cada um deles.
	 */
	
	//1
	HashMap<String, String> myMap = new HashMap<String, String>();
	
	//2
	myMap.put("nome", "João");
	
	//3
	if (myMap.containsKey("nome")) {
		System.out.println("A chave 'nome' está na lista");
	}
	else {
		System.out.println("A chave 'nome' não está na lista");
	}
	
	//4
	myMap.put("idade", "18");
	myMap.put("altura", "1.75");
	myMap.put("gosto", "Pastel");
	
	//5
	System.out.println(myMap.get("idade"));
	
	//6
	myMap.remove("nome");
	
	//7
	if (myMap.size() != 0 ) {
		System.out.println("O HashMap não está vazio");
	}
	else { 
		System.out.println("O HashMap está vazio");
	}
	
	//8
	System.out.println(myMap.size());
	
	//9
	for (String p : myMap.keySet()) {
		System.out.println(p);
	}
	
	//10
	for (String g : myMap.values()) {
		System.out.println(g);
	}
	
	}
	}

