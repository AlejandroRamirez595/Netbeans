import javax.swing.JOptionPane;
public class Ejercicio_5 {
    public static void main(String[] args) {
        double vol,area;
        short R=0, H=0;
        
        R=Short.parseShort(JOptionPane.showInputDialog("Ingrese un valor para el radio"));
        H=Short.parseShort(JOptionPane.showInputDialog("Igrese un valor para la altura"));
        
        vol=  Math.PI*Math.pow(R, 2)*H;
        area = 2+Math.PI*R*H;
        
        JOptionPane.showMessageDialog(null,"Area: "+area+", Volumen: "+vol);
    }
}
