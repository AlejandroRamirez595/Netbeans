import javax.swing.JOptionPane;

public class Ejercicio_2 {
    public static void main(String[] args) {
        short A,B,C;
        
        A=Short.parseShort(JOptionPane.showInputDialog("Ingrese un valor para A"));
        B=Short.parseShort(JOptionPane.showInputDialog("Igrese un valor para B"));
        C=Short.parseShort(JOptionPane.showInputDialog("Igrese un valor para C"));
       
        if(A>B && A>C){
             JOptionPane.showMessageDialog(null,"A: "+A+" es el mayor");
        }else if(B>A && B>C){
             JOptionPane.showMessageDialog(null,"B: "+B+" mayor");
        }else{
                
         JOptionPane.showMessageDialog(null,"C: "+C+" mayor");   
        }
    }
}
