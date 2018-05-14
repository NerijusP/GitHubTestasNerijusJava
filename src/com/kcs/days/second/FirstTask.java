package com.kcs.days.second;

import java.util.Scanner;


public class FirstTask {

    private static final String polindrome1 = "KOL EINU ŠUNIE LOK";
    private static final String polindrome2 = "ARGI TEN NE TIGRA";
    private static final String polindrome3 = "SĖDĖK UŽU KĖDĖS";

    public static void main(String[] args){

        String[] masyvas ={polindrome1,polindrome2,polindrome3};

      //  Scanner scanner = new Scanner(System.in);
      //  String word;
       // System.out.println("Iveskite zodi");
       // word =scanner.nextLine();

        for ( String p :masyvas){
            boolean isPolindrome = IsPolindrome(p.replaceAll(" ",""));

            if (isPolindrome){
                System.out.println( "Yra Polindromas");
            }
            else{
                System.out.println( "Nera Polindromas");
            }
        }




    }

private static boolean IsPolindrome(String zodis){
        boolean polindrome =true;
    for (int i=0; i<zodis.length();i++){
    char a = zodis.charAt(i);
    char b = zodis.charAt(zodis.length()-1-i);
            if (a!=b){
                polindrome=false;
                break;
                    }

            }
            return polindrome;

    }

}
