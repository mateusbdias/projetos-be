package Aula06S_Integradora2.model;

public class IP {
    private int oct1;
    private int oct2;
    private int oct3;
    private int oct4;

    public IP(int oct1, int oct2, int oct3, int oct4) {
        this.oct1 = oct1;
        this.oct2 = oct2;
        this.oct3 = oct3;
        this.oct4 = oct4;
    }

    public String getPais() {
        String pais = "";
        if (this.oct1 >= 0 && this.oct1 <= 49) {
            pais = "Argentina";
        } else if (this.oct1 >= 50 && this.oct1 <= 99) {
            pais = "Brasil";
        } else if (this.oct1 >= 100 && this.oct1 <= 149) {
            pais = "Colombia";
        } else {
            pais = "N/A";
        }
        return pais;
    }

    @Override
    public String toString() {
        return "IP = " + oct1 + "." + oct2 + "." + oct3 + "." + oct4;
    }
}
