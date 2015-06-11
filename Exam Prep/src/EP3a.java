//Zach Lindner

import java.util.Scanner;

public class EP3a {

    public static void main(String[] args) {
        int nNum;
        boolean bPrime;
        Scanner sin = new Scanner(System.in);

        while (true) {
            System.out.println("Gimme a Number: ");
            nNum = sin.nextInt();
            if (nNum != 0) {
                bPrime = isPrime(nNum);
                System.out.println("Prime Number: " + bPrime);
            } else {
                break;
            }
        }
    }

    static boolean isPrime(int nNum) {
        for (int i = 2; i <= nNum / 2; i++) {
            if (nNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}