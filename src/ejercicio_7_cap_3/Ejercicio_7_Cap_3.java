

package ejercicio_7_cap_3;

import javax.swing.JOptionPane;


public class Ejercicio_7_Cap_3 {


    public static void main(String[] args) {
        // TODO code application logic here
        double A,B;
        A = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primer numero"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su segundo numero"));
        
        if (A>B){
            JOptionPane.showMessageDialog(null, A+" es mayor que "+B);
        }
        else if (A == B){
            JOptionPane.showMessageDialog(null, A+" es igual que "+B);
            
        }
        else {
            JOptionPane.showMessageDialog(null, B+" es menor que "+A);

        }
    }
    
}
