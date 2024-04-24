package Evaluation1;

import java.util.Scanner;

public class PatternABCD {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the character");
        char ch=scanner.next().charAt(0);
        printPattern(Character.toUpperCase(ch));
    }
    static void printPattern(char ch){
        int n=(ch-'A')*2+1;
        int space1=(ch-'A')-1,space2=0;
        char c='A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space1; j++) {
                System.out.print(" ");
            }
            System.out.print(c);
            for (int j = 0; j < space2; j++) {
                System.out.print(" ");
            }
            if(i!=0 && i!=n-1){
                System.out.print(c);
            }
            if(i<ch-'A'){
                space1--;
                space2+=2;
                c++;
            }else{
                space1++;
                space2-=2;
                c--;

            }
            System.out.println();
        }
    }
}
