
import javax.swing.JOptionPane;

public class Vane {
    public static void main(String[] args) {
         byte bolita;
         double monto,total;
         
         monto=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a pagar"));
         JOptionPane.showMessageDialog(null,"Rojo=1\nVerde=2\nAzul=3\nAmarillo=4");
         bolita=Byte.parseByte(JOptionPane.showInputDialog("Ingrese el numero del color de la bolita obtenida"));
         
         if(bolita==1){
             total= monto-(monto*(40.0/100.0));
         JOptionPane.showMessageDialog(null,"Descuento: 40%\nMonto: "+monto+"\nColor de la bola: Rojo\nTotal: "+total);
         }else if(bolita==2){
             total= monto-(monto*(28/100));
         JOptionPane.showMessageDialog(null,"Descuento: 28%\nMonto: "+monto+"\nColor de la bola: Verse\nTotal: "+total);
         }else if(bolita==3){
             total= monto-(monto*(15.0/100.0));
         JOptionPane.showMessageDialog(null,"Descuento: 15%\nMonto: "+monto+"\nColor de la bola: Azul\nTotal: "+total);
         }else if(bolita==4){
             total= monto-(monto*(5/100));
         JOptionPane.showMessageDialog(null,"Descuento: 5%\nMonto: "+monto+"\nColor de la bola: Amarillo\nTotal: "+total);
         }else{
             JOptionPane.showMessageDialog(null,"Eror intenta de nuevo");
         }
    }
}
