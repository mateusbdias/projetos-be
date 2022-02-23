package Aula03S_Integradora1;

//validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int PONTOS_POR_VENDA;

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome +" realizou "+ qtdVendas + " vendas.");
    }

    /*Método que calcula os pontos do Vendedor de acordo com seus aspectos
    a serem considerados*/
    public abstract int calcularPontos();

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir
    da subclasse e valida cada item para retornar a categoria*/
    public void mostrarCategoria(){
        int pontos = calcularPontos();
        String categoria;
        if (pontos > 40) {
            categoria = "mestre";
        } else if (pontos >= 31 && pontos < 40) {
            categoria = "bom";
        } else if (pontos >= 20 && pontos <= 30) {
            categoria = "aprendiz";
        } else {
            categoria = "novato";
        }
        System.out.println(this.getClass().getSimpleName() + " " + this.nome + " tem um total de " + pontos + " pontos e categoriza como " + this.getClass().getSimpleName() + " " + categoria);
    }
}





