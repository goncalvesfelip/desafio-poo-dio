package desafio.dominio;

public class Curso extends Conteudo {

    private int horas;

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * horas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + horas +
                '}';
    }
}
