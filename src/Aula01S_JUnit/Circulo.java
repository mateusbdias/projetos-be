package Aula01S_JUnit;

public class Circulo extends Figura{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * this.getRaio();
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
