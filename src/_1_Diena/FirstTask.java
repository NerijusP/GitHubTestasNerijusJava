package _1_Diena;

import java.util.Scanner;

public class FirstTask {

    static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.println("Iveskite zodi");
            word = scanner.nextLine();

            if (word.length()%2==0) {
                System.out.println("Ivestas "+word+" Yra lyginis, rasta raidziu "+countLetters(word,'a'));
            }
            else {
                System.out.println( "Ivestas " +word+" Yra nelyginis, ivesta raidziu "+countLetters(word,'a'));
            }




        }while ( !word.equals("Pabaiga") );

        }


        private static int countLetters(String word,char raide){
        int count =0;
        for (int i=0;i<word.length();i++){
                if (word.charAt(i) == raide) {
                    count++;
                }
            }
            return count;
    }




}
