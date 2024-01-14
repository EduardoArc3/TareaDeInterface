import javax.swing.*;
import java.util.Scanner;

public class testclass implements aritmeticos{
    public static void main(String[] args) {
        //System.out.println(aritmeticos.resta(0,aritmeticos.resta(5,-8)));




        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de x");
        System.out.print("> ");
        int x = sc.nextInt();
        System.out.println("Ingresa el valor de y");
        System.out.print("> ");
        int y = sc.nextInt();
        System.out.println("¿Que quieres hacer?\n[1] Suma\n[2] Resta\n[3] Multiplicacion\n[4] Division");
        System.out.print("> ");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:{
                System.out.println(new testclass().suma(x,y));
                break;
            }
            case 2:{
                System.out.println(new testclass().resta(x,y));
                break;
            }
            case 3:{
                System.out.println(new testclass().multiplicacion(x,y));
                break;
            }
            case 4:{
                System.out.println(new testclass().division(x,y));
                break;
            }
            default:{
                System.out.println("Opcion invalida");
            }
        }
    }


    public int suma(int x, int y) {
        return x+y;
    }

    public int resta(int x, int y) {
        return x-y;
    }

    public int multiplicacion(int x, int y) {
        return x*y;
    }

    public int division(int x, int y) {
        if (y != 0 ){
            return x/y;

        }else {
            JOptionPane.showMessageDialog(null,"ERROR DIVISION ERRONEA", "",JOptionPane.ERROR_MESSAGE);
            //System.out.println("Division erronea");
            return 0;
        }
    }
}

interface aritmeticos{
    public  int suma (int x, int y);

    public int resta (int x, int y);

    public int multiplicacion (int x, int y);

    public int division (int x, int y);


}
