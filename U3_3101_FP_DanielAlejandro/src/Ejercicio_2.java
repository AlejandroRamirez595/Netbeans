import javax.swing.JOptionPane;

public class Ejercicio_2 {
    public static void main(String[] args) {
       double descuento,total,monto=189000;
       
       descuento = (9000*100)/monto;
       total = (monto*(descuento/100));
       JOptionPane.showMessageDialog(null,"Taller: Basquetbol \nDescuento: "+descuento+"\nTotal a recibir: "+total);
       
       descuento = (1500.0*100.0)/monto;
       total = (monto*(descuento/100));
       JOptionPane.showMessageDialog(null,"Taller: Voleibol \nDescuento: "+descuento+"\nTotal a recibir: "+total);
       
       descuento = (50000*100)/monto;
       total = (monto*(descuento/100));
       JOptionPane.showMessageDialog(null,"Taller: Artes \nDescuento: "+descuento+"\nTotal a recibir: "+total);
       
       descuento = (15000*100)/monto;
       total = (monto*(descuento/100));
       JOptionPane.showMessageDialog(null,"Taller: Futbol \nDescuento: "+descuento+"\nTotal a recibir: "+total);
       
       descuento = (50000*100)/monto;
       total = (monto*(descuento/100));
       JOptionPane.showMessageDialog(null,"Taller: Taekwondo \nDescuento: "+descuento+"\nTotal a recibir: "+total);
       
       descuento = (25000*100)/monto;
       total = (monto*(descuento/100));
       JOptionPane.showMessageDialog(null,"Taller: Ajedres \nDescuento: "+descuento+"\nTotal a recibir: "+total);
       
       descuento = (12000*100)/monto;
       total = (monto*(descuento/100));
       JOptionPane.showMessageDialog(null,"Taller: Musica \nDescuento: "+descuento+"\nTotal a recibir: "+total);
       
       descuento = (13000*100)/monto;
       total = (monto*(descuento/100));
       JOptionPane.showMessageDialog(null,"Taller: Atletismo \nDescuento: "+descuento+"\nTotal a recibir: "+total);
    }
}
