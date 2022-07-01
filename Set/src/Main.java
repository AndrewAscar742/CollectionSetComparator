import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Serie> serie1 = new HashSet<>(){{
            add(new Serie("Sobrenatural", "Ação", 45));
            add(new Serie("Got", "Ficção", 60));
            add(new Serie("Supergirl", "Ação", 42));
            add(new Serie("Flash", "Ação/Ficção", 40));
        }};

        System.out.println(serie1.toString());
        System.out.println("É vázio? "+ serie1.isEmpty());
        System.out.println(serie1.hashCode());
        System.out.println("Seu tamanho e velocidade de procura " + serie1.size() + " " +  System.currentTimeMillis());

        //LinkedHashSet
        Set<Serie> serie2 = new LinkedHashSet<>(serie1);

        System.out.println(serie2.containsAll(serie1));
        System.out.println(serie2.equals(serie1));
        System.out.println(serie2.hashCode());
        System.out.println("Seu tamanho e velocidade de procura " + serie2.size() + " " +  System.currentTimeMillis());
        //Ele é mais lento que o HashSet

        //TreeSet e ordenação natural
        Set<Serie> serie3 = new TreeSet<>(serie2);
        System.out.println(serie3.hashCode());
        for (Serie serie: serie3) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempEp());
        }

        System.out.println("Seu tamanho e velocidade de procura " + serie3.size() + " " +  System.currentTimeMillis());
        //Ele é mais lento que HashSet e LinkedHashSet

    }
}
