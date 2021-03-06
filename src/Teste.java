import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Teste {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Javascript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 50)
			.map(c -> c.getAlunos())
			.forEach(c -> System.out.println(c));
		
	}
}