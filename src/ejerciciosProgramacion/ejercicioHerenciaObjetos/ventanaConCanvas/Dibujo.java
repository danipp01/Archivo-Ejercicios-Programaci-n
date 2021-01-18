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
		g.fillRect(10, 10, 50, 50);
		
		g.setColor(Color.GREEN);
		g.fillOval(45, 65, 40, 40);
		
		int[] x = {90,90,150};
		int[] y = {30,110,70};
		g.setColor(Color.BLUE);
		g.fillPolygon(x,y,3);
		
		
	}
	
}
