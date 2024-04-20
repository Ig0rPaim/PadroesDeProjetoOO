package implementacoes;

import interfaces_Abstracts.BuiderPreparo;

public class PreparoBuilder implements BuiderPreparo{
    private Preparo preparo;

    @Override
    public void setNome(String nome) {
        preparo.setNome(nome);
    }

    @Override
    public void setLowCarb(Boolean lowCarb) {
        if(lowCarb == null)
            preparo.setLowCarb(false);
        preparo.setLowCarb(lowCarb);
    }

    @Override
    public void setVegano(Boolean vegano) {
        if(vegano == null)
            preparo.setVegano(false);
        preparo.setVegano(vegano);
    }

    @Override
    public void setSemLactose(Boolean semLactose) {
        if(semLactose == null)
            preparo.setSemLactose(false);
        preparo.setSemLactose(semLactose);
    }

    @Override
    public void setSemGlutem(Boolean semGlutem) {
        if(semGlutem == null)
            preparo.setSemGlutem(false);
        preparo.setSemGlutem(semGlutem);
    }

    @Override
    public void setReduzidoEmSodio(Boolean reduzidoEmSodio) {
        if(reduzidoEmSodio == null)
            preparo.setReduzidoEmSodio(false);
        preparo.setReduzidoEmSodio(reduzidoEmSodio);
    }

    @Override
    public void setComoFazer(String comoFazer) {
        preparo.setModoDeFazer(comoFazer);
    }

    @Override
    public void setQuantidade(Alimento alimento, Double quantidade) {
        alimento.setQuantidade(quantidade);
        preparo.setAlimentos(alimento.getNome(), alimento);
    }

    @Override
    public void setAlimentos(Alimento alimento) {
        preparo.setAlimentos(alimento.getNome(), alimento);
    }

    @Override
    public void setUnidadeAlimento(String unidade, Alimento alimento) {
        alimento.setUnidade(unidade);
        preparo.setAlimentos(alimento.getNome(), alimento);
    }

    public Preparo getPreparo(){
        return this.preparo;
    }
}
