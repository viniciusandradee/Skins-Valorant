import Cosmeticos.Skin;
import Cosmeticos.Raridade;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Skin skin;
        Raridade raridade;
        double total = 0;
        int encerrar = 0;

        do{

            var nomeArma = JOptionPane.showInputDialog("Qual a arma?");
            var raridadeArma = JOptionPane.showInputDialog("Qual a skin?");
            var valorArma = Double.parseDouble(JOptionPane.showInputDialog("Quantos valorant points custam?"));

            raridade = new Raridade(raridadeArma);
            skin = new Skin(nomeArma, raridade, valorArma);


            total += skin.getValor();

            var pergunta = """
                    Deseja inserir mais alguma skin?
                    
                    [ 0 ] Sim
                    [ 1 ] Não
                    """;
            encerrar = Integer.parseInt(JOptionPane.showInputDialog(pergunta));

        }while(encerrar == 0);

        JOptionPane.showMessageDialog(null, "O total de valorant points é de " + total);
    }
}