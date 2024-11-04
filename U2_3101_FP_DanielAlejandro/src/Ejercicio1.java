import javax.swing.JOptionPane;
public class Ejercicio1 {
    //escribe un programa en java que solicite tu año de nacimiento y apartir de ello calcule tu edad
    public static void main(String[] args) {
        short anio;
        byte edad;
        int anioAct=2024;
        
        anio= Short.parseShort(JOptionPane.showInputDialog("Ingrese su año de naciemto"));
        edad = (byte) (anioAct-anio);
        
        JOptionPane.showMessageDialog(null,"Tu edad es: "+ edad);
    }
}
