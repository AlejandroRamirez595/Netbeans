import javax.swing.JOptionPane;

public class Ejercicio_1 {
    public static void main(String[] args) {
         String bolita;
         double monto,total,descuento = 0;
         
         monto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a pagar"));
         bolita=JOptionPane.showInputDialog("Ingrese el color de la bolita obtenida");
         
         if(bolita.contentEquals("rojo")|| bolita.contentEquals("Rojo") || bolita.contentEquals("ROJO")){
            descuento=40;
         }else if(bolita.contentEquals("verde")|| bolita.contentEquals("Verde") || bolita.contentEquals("VERDE")){
            descuento = 28;
         }else if(bolita.contentEquals("azul")|| bolita.contentEquals("Azul") || bolita.contentEquals("AZUL")){
            descuento = 15;
         }else if(bolita.contentEquals("amarillo")|| bolita.contentEquals("Amarillo") || bolita.contentEquals("AMARILLO")){
            descuento = 5;
         }else{
             JOptionPane.showMessageDialog(null,"Eror intenta de nuevo");
         }
         
         total= monto-(monto*(descuento/100));
         JOptionPane.showMessageDialog(null,"Descuento: "+descuento+"\nMonto: "+monto+"\nColor de la bola: "+bolita+"\nTotal: "+total);
    }
}
