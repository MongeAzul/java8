import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Aula1 {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("Alura online");
		palavras.add("Casa do código");
		palavras.add("Caelum");
		
		palavras.forEach(System.out::println);
		
		palavras.sort(Comparator.comparing(String::length));

		System.out.println(palavras);
		palavras.sort(null);
		System.out.println(palavras);
	}
	
}
