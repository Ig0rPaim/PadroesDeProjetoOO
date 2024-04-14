package implementacoes;

import interfaces_Abstracts.Prototype;

public class Nutriente implements Prototype {
    private String nome;
    private String unidade;
    private Double CaloriaPorUnidade;

    public Nutriente() {
    }

    public Nutriente(String nome, String unidade, Double caloriaPorUnidade) {
        this.nome = nome;
        this.unidade = unidade;
        CaloriaPorUnidade = caloriaPorUnidade;
    }

    public Nutriente clone(){
        return this;
    }
}
