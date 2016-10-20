/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema2;

import java.util.Scanner;

/**
 *
 * @author Enano
 */
public class PP2Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double meters;
        final double Foot=3.28,Yard=1.09,Miles=0.000621;
        //Resolución
        meters=getInf();
        print (calcFoot(meters, Foot), calcYard(meters, Yard), calcMiles(meters, Miles), meters);
    }
    public static double getInf()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("**** Bienvenid@ ****");
        System.out.println("Ingrese la cantidad en metros que desea convertir: ");
        return in.nextDouble();
    }
    public static double calcFoot(double m, double f)       //Esta función múltiplica los metros por su equivalente en pies
    {
        double resF;
        resF=m*f;                                                              
        return resF;
    }
    public static double calcYard(double m, double y)       //Esta función múltiplica los metros por su equivalente en yardas
    {
        double resY;
        resY=m*y;
        return resY;
    }
    public static double calcMiles (double m, double ml)    //Esta función múltiplica los metros por su equivalente en millas
    {
        double resMl;
        resMl=m*ml;
        return resMl;
    }
    public static void print (double F, double Y, double Ml, double meters) //Se imprimen los resultados de cada función.
    {
        System.out.println(meters+" metro es equivalente a: ");
        System.out.println(F+" pies.");                                         
        System.out.println(Y+" yardas.");
        System.out.println(Ml+" millas.");
    }
}
