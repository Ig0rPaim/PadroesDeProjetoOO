package implementacoes;

import java.util.HashMap;
import java.util.Map;

public class Preparo {
    private Map<String, Alimento> alimentos = new HashMap<>();
    private String nome;
    private boolean lowCarb;
    private boolean vegano;
    private boolean semLactose;
    private boolean semGlutem;
    private boolean reduzidoEmSodio;
    private String modoDeFazer;



    public Preparo(Map<String, Alimento> alimentos, String nome, boolean lowCarb, boolean vegano, boolean semLactose,
            boolean semGlutem, boolean reduzidoEmSodio, String modoDeFazer) {
        this.alimentos = alimentos;
        this.nome = nome;
        this.lowCarb = lowCarb;
        this.vegano = vegano;
        this.semLactose = semLactose;
        this.semGlutem = semGlutem;
        this.reduzidoEmSodio = reduzidoEmSodio;
        this.modoDeFazer = modoDeFazer;
    }

    public Preparo() {
    }

    public String getNome() {
        return nome;
    }

    public boolean isLowCarb() {
        return lowCarb;
    }

    public boolean isVegano() {
        return vegano;
    }

    public boolean isSemLactose() {
        return semLactose;
    }

    public boolean isSemGlutem() {
        return semGlutem;
    }

    public boolean isReduzidoEmSodio() {
        return reduzidoEmSodio;
    }

    public String getModoDeFazer() {
        return modoDeFazer;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLowCarb(boolean lowCarb) {
        this.lowCarb = lowCarb;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    public void setSemLactose(boolean semLactose) {
        this.semLactose = semLactose;
    }

    public void setSemGlutem(boolean semGlutem) {
        this.semGlutem = semGlutem;
    }

    public void setReduzidoEmSodio(boolean reduzidoEmSodio) {
        this.reduzidoEmSodio = reduzidoEmSodio;
    }

    public void setModoDeFazer(String modoDeFazer) {
        this.modoDeFazer = modoDeFazer;
    }

    public Map<String, Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(String nome, Alimento alimento) {
        alimentos.put(nome, alimento);
    }

    

    
}
