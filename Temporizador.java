package cl.juliogodoymunoz.Imagen3;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.InputStream;
import java.util.Date;



public class Temporizador{
   static final int milisegundo=1;
   static final int  segundos=1000;
   static final int minutos=60000;
   static final int horas=3600000;
   Date tiempo=new Date();
   long esperar;
   
   
   Temporizador(int tipo,int cantidad){
	esperar=tipo*cantidad;
	
   }
      
   void espera() {
         long ti=tiempo.getTime();         
         while(tiempo.getTime()-ti<esperar) {
	    	
        	 tiempo=new Date();
	    }
       
   }

}
