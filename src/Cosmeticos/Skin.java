package Cosmeticos;

public class Skin {

    private String nome;
    private Raridade raridadeArma;
    private double valor;

    public Skin(){

    }
    public Skin(String nome, Raridade raridadeArma, double valor) {
        this.nome = nome;
        this.raridadeArma = raridadeArma;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raridade getRaridade() {
        return raridadeArma;
    }

    public void setRaridade(Raridade raridadeArma) {
        this.raridadeArma = raridadeArma;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Skin{" +
                "nome='" + nome + '\'' +
                ", raridadeArma=" + raridadeArma +
                ", valor=" + valor +
                '}';
    }
}
