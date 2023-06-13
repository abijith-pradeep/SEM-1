package Projects;

import java.util.*;
public class mech_and_oops {


public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length");
double l=sc.nextDouble();
System.out.println("Enter the angular velocity");
double w=sc.nextDouble();
sc.close();

if(w>=2 && w<=10 && l>=0.5 && l<=2) {
Question s1= new alphadtet(w,l);
System.out.println("time: "+s2.cal());
}
else {
System.out.println("Error!");
}
} }

interface Question{
public double cal();
}
class time implements Question{


double tim;
public  time(double w,double tet,double l){

double dx=0.000001;

double t=0;
double g=9.81;
for(double i=0;i<=tet;i+=dx) {
t=t+(1/Math.sqrt((w*w)+(2*g*Math.sin(i)/l)));
}
}



tim=t;
}
public double cal() {
double dx=0.000001;
return tim*dx;

}

}
