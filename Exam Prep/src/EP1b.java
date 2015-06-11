//Zach Lindner

import java.io.FileReader;
import java.util.Scanner;

public class EP1b {

    public static void main(String[] args) throws Exception {
        int nNum1, nNum2, nAns, nLength;
        String sOp, sSplit[];
        Scanner fin = new Scanner(new FileReader("EP1b.txt"));

        nNum1 = fin.nextInt();
        nAns = nNum1;
        while(fin.hasNext()) {
            sOp = fin.next();
            nNum2 = fin.nextInt();

            if (sOp.equals("+")) nAns += nNum2;
            else if (sOp.equals("-")) nAns -= nNum2;
            else if (sOp.equals("*")) nAns *= nNum2;
            else if (sOp.equals("/")) nAns /= nNum2;
        }
        System.out.println("Answer: " + nAns);
        fin.close();
    }
}