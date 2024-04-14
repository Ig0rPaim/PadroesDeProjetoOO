package implementacoes;

import java.util.HashMap;
import java.util.Map;

import interfaces_Abstracts.ArmazenagemNutrientes;

public class ArmazenagemNutriente implements ArmazenagemNutrientes{

    private Map<String, Nutriente> nutrientes = new HashMap<>();

    public ArmazenagemNutriente() {
    }
    
    public ArmazenagemNutriente(Map<String, Nutriente> nutrientes) {
        this.nutrientes = nutrientes;
    }

    @Override
    public Nutriente create(String nome, String unidade, Double CaloriaPorUnidade) {
        var nutriente = this.nutrientes.get(nome);
        if(nutriente != null)
            return nutriente.clone();
        var novoNutriente = new Nutriente(nome, unidade, CaloriaPorUnidade);
        nutrientes.put(nome, novoNutriente);
        return novoNutriente.clone();

    }

    @Override
    public Nutriente create(String nome) throws Exception {
        var nutriente = nutrientes.get(nome);
        if(nutriente == null)
            throw new Exception("nutriente não encontrado");
        return nutriente.clone();
    }
}
