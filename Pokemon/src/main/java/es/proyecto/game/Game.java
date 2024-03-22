package es.proyecto.game;

import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import es.proyecto.grafics.Screen;

public class Game extends Canvas implements Runnable{
	
	private static final long serialVersionUID = 1L;

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	private static volatile boolean working = false; // Variable que si puede ser modificada por distintos
																// hilos, con esto te aseguras de que no ocurra
																// (volatile)

	private static final String NOMBRE = "NeverLand";
	private static String APS_COUNTER = "";
	private static String FPS_COUNTER = "";

	private static int aps = 0;
	private static int fps = 0;

	private static int x = 0;
	private static int y = 0;

	private static JFrame window;
	private static Thread thread;
	private static Keyboard keyboard;
	private static Screen screen;

	//private static map map;

	private static BufferedImage imagen = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	private static int[] pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();
	private static final ImageIcon icono = new ImageIcon(Game.class.getResource("/icono/iconoVentana.png"));


	public static void main(String[] args) {
		Game game = new Game();
		game.ini();
	}
	private synchronized void iniciar() {
		working = true;
		thread = new Thread(this, "Graficos");
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
