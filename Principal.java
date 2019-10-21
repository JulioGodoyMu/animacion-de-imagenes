package cl.juliogodoymunoz.Imagen3;

import java.io.IOException;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) throws IOException {
		JFrame frame=new JFrame();
		frame.setBounds(0,0,700,700);
		String ruta="C:\\Users\\julio\\Desktop\\mua2.jpg";
		String ruta2="C:\\Users\\julio\\Desktop\\tenis.png";
		Panel panel=new Panel(ruta,ruta2,600,700);
		frame.add(panel);
		frame.setVisible(true);
		Temporizador tiempo=new Temporizador(Temporizador.milisegundo,5);
		for(int i=0;i<500;i++) {
			panel.cambiarCoordenadas(i, i);
			panel.repaint();
			tiempo.espera();
			if(i>498)
				i=0;
		}

	}

}
