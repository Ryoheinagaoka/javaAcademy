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

                //取り出した値を入れる変数
                int result =0;
                //加算の答えを入れる変数
                int sum =0;
                //減算の答えを入れる変数
                int diff =0;
                //乗算の答えを入れる変数
                int pro =1;
                //除算の答えを入れる変数
                int quo =0;


                /**
                *全ての値を四則演算するメソッド
                */
                while(scanner.hasNext()){
                    result = scanner.nextInt();

                    sum += result;
                    if(diff==0){
                        diff = result;
                    }else{
                        diff -= result;
                    }
                    pro *= result;

                    if(quo==0){
                        quo = result;
                    }else{
                        quo /= result;
                    }
                }

            File file = new File("./file/output/TestOutput.txt");

            // ファイルの存在を確認する
            if (file.exists()){
                PrintWriter pw = new PrintWriter
                (new BufferedWriter(new FileWriter("./file/output/TestOutput.txt")));

                pw.println(sum);
                pw.println(diff);
                pw.println(pro);
                pw.println(quo);

                System.out.println("ファイルに書き込みました。");

                pw.close();
            }else{
                throw new IOException();
            }
        }catch(IOException e){
            System.out.println("ファイルがありません！");
        }
    }
}