package Cosmeticos;

public class Raridade {

    private String raridadeArma;

    public Raridade(){

    }

    public Raridade(String raridadeArma) {
        this.raridadeArma = raridadeArma;
    }

    public String getRaridadeArma() {
        return raridadeArma;
    }

    public void setRaridadeArma(String raridadeArma) {
        this.raridadeArma = raridadeArma;
    }

    @Override
    public String toString() {
        return "Raridade{" +
                "raridadeArma='" + raridadeArma + '\'' +
                '}';
    }
}
