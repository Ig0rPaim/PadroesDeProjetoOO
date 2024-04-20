package interfaces_Abstracts;

import implementacoes.Alimento;

public interface BuiderPreparo {

    public void setNome(String nome);
    public void setLowCarb(Boolean lowCarb);
    public void setVegano(Boolean vegano);
    public void setSemLactose(Boolean semLactose);
    public void setSemGlutem(Boolean semGlutem);
    public void setReduzidoEmSodio(Boolean reduzidoEmSodio);
    public void setComoFazer(String comoFazer);
    public void setQuantidade(Alimento alimento, Double quantidade);
    public void setAlimentos(Alimento alimento);
    public void setUnidadeAlimento(String unidade, Alimento alimento);
    
}
