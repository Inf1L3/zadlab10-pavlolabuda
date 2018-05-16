package pl.edu.ur.oopl10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mchla
 */
public class WprowadzZKonsoli {

     public void podajInt(){

        int intValue;

        Scanner scanner = new Scanner(System.in);

        

        try{

            System.out.print("Podaj liczbe : ");

            intValue = scanner.nextInt();

        }

        catch(InputMismatchException f){

            System.out.println("Blad. Wprowadzono nieprawidlowy typ danych");

        }

    }
    }


public class Zadanie2 {
    
    public static void main(String[] args){
       
        

        int[] tab = {10, 20, 30, 40, 50};
        int b;
        try (Scanner a = new Scanner(System.in)) {
            System.out.println("Który element wyświetlić?");
            b = a.nextInt();
        }
        try {
            int c;
            System.out.println(tab[b]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Indeks wykracza poza zakres");
        }
    }
    
      }

  
