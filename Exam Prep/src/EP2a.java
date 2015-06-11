//Zach Lindner

import java.io.FileReader;
import java.util.Scanner;

public class EP2a {

    public static void main(String[] args) throws Exception {
        int nVar[] = new int[3], i, nNum, nAns = 0;
        Character chOp, chVar;
        Scanner fin = new Scanner(new FileReader("EP2a.txt"));

        nVar[0] = fin.nextInt();
        nVar[1] = fin.nextInt();
        nVar[2] = fin.nextInt();

        chVar = fin.next().charAt(0);
        if (chVar.equals('a')) nAns += nVar[0];
        else if (chVar.equals('b')) nAns += nVar[1];
        else if (chVar.equals('c')) nAns += nVar[2];

        while (fin.hasNext()) {
            chOp = fin.next().charAt(0);
            chVar = fin.next().charAt(0);
            if (Character.isDigit(chVar)) {
                nNum = Integer.parseInt(chVar.toString());
                nAns += nNum;
            } else if (chVar.equals('a')) {
                i = 0;     
                checkVar(nVar, i, nAns, chOp);
            } else if (chVar.equals('b')) {
                i = 1;
                checkVar(nVar, i, nAns, chOp);
            } else if (chVar.equals('c')) {
                i = 2;
                checkVar(nVar, i, nAns, chOp);
            }
        }
        System.out.println("Answer: " + nAns);
    }

    static void checkVar(int[] nVar, int i, int nAns, Character chOp) {
        if (chOp.equals('+')) nAns += nVar[i];
        else if (chOp.equals('-')) nAns -= nVar[i];
        else if (chOp.equals('*')) nAns *= nVar[i];
        else if (chOp.equals('/')) nAns /= nVar[i];
    }
}