package aplicacao;

import aplicacao.tela.TelaRoda;
import aplicacao.tela.TelaVolante;
import modelo.Roda;
import modelo.Volante;

public class Aplicacao {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Roda roda = new Roda();
        TelaRoda telaRoda = new TelaRoda();
        roda.addObserver(telaRoda);
        
        Volante volante = new Volante(roda);
        new TelaVolante(volante);
    }
}
