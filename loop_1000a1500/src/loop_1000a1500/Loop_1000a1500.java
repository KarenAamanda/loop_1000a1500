/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop_1000a1500;
import java.util.Scanner;
/**
 *
 * @author D
 */
public class Loop_1000a1500 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int i,a;
      i = 1000;
      while (i<1500){
          a = i+2;
          System.out.println(a);
          i = i+2;
      }
    }
    
}
