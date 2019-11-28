package project2;
import java.awt.*;
import java.applet.*;

public class class1 extends Applet  implements Runnable{
	
	Thread runner;
	int ball_x[]= {330, 217};
	int ball_y[]= {162, 212};
	int ball_vel_x[]= {5,5};
	int ball_vel_y[]= {5,5};
	int x[]= {190,245,230,205};
	int y[]= {385,385,410,410};
	int n= x.length;
	public void start()
	{
		if(runner==null)
		{
			 runner = new Thread(this);
		     runner.start();
			 
		}
	}
	
	public void stop() {
		         if (runner != null) {
		             runner.stop();
		             runner = null;
		          }
		  }
	public void run()
	{
	
		ballBounce();
		repaint();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		}
	}
	  
	public void ballBounce() {
		ball_x[0]= ball_x[0] - ball_vel_x[0];
		
		if(ball_x[0]<=265) {
			ball_vel_x[0]= 0;
			ball_y[0]= ball_y[0] - ball_vel_y[0];
		}
		if(ball_y[0]<=112) {
			ball_vel_y[0]=0;
			ball_vel_x[0]= 5;	
		}
		if(ball_x[0]<=217) {
			ball_vel_x[0]=0;
			ball_vel_y[0]=0;
		}
		if(ball_x[0]<=217 && ball_y[0]<=112) {
			ball_x[1]=ball_x[1] + ball_vel_x[1];
		}
		if(ball_x[1]>=265) {
			ball_vel_x[1]=0;
			ball_y[1]=ball_y[1] + ball_vel_y[1];
		}
		if(ball_y[1]>=262) {
			ball_vel_y[1]=0;
			ball_vel_x[1]=5;
		}
		if(ball_x[1]>=337) {
			ball_vel_y[1]=0;
			ball_vel_x[1]=0;
		}
	}
	
	public void paint(Graphics G) {
		G.drawString("java project", 300, 40);
		
		//initial parallel lines
		G.drawLine(275, 10, 275, 550);
		G.drawLine(255, 10, 255, 550);
		
		//Pc
		G.drawRect(205, 150, 25, 25);
		G.drawString("PC", 175, 112);
		G.drawLine(230, 162, 255, 162);
		
		//IR
		G.drawRect(325, 250, 25, 25);
		G.drawString("IR", 355, 262);
		G.drawLine(275, 262, 325, 262);
		
		//decoder unit
		G.drawString("Instruction decoder",390,160);
		G.drawString("and",390,170);
		G.drawString("control logic",390,180);
	    G.drawLine(275,180,325, 180);
		G.drawRect(325,150,50,50);
	    
		//r1
		G.drawRect(325, 295, 25, 25);
		G.drawString("R1", 355, 310);
		G.drawLine(275, 310, 325, 310);
		
		 
		//r2
		G.drawRect(325, 350, 25, 25);
		G.drawString("R2", 355, 360);
		G.drawLine(275, 362, 325, 362);
		
		//line for ir and decoder unit
		G.drawLine(340,250,340,200);
	
		
		
		//r3
		
		G.drawRect(325, 402, 25, 25);
		G.drawString("R3", 355, 410);
		G.drawLine(275, 415, 325, 415);
	
		//r4
		G.drawRect(325, 450, 25, 25);
		G.drawString("R4", 355, 462);
		G.drawLine(275, 462, 325, 462);
		
		//temp
		G.drawRect(325, 505, 45, 25);
		G.drawString("TEMP", 375, 519);
		G.drawLine(275, 518, 325, 518);
		
		//mar
		G.drawRect(205, 100, 25, 25);
		G.drawString("MAR", 175, 175);
		G.drawLine(230, 112, 255, 112);
		
		//mdr
		G.drawRect(205, 200, 25, 25);
		G.drawString("MDR", 175, 212);
		G.drawLine(230, 212, 255, 212);
		
		//x
		G.drawRect(195, 260, 25, 25);
		G.drawString("X", 185, 280);
		G.drawLine(220, 270, 255, 270);
		
		G.drawString("add", ball_x[1], ball_y[1]);
		
	
		
		G.drawPolygon(x,y,n);
		
		//alu
	    G.drawString("ALU",165,405);
		G.drawLine(230, 385, 230, 352);
		
		G.drawLine(230, 352, 255, 352);
		
		//line for constant 4
		G.drawLine(195, 340, 195, 325);
		G.drawString("Constant 4",145,323);
				
		//mux
		G.drawRect(190, 340, 25, 25);
		G.drawString("MUX", 160, 352);
		
		//line bw x and mux
		G.drawLine(210, 340, 210, 285);
		
		//y
		G.drawRect(205, 445, 25, 25);
		G.drawString("Y", 185, 460);
		G.drawLine(230, 460, 255, 460);
		
		//connecting lines for mux and alu
		G.drawLine(202, 365, 202, 385);
		
		G.drawLine(212, 410,212,445);
	}

}
