import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double a,e,p,d,m;
        Scanner input=new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        a=input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        e=input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        d=input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        m=input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        p=input.nextDouble();

        a=a*2.14;
        e=e*3.67;
        d=d*1.11;
        m=m*0.95;
        p=p*5.00;

        double toplam=a+e+d+m+p;
        System.out.println("Toplam tutar: "+toplam+ "TL");

    }
}
