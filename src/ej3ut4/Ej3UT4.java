package ej3ut4;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ej3UT4 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        char operador;

        Scanner teclado = new Scanner(System.in);
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        operador = teclado.next().charAt(0);
        int res = 0;

        switch (operador) {
            case '+' :
                res=num1 + num2;
                
                break;
        
                case '-' :
                res=num1 - num2;
                
                break;
                
                case 'x' :
                res=num1 * num2;
                
                break;
                
                case ':' :
                res=num1 / num2;
                
                break;
                
        }
        System.out.println(res);
    }

}
