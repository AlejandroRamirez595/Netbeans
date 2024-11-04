import javax.swing.JOptionPane;
public class Ejercicio_7 {
    public static void main(String[] args) {
        short nota;
        
        nota= Short.parseShort(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if(nota >= 19 || nota <= 20){
            JOptionPane.showMessageDialog(null,"Tienes nota de A");
        }else if(nota>=16 || nota<=18){
            JOptionPane.showMessageDialog(null,"Tienes nota de B");
        }else if (nota>=13 || nota<=15) {
            JOptionPane.showMessageDialog(null,"Tienes nota de C");
        }else if (nota>=10 || nota<=12) {
            JOptionPane.showMessageDialog(null,"Tienes nota de D");
        }else if (nota>=1 || nota<=9) {
            JOptionPane.showMessageDialog(null,"Tienes nota de E");
        }
    }
}
