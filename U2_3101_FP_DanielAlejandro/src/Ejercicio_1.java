import javax.swing.JOptionPane;
public class Ejercicio_1 {
    public static void main(String[] args) {
        short A=0, B=0;
        
        A=Short.parseShort(JOptionPane.showInputDialog("Ingrese un valor para A"));
        B=Short.parseShort(JOptionPane.showInputDialog("Igrese un valor diferente a A para B"));
        
        if(A == B){
            JOptionPane.showMessageDialog(null,"Los valores de A: "+A+" y "+" B: "+B+" son iguales");
        }else if(A > B){
            JOptionPane.showMessageDialog(null,"El valor de A: "+A+" es mayor que B:"+B);
        }else{
            JOptionPane.showMessageDialog(null,"El valor de B: "+B+" es mayor que A:"+A);
        } 
    }
}
