import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.io.File;

public class InputOutputTraining{
    /**
    *mainメソッド
    *Test.csvファイルを読み取り
    *四則演算後、Test1.csvに書き込むメソッド
    *@param args コマンドライン引数
    */
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(new File("./file/input/Test.csv"));
                scanner.useDelimiter(",");     //・・・①
                System.out.println("ファイルを読み込みました。");

                //取り出した値を代入する用のlist
                List<Integer> list = new ArrayList<Integer>();

                //読み込んだ値を格納する
                int result = 0;
                //取り出した値を配列に代入
                while(scanner.hasNext()){
                    result = scanner.nextInt();
                    list.add(result);
                }

                //加算の答えを入れる変数
                int sum = list.get(0);
                //減算の答えを入れる変数
                int diff = list.get(0);
                //乗算の答えを入れる変数
                int pro = list.get(0);
                //除算の答えを入れる変数
                int quo = list.get(0);


                /**
                *全ての値を四則演算するメソッド
                */
                for(int i = 1; i < list.size();i++){

                    sum += list.get(i);
                    diff -= list.get(i);
                    pro *= list.get(i);
                    quo /= list.get(i);

                }
            File file = new File("./file/output/TestOutput.txt");

                PrintWriter pw = new PrintWriter
                (new BufferedWriter(new FileWriter("./file/output/TestOutput.txt")));

                pw.println(sum);
                pw.println(diff);
                pw.println(pro);
                pw.println(quo);

                System.out.println("ファイルに書き込みました。");

                pw.close();
        }catch(IOException e){
            System.out.println("ファイルがありません！");
        }
    }
}