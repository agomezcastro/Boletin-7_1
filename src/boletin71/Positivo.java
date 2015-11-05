

package boletin71;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Positivo {
    public static int PedirNumEnteiro(){
        int num;
        String res= JOptionPane.showInputDialog("Teclea un numero");
        num= Integer.parseInt(res);
        return num;
    }
    public static void positivo(int num){
        if(num>=0)
            System.out.println("o numero e positivo");
        else
            System.out.println("o numero e negativo");
        }
    }
