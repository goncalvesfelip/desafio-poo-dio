package desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 12d;

    private String descricao;
    private String titulo;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
