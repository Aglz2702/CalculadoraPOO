/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionespoo;

/**
 *
 * @author Emmanuel Gonzalez
 */
import java.util.Scanner;
public class OperacionesPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        do{
            OperacionesPOO.menu();
        }while(OperacionesPOO.Comenzar());
        
        
    }
    
    
    
    
    
    
    
    
    public static int menu()
    {
        try{
        Scanner Entrada = new Scanner(System.in);
        System.out.println("+++ CALCULADORA +++");
        System.out.println("1.- SUMAR");
        System.out.println("2.- RESTAR");
        System.out.println("3.- MULTIPLICAR");
        System.out.println("4.- DIVIDIR");
        System.out.println("5.- RAIZ");
        System.out.println("6.- POTENCIA");
        System.out.println("->");
        int opc=Entrada.nextInt();
        
        
        
        switch(opc)
        {
            case 1:
                System.out.println("Resultado->"+OperacionesPOO.suma(OperacionesPOO.valores1(), OperacionesPOO.valores2()));
            break;
            case 2: 
                System.out.println("Resultado->"+OperacionesPOO.resta(OperacionesPOO.valores1(), OperacionesPOO.valores2()));
            break;
            case 3: 
                System.out.println("Resultado->"+OperacionesPOO.multiplicacion(OperacionesPOO.valores1(), OperacionesPOO.valores2()));
            break;
            case 4: 
                System.out.println("Resultado->"+OperacionesPOO.division(OperacionesPOO.valores1(), OperacionesPOO.valores2()));
            break;
            case 5: 
                System.out.println("Resultado->"+OperacionesPOO.raiz(OperacionesPOO.valores1()));
            break;
            case 6: 
                System.out.println("Resultado->"+OperacionesPOO.potencia(OperacionesPOO.valores1(), OperacionesPOO.valores2()));
            break;
            default:
                System.err.println("Opcion Invalida!");
             break;
        }
        }catch(Exception ex){
            System.err.println("//////////////////////");
            System.err.println("/CARACTER NO ADMITIDO/");
            System.err.println("//////////////////////");
        }
        return 0;
    }
    
    public static int valores1()
    {

                Scanner Entrada = new Scanner(System.in);
                boolean flag=false;
                do{
                        
                        try{
                            
                        System.out.println("Numero 1:");
                        int nu1=Entrada.nextInt();
                        flag=false; 
                         return nu1;
                        
                       
                        
                        }catch(Exception ex){
                            System.err.println("SOLO NUMEROS");
                        }
                }while(flag);
            throw new RuntimeException("Unreachable");
        
    }
    
    public static int valores2()
    {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Numero 2:");
        int nu2=Entrada.nextInt();
        
        return nu2;
    }
    
    public static int suma(int valor1,int valor2)
    {
        int resultado=valor1+valor2;
        
        return resultado;
    }
    
    public static int resta(int valor1,int valor2)
    {
        int resultado=valor1-valor2;
        
        return resultado;
    }
    
    public static int multiplicacion(int valor1,int valor2)
    {
        int resultado=valor1*valor2;
        
        return resultado;
    }
    
    public static float division(int valor1,int valor2)
    {
        boolean flag=false;
        do{
            try{
                
                float resultado=(float)valor1/valor2;
                flag=false;
                return resultado; 
                
                
            }catch(Exception ex){
                System.err.println("No division entre 0");
            }
            
        }while(flag);
            
        throw new RuntimeException("Unreachable");

    }
    
    public static float raiz(int numer)
    {
        float resultado = (float) Math.sqrt(numer);
        
        return resultado;
    }
    
    public static double potencia(int x,int y)
    {
        double resultado = Math.pow(x, y);
        
        return resultado;
    }
    
    public static boolean Comenzar()
    {
        boolean xxx=false;
        boolean actual=false;
        do{
        try{
        boolean var=false;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Deseas continuar? 1)SI 2)NO");
        int desi=Entrada.nextInt();
        
        switch(desi)
        {
            
            case 1:
                actual=false;
                xxx=true;
                
            break;
            
            case 2:
                actual=false;
                xxx=false;
            break;
        }
        if(desi>2 || desi<1)
        {
            System.err.println("///////////////////");
            System.err.println("/Opcion incorrecta/");
            System.err.println("///////////////////");
            actual=true;
        }
        }catch(Exception ex){
            System.err.println("/////////////////////");
            System.err.println("/Caracter incorrecto/");
            System.err.println("/////////////////////");
            actual=true;
        }
        
    }while(actual);
        boolean xx=xxx;
        
        return xx;
        
        }

    
}
