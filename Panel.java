package cl.juliogodoymunoz.Imagen3;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private Image imagen;
    private Image imagenInsertar;
    private int x,y;
	Panel(String ruta, String ruta2, int ancho, int alto) throws IOException{
		
		File file=new File(ruta);
		File file2=new File(ruta2);
		 imagen=ImageIO.read(file);
		 imagen=cambiarTamañoImagen(imagen,ancho,alto);
		 imagenInsertar=ImageIO.read(file2);
		 imagenInsertar=cambiarTamañoImagen(imagenInsertar,100,100);
		 setBounds(0,0,ancho,alto);
		 
		 }
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(imagen,0,0,null);
		if(x!=0&&y!=0)
		g.drawImage(imagenInsertar,x,y,null);
	}
	public Image cambiarTamañoImagen(Image imagen,int ancho,int alto) {
		imagen=imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
		return imagen;
	}
	public void cambiarCoordenadas(int x,int y) {
		this.x=x;
		this.y=y;
		}
}
