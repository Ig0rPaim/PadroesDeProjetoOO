package implementacoes;

public class Alimento {
    private String nome;
    private Nutriente nutriente;
    private QuantidadeMacro quantidadeMacro;
    private Double quantidade;
    private String unidade;

    public Alimento() {
    }

    public Alimento(String nome, Nutriente nutriente, QuantidadeMacro quantidadeMacro, Double quantidade,
            String unidade) {
        this.nome = nome;
        this.nutriente = nutriente;
        this.quantidadeMacro = quantidadeMacro;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Nutriente getNutriente() {
        return nutriente;
    }
    public void setNutriente(Nutriente nutriente) {
        this.nutriente = nutriente;
    }
    public QuantidadeMacro getQuantidadeMacro() {
        return quantidadeMacro;
    }
    public void setQuantidadeMacro(QuantidadeMacro quantidadeMacro) {
        this.quantidadeMacro = quantidadeMacro;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    
}
