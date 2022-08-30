import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y;
        //double xA, xB, xC, yA, yB, yC,
        double areaX, areaY;

        System.out.println("Entre com as medidas do triangulo (lado a, lado b e lado c):");
        
        //xA = sc.nextDouble();
        //x.a = sc.nextDouble();
        //x.setA(sc.nextDouble());
        //xB = sc.nextDouble();
        //x.b = sc.nextDouble();
        //x.setB(sc.nextDouble());
        //xC = sc.nextDouble();
        //x.c = sc.nextDouble();
        //x.setC(sc.nextDouble());

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        x.setA(a);
        x.setB(b);
        x.setC(c);

        System.out.println("Entre com as medidas do triangulo (lado a, lado b e lado c):");
        //yA = sc.nextDouble();
        //y.a = sc.nextDouble();
        //yB = sc.nextDouble();
        //y.b = sc.nextDouble();
        //yC = sc.nextDouble();
        //y.c = sc.nextDouble();
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        y = new Triangulo(a, b, c);

        //double p = (xA+xB+xC)/2;
        //double p = (x.a+x.b+x.c)/2;
        //double calc = p*(p-xA)*(p-xB)*(p-xC);
        //double calc = p*(p-x.a)*(p-x.b)*(p-x.c);
        //areaX = Math.sqrt(calc);
        areaX = x.area();


        //p = (yA+yB+yC)/2;
        //p = (y.a+y.b+y.c)/2;
        //calc = p*(p-yA)*(p-yB)*(p-yC);
        //calc = p*(p-y.a)*(p-y.b)*(p-y.c);        
        //areaY = Math.sqrt(calc);
        areaY = y.area();

       double maior = 0.0;

       System.out.printf("A area do triangulo X é: %.2f%n", areaX);
       System.out.printf("A area do triangulo Y é: %.2f%n", areaY);

        if(areaX > areaY){
            maior = areaX;
            System.out.println("Triangulo com maior area: X");
        }else{
            maior = areaY;
            System.out.println("Triangulo com maior area: Y");
        }

        System.out.println();
    }
}
