/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.variablearguments;

/**
 *
 * @author ereni
 */
public class VariableArguments {

    public static void main(String[] args) {
       System.out.println(product(2));
       System.out.println(product(3, 4));
       System.out.println(product(7,8,9));
       System.out.println(product(1,4,2,1));
       System.out.println(product(8,1,3,5,1));
       System.out.println(product(2, 5,7,8,2,1));
       System.out.println(product(10, 2,3,4,1,3,9));
       
    }
    
    
    
    
 public static int product(int... nums){
     int product=1;
     for(int i : nums){
         product *= i;
     }
     
        return product;
 }
}
