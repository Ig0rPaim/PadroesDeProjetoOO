package interfaces_Abstracts;

import implementacoes.Nutriente;

public interface ArmazenagemNutrientes {

    public Nutriente create(String nome, String unidade, Double CaloriaPorUnidade);
    public Nutriente create(String nome) throws Exception;
}
