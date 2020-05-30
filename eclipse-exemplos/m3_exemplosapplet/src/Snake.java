import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Timer;
import java.util.TimerTask;
public class Snake extends Applet
{	private static final long serialVersionUID = -5849185595377946921L;
	int fase;
	int[] maca;
	int[] velocidade={260,230,200,170,140,110,80};
	Timer timer = new Timer();
	Cobra plr=new Cobra(10),adv=new Cobra(20);
	boolean movimentando=false;
	public void init()
	{	setSize(300,300);
		fase=1;
		geramaca();
		movimentando=false;
	}
	int[] ponto(int x,int y)
	{	return new int[] {x,y};
	}
	private void geramaca()
    {   boolean flag;
        do
        {   maca=ponto((int)(Math.random()*30),(int)(Math.random()*30));
            flag=false;
            for(int x=0;x<plr.size;x++)
            {	if(maca[0]==plr.segs[x][0]&&maca[1]==plr.segs[x][1])
            	flag=true;
            }
            for(int x=0;x<adv.size;x++)
            {	if(maca[0]==adv.segs[x][0]&&maca[1]==adv.segs[x][1])
            	flag=true;
            }
        }while(flag);
    }
	public boolean keyDown(Event evt, int key)
	{	//System.out.println(key);
		if(!movimentando)
		{	plr=new Cobra(10);
			adv=new Cobra(20);
			geramaca();
			mudavelocidade();
			movimentando=true;
		}
		switch(key)
		{	case 1004: if(plr.segs[plr.size-1][1]<=plr.segs[plr.size-2][1]) plr.direcao=1; break;
			case 1005: if(plr.segs[plr.size-1][1]>=plr.segs[plr.size-2][1]) plr.direcao=2; break;
			case 1006: if(plr.segs[plr.size-1][0]<=plr.segs[plr.size-2][0]) plr.direcao=0; break;
			case 1007: if(plr.segs[plr.size-1][0]>=plr.segs[plr.size-2][0]) plr.direcao=3; break;
			case 27: System.exit(1); break;
		}
		return true;
	}
	void mudavelocidade()
	{	timer.cancel();
		timer.purge();
		timer = new Timer();
		if(fase<7) timer.schedule(new Anda(),600,velocidade[fase]);
		else timer.schedule(new Anda(),600,120);
	}
	public void paint(Graphics g)
	{	g.setColor(new Color(255,255,255));
		g.fillRect(0,0,300,300);
		g.setColor(new Color(5,5,225));
		for(int x=1;x<plr.size;x++) g.fillPolygon(losango(plr.segs[x][0],plr.segs[x][1]));
		g.setColor(new Color(5,225,5));
		for(int x=1;x<adv.size;x++) g.fillPolygon(losango(adv.segs[x][0],adv.segs[x][1]));
		g.setColor(new Color(225,5,5));
		g.fillRect(maca[0]*10,maca[1]*10,10,10);
		g.fillPolygon(losango(maca[0],maca[1]));
		g.setColor(new Color(255,255,255));
		g.fillRect((maca[0]*10)+4,(maca[1]*10)+4,2,2);
		g.fillRect((plr.segs[plr.size-1][0]*10)+4,(plr.segs[plr.size-1][1]*10)+4,2,2);
		g.fillRect((adv.segs[adv.size-1][0]*10)+4,(adv.segs[adv.size-1][1]*10)+4,2,2);
		if(!movimentando)
		{	g.fillRect(maca[0]*10,maca[1]*10,10,10);
			g.fillPolygon(losango(maca[0],maca[1]));
			g.setColor(new Color(5,5,5));
			g.setFont(new Font("Verdana",1,12));
			g.drawString("Coma mais maças que a cobra adversária",10,60);
			g.drawString("E espere que ela erre para passar de fase",10,80);
			g.setColor(new Color(225,5,5));
			g.setFont(new Font("Verdana",1,18));
			g.drawString("Fase "+fase,122,150);
			g.setFont(new Font("Verdana",0,10));
			g.setColor(new Color(5,5,5));
			if(adv.win)g.drawString("Placar: "+plr.ptos+" maçãs X "+adv.ptos+" maçãs",86,210);
			g.setColor(new Color(5,5,5));
			if(!plr.win&&!adv.win)g.drawString("Clique sobre a Applet",86,210);
			g.drawString("Pressione qualquer tecla para iniciar",46,230);
		}
	}
	private Polygon losango(int x,int y)
	{	return new Polygon(new int[]{(x*10)-2,(x*10)+5,(x*10)+12,(x*10)+5},new int[]{(y*10)+5,(y*10)+12,(y*10)+5,(y*10)-2},4);
	}
	class Cobra
	{	int size,fase,direcao,ptos;
		int[][] segs;
		boolean win;
		public Cobra(int y)
		{	segs=new int[100][1];
			size=8;
			ptos=0;
			segs[0]=ponto(1,y);
			segs[1]=ponto(2,y);
			segs[2]=ponto(3,y);
			segs[3]=ponto(4,y);
			segs[4]=ponto(5,y);
			segs[5]=ponto(6,y);
			segs[6]=ponto(7,y);
			segs[7]=ponto(8,y);
			direcao=3;
			win=false;
		}
		void passavalor(int x,int y)
		{	segs[x]=ponto(segs[y][0],segs[y][1]);
		}
		void remix()
		{	for(int z=1;z<size;z++) passavalor(z-1,z);
		}
		void redim()
		{	size+=5;
			for(int z=size;z>5;z--) passavalor(z-1,z-6);
			for(int z=0;z<5;z++) passavalor(z,5);
		}
		void rumo()
		{	if(direcao==0) if(segs[size-1][0]<=segs[size-2][0]) segs[size-1][0]=(segs[size-1][0]+29)%30;
	    	if(direcao==1) if(segs[size-1][1]<=segs[size-2][1]) segs[size-1][1]=(segs[size-1][1]+29)%30;
	    	if(direcao==2) if(segs[size-1][1]>=segs[size-2][1]) segs[size-1][1]=(segs[size-1][1]+1)%30;
	    	if(direcao==3) if(segs[size-1][0]>=segs[size-2][0]) segs[size-1][0]=(segs[size-1][0]+1)%30;
		}
		boolean iseating()
		{	return (segs[size-1][0]==maca[0]&&segs[size-1][1]==maca[1]);
		}
	}
	class Anda extends TimerTask
	{   public void run()
	    {	plr.remix();
	    	adv.remix();
	    	if(((adv.direcao==0)||(adv.direcao==3))&&(adv.segs[adv.size-1][0]==maca[0]))
	    	{	for(int x=0;x<15;x++) if(maca[1]==(adv.segs[adv.size-1][1]+x)%30) adv.direcao=2;
	    		for(int x=0;x<15;x++) if(maca[1]==(adv.segs[adv.size-1][1]-x+30)%30) adv.direcao=1;
	    	}
	    	if(((adv.direcao==1)||(adv.direcao==2))&&(adv.segs[adv.size-1][1]==maca[1]))
	    	{	for(int x=0;x<15;x++) if(maca[0]==(adv.segs[adv.size-1][0]+x)%30) adv.direcao=3;
	    		for(int x=0;x<15;x++) if(maca[0]==(adv.segs[adv.size-1][0]-x+30)%30) adv.direcao=0;
	    	}
	    	plr.rumo();
	    	adv.rumo();
	    	if(plr.iseating())
			{	plr.redim();
				geramaca();
				plr.ptos++;
			}
	    	if(adv.iseating())
			{	adv.redim();
				geramaca();
				adv.ptos++;
			}
			for(int z=1;z<plr.size-2;z++) if(plr.segs[z][0]==plr.segs[plr.size-1][0]&&plr.segs[z][1]==plr.segs[plr.size-1][1]) adv.win=true;
			for(int z=1;z<adv.size-2;z++) if(adv.segs[z][0]==plr.segs[plr.size-1][0]&&adv.segs[z][1]==plr.segs[plr.size-1][1]) adv.win=true;
			for(int z=1;z<adv.size-2;z++) if(adv.segs[z][0]==adv.segs[adv.size-1][0]&&adv.segs[z][1]==adv.segs[adv.size-1][1]) plr.win=true;
			if(adv.win||plr.win)
			{	if(plr.win)
				{	if(plr.ptos>adv.ptos) fase++;
					else
					{	plr.win=false;
						adv.win=true;
					}
				}
				movimentando=false;
				timer.cancel();
				timer.purge();
			}
			paint(getGraphics());
	    }
	}
}