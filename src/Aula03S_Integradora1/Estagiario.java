package Aula03S_Integradora1;

public class Estagiario extends Vendedor {

    public Estagiario(String nome){
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
    }

    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

    @Override
    public void mostrarCategoria() {
        int pontos = calcularPontos();
        String categoria;
        if (pontos >= 50) {
            categoria = "experiente";
        } else {
            categoria = "novato";
        }
        System.out.println(this.getClass().getSimpleName() + " " + this.nome + " tem um total de " + pontos + " pontos e categoriza como " + this.getClass().getSimpleName() + " " + categoria);
    }
}
