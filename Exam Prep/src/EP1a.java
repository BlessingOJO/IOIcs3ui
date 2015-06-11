//Zach Lindner

import java.io.FileReader;
import java.util.Scanner;

public class EP1a {

    public static void main(String[] args) throws Exception {
        int nNum1, nNum2, nAns;
        Character cOp;
        Scanner fin = new Scanner(new FileReader("EP1a.txt"));

        nNum1 = fin.nextInt();
        nAns = nNum1;
        
        for (int i = 0; i < 4; i++) {
            cOp = fin.next().charAt(0);
            nNum2 = fin.nextInt();

            if (cOp.equals('+')) nAns += nNum2;
            else if (cOp.equals('-')) nAns -= nNum2;
            else if (cOp.equals('*')) nAns *= nNum2;
            else if (cOp.equals('/')) nAns /= nNum2;
        }
        System.out.println("Answer: " + nAns);
        fin.close();
    }
}