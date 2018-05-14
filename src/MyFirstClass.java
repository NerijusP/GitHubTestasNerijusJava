import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstClass {
    //Statitins nestatini isveda per klases objekta
    //paleidzia metodia
    public static void main(String[] args){

        //Elementarus objekto sukurimas
        MyFirstClass myFirstClass = new MyFirstClass();

        float fl=5.6f;

        myFirstClass.notStaticMethod("Jonas");
        System.out.println( sayHi());

        //per objekto varda iskvieciam nestatinius metodus
        myFirstClass.checkThisNumber(3);


        System.out.println( "Please Insert a Number!!!");
        Scanner scanner = new Scanner(System.in);

        try{
            int num = scanner.nextInt();
            System.out.println( "Your number is "+ num);
        }catch (InputMismatchException e){
            System.out.println( "Ivedete ne skaiciu");
        }




    }


    private void notStaticMethod(String name){
        //trumpinys sout
        System.out.println(name);

        System.out.println(sayHi() );

    }

    private static String sayHi(){


        return "Hi Andrius";
    }

    private void checkThisNumber(int num){
        if (    num>10){
            System.out.printf("Daugiau");
        }
        else if (   num>15){
            System.out.println( "Daugiau Uz 15");

        }
        else{
            System.out.println( "Maziau");
        }
    }



}
