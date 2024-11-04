
import javax.swing.JOptionPane;

public class Ejercicio_4 {
    public static void main(String[] args) {
        double catA=0, catB=0,hip;
        
        catA=Short.parseShort(JOptionPane.showInputDialog("Ingrese un valor para el cateto A"));
        catB=Short.parseShort(JOptionPane.showInputDialog("Igrese un valor para el cateto B"));
        
        hip = Math.sqrt(catA+catB);
        JOptionPane.showMessageDialog(null,"Hipotenusa: "+hip);
    }
    
}
