
package pkg6.precedenciaoperaciones.java;
    import java.util.Scanner;
    import java.text.DecimalFormat;
/**
 *
 * @author anyel
 */
public class PrecedenciaOperacionesJava {

    static double a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, j=0, k=0, l=0, m=0, n=0, p=0, q=0, r=0, s=0, x=0, y=0;
    public static void main(String[] args) {
           pedirDatos();
        calcularOperaciones(a,b,c,d,e,f,g,h,j,k,l,m,n,p,q,r,s,x,y);
    }
    public static void pedirDatos(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame valor de a: ");
        a= entrada.nextDouble();
        System.out.println("Valor de b: ");
        b= entrada.nextDouble();
        System.out.println("Valor de c: ");
        c= entrada.nextDouble();
        System.out.println("Valor de d: ");
        d = entrada.nextDouble();
        System.out.println("Valor de e: ");
        e = entrada.nextDouble();
        System.out.println("Valor de f: ");
        f = entrada.nextDouble();
        System.out.println("Valor de g: ");
        g = entrada.nextDouble();
        System.out.println("Valor de h: ");
        h = entrada.nextDouble();
        System.out.println("Valor de j: ");
        j = entrada.nextDouble();
        System.out.println("Valor de m: ");
        m = entrada.nextDouble();
        System.out.println("Valor de n: ");
        n = entrada.nextDouble();
        System.out.println("Valor de p: ");
        p = entrada.nextDouble();
        System.out.println("Valor de q: ");
        q = entrada.nextDouble();
        System.out.println("Valor de r: ");
        r = entrada.nextDouble();
        System.out.println("Valor de s: ");
        s = entrada.nextDouble();
        System.out.println("Valor de x: ");
        x = entrada.nextDouble();
        System.out.println("Valor de y: ");
        y = entrada.nextDouble();
        
    }
    public static void calcularOperaciones(double a, double b, double c, 
        double d, double e, double f, double g, 
        double h, double j, double k, double l, 
        double m, double n, double p, double q, 
        double r, double s, double x, double y){
        
        DecimalFormat df = new DecimalFormat("#.00");
        //inciso a
        double calculaA;
        calculaA = (3 / 2) + (4 / 3);
        System.out.println("a) "+df.format(calculaA));
        
         //inciso b
         double calculaB;
         calculaB = (1 / (x - 5)) - ((3 * x * y) / 4);
         System.out.println("b) "+df.format(calculaB));
         
         //inciso c
        double calculaC;
        calculaC = (1 / 2) + 7;
        System.out.println("c) "+df.format(calculaC));
        
         //inciso d
         double calculaD;
         calculaD = 7 + (1 / 2);
         System.out.println("d) "+df.format(calculaD));
         
         //inciso e
         double calculaE;
         calculaE = ((a * a) / (b - c)) + ((d - e) / (f - ((g * h) / j)));
         System.out.println("e) "+df.format(calculaE));
         
         //inciso f
         double calculaF;
         calculaF = (m / n) + p;
         System.out.println("f) "+df.format(calculaF));
         
         //inciso g 
         double calculaG;
         calculaG = m + (n / (p - q));
         System.out.println("g) "+df.format(calculaG));
         
         //inciso h
         double calculaH;
         calculaH = (((Math.pow(a, 2)/(Math.pow(b, 2)))+((Math.pow(c, 2)/(Math.pow(d, 2))))));
         System.out.println("h) "+df.format(calculaH));
         
         //inciso i
         double calculaI;
         calculaI = (m+(n/p)/q-(r/s));
         System.out.println("i) "+df.format(calculaI));
         
         //inciso j
         double calculaJ;
         calculaJ = (((3 * a) + b) / (c - (d + (5 * e)) / (f + (g / (2 * h)))));
         System.out.println("j) "+df.format(calculaJ));
         
         //inciso k
         double calculaK;
         calculaK = (a * a + 2 * a * b + b * b) / ((1 / (x * x)) + 2);
         System.out.println("k) "+df.format(calculaK));
    }

    
}
