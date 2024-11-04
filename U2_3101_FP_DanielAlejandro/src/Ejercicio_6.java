import javax.swing.JOptionPane;
public class Ejercicio_6 {
    public static void main(String[] args) {
        short N;
        
        N=Short.parseShort(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if(N%2==0){
            JOptionPane.showMessageDialog(null,"El numero: "+N+" es par");
        }else{
            JOptionPane.showMessageDialog(null,"El numero: "+N+" es impar");
        }
    }
}
