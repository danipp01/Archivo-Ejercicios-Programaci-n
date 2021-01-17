package ejercicioHerenciaObjetos.ventanaConCanvas;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Dibujo extends Canvas {
	public Dibujo() {
		
	}
	
	@Override
	public void paint (Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(10, 10, 30, 50);
		
		g.setColor(Color.DARK_GRAY);
		g.fillOval(50, 10, 30, 50);
		
		int[] x = {90,90,150};
		int[] y = {30,110,70};
		g.setColor(Color.BLUE);
		g.fillPolygon(x,y,3);
		
		
	}
	
}
