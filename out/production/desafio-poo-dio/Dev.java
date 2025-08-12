package desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> inscricoes = new LinkedHashSet<>();
    private Set<Conteudo> conclusoes = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.inscricoes.addAll(bootcamp.getConteudos());
        //ALTERAÇÃO FEITA AQUI
        bootcamp.getParticipantes().add(this);
    }

    public double calcularTotalXp() {
        return this.conclusoes.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.inscricoes.stream().findFirst();
        if(conteudo.isPresent()){
            this.conclusoes.add(conteudo.get());
            this.inscricoes.remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(Set<Conteudo> inscricoes) {
        this.inscricoes = inscricoes;
    }

    public Set<Conteudo> getConclusoes() {
        return conclusoes;
    }

    public void setConclusoes(Set<Conteudo> conclusoes) {
        this.conclusoes = conclusoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(inscricoes, dev.inscricoes) && Objects.equals(conclusoes, dev.conclusoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, inscricoes, conclusoes);
    }
}
