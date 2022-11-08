/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class sayınıntersi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input = new Scanner(System.in); 
       System.out.println("Lütfen Pozitif Bir Tam Sayı Giriniz: ");
       int sayi = input.nextInt();
       System.out.println("Girdiğiniz Sayının Testen Yazılışi =   ");
       while(sayi > 0)
       {    
       System.out.print(sayi % 10);
       sayi /= 10;
       } 
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
