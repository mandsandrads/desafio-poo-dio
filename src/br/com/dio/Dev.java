package br.com.dio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private void conteudosConcluidos;

    public void inscreverBootcamp(Bootcamp bootcamp) {
                this.conteudosInscritos.addAll(bootcamp.getConteudos());
                bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }  else {
        System.err.println(("Você não está matriculado em nenhum conteúdo!"));
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
        stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
        }
    }

    public IntStream stream() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosInscritos, dev.conteudosInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosInscritos);
    }

    public void setConteudosConcluidos(void conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
