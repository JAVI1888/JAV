
package ejer2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TablasMult {
 
    public static void main (String JAVI[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Que tabla  quieres ver");
        int num=scanner.nextInt();
        for (int i=1; i <=100;i++){
            System.out.println(num+"*"+i+"="+(num*i));
            
            
        }
      
       
        
       
      
}
}