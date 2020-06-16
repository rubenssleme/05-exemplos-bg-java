package br.com.bg.zsistemabghibernate.controladores;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class ControladorTelaPrincipal extends ControladorTela {
    private JLabel jlaUsuario,jlaDiaSemana,jlaData,jlaHora;
    private Timer timer;
    public ControladorTelaPrincipal(JFrame telaPrincipal, JDesktopPane desktop,JLabel jlaUsuario,JLabel jlaDiaSemana,JLabel jlaData,JLabel jlaHora ) {
        super(telaPrincipal, desktop);
        
       timer = new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               atualizarHora();
            }
        });
      timer.start();
       atualizarData();
      
    }
    
    
    
    private void atualizarHora(){
        //Hora
        jlaHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }
    private void atualizarData(){
        //Data 
        jlaData.setText(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
        //Dia da Semana
        jlaDiaSemana.setText(new SimpleDateFormat().format(new Date()));
        //
         jlaHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        
    }
    
    
     private void fechar() {
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
    private void sair(){
        int sair = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
