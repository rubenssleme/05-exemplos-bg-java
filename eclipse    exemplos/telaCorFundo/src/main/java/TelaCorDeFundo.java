import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class TelaCorDeFundo extends JFrame{

    private String cor;

    public TelaCorDeFundo(String cor){
        super("Tela de Diversas cores");
        Container tela = getContentPane();

        //Este codigo deve ser refatorado

        if(cor.equals("Azul")){
            tela.setBackground(new Color(0,255,255));
        }else if(cor.equals("Vermelho")){
            tela.setBackground(new Color(255,0,0));
        }else if(cor.equals("Verde")){
            tela.setBackground(new Color(0,128,0));

        }
        // Até aqui

        //tela.setBackground(new Color(0,255,255));
        setSize(400,400);
        setLocationRelativeTo(null);
        //setVisible(true);
    }

}
