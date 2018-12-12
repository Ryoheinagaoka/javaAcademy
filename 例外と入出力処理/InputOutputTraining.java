import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2{
    public static void main(String[] args){
        try{

        Scanner scanner = new Scanner(new File("./file/input/Test.csv"));
            scanner.useDelimiter(",");     //・・・①
            System.out.println("ファイルを読み込みました。");

            List<Integer> list = new ArrayList<>();

            //取り出した値を入れる変数
            int b =0;
            //加算の答えを入れる変数
            int x =0;
            //減算の答えを入れる変数
            int y =0;
            //乗算の答えを入れる変数
            int z =1;
            //除算の答えを入れる変数
            int a =0;


            /**
            *全ての値を四則演算するメソッド
            */
            while(scanner.hasNext()) {

               b = scanner.nextInt();

               x += b;
               y -= b;
               z *= b;
               if(a==0){
                a = b;
               }else{
               a /= b;
               }

            }

            System.out.println("ファイルの中身を出力しました。");

            PrintWriter pw = new PrintWriter
            (new BufferedWriter(new FileWriter("./file/output/Test1.csv")));

            pw.println(x);
            pw.println(y);
            pw.println(z);
            pw.println(a);

            System.out.println("ファイルに書き込みました。");

            pw.close();
        }
        catch(IOException e){
            System.out.println("入出力エラーです。");
        }
    }
}