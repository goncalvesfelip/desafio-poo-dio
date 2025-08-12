package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate dataMentoria;

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public double calcularXp() {
        // Adicionei o xp e um bonus de 40
        return XP_PADRAO + 40d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + dataMentoria +
                '}';
    }
}
