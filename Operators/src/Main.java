//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {

    Scanner sc=new Scanner((System.in));
    System.out.print("Kérek egy stringet: ");
    String szo=sc.nextLine();
    System.out.print("Kérek egy karaktert: ");
    String kar=sc.nextLine();
    char k=kar.charAt(0);
    System.out.print("Kérek egy másik: ");
    String kari=sc.nextLine();
    char ka=kari.charAt(0);
    System.out.print("Kérek egy egész számot: ");
    String b=sc.nextLine();
    int szam=Integer.parseInt(b);
    System.out.print("Kérek egy másik egész számot: ");
    String c=sc.nextLine();
    int szamk=Integer.parseInt(b);
    System.out.print("Kérek egy számot: ");
    String d=sc.nextLine();
    double dup=Double.parseDouble(d);
    System.out.print("Kérek egy másik számot: ");
    String e=sc.nextLine();
    double dupla=Double.parseDouble(e);
    String ujszo=szo+k+kari;
    IO.println("1:"+ujszo);
    int oszt=szam/szamk;
    IO.println("2:"+oszt);
    double oszad=dup+dupla;
    IO.println("3:"+oszad);
    double von=szam-dupla;
    IO.println("4:"+von);
    double szor=szamk*dup;
    IO.println("5:"+szor);


    //kasztolás
    //intből char
    char inc=(char)szam;
    String ujj=inc+szo+k;
    IO.println("6:"+ujj);
    double mydup=szam;
    IO.println("7:"+(mydup-dupla));


}
