import java.util.Objects;

public class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempEp;

    public Serie(String nome, String genero, Integer tempEp) {
        setNome(nome);
        setGenero(genero);
        setTempEp(tempEp);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempEp() {
        return tempEp;
    }

    public void setTempEp(Integer tempEp) {
        this.tempEp = tempEp;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempEp=" + tempEp +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempEp, serie.tempEp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempEp);
    }

    @Override
    public int compareTo(Serie s1) {
        int tempEp = Integer.compare(this.getTempEp(), s1.getTempEp());
        if (tempEp != 0) return tempEp;
        return this.getGenero().compareTo(s1.getGenero());
    }
}
