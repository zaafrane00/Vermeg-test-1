/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Zaafrane
 */
public class Exercice1 {

     public static double calculateTotalPrice(int x,double y){
        return x*y;
    }
    
    public static void main(String[] args) {
       
       
           try ( 
            Scanner scanner = new Scanner( System.in ) ) {
            System.out.print( "Veuillez saisir la quantite : " );
            int a = scanner.nextInt();
            
            System.out.print( "Veuillez saisir le prix unite : " );
            double b=scanner.nextDouble();
         
                       
           
            
            System.out.println(calculateTotalPrice(a,b));
          
            
        }catch(Exception e){e.getMessage();}
    }
    
}
