
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel implements ActionListener{
	
	private Image fundo;
	private Ninja ninja;
	private Timer timer;
	
	public Fase(){
		setFocusable(true);
		setDoubleBuffered(true);
		addKeyListener(new TecladoAdapter());
		ImageIcon referencia = new ImageIcon("rsc\\Fundo.jpg");
		fundo = referencia.getImage();
		ninja = new Ninja();
		timer = new Timer(5,this);
		timer.start();
	}
	
	public void paint(Graphics g){
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo,0,0,null);
		graficos.drawImage(ninja.getImagem(),ninja.getX(),ninja.getY(),this);
		
		List<Shuriken> shurikens = ninja.getShurikens();
		
		for(int i=0;i < shurikens.size();i++){
			
			Shuriken s = (Shuriken) shurikens.get(i);
			graficos.drawImage(s.getImagem(), s.getX(), s.getY(), this);
		}
		
		g.dispose();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		List<Shuriken> shurikens = ninja.getShurikens();
		
		for (int i=0;i<shurikens.size();i++){
			Shuriken s = (Shuriken) shurikens.get(i);
			
			if(s.isVisible())
				s.mexer();
			else
				shurikens.remove(i);
		}
		ninja.mexer();
		repaint();
		
	}
	
	private class TecladoAdapter extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			ninja.keyPressed(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			ninja.keyReleased(e);
		}
		
	}

}
