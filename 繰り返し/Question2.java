/**
* while文基礎
* @author nagaoka
*/

//数値を入力する為のパッケージをimport
import java.util.Scanner;

/**
*クラス名 Question2
*整数値1〜100を入力し、while文を使って、7の倍数が入力されると
*処理が終了するクラス
*/
public class Question2{

public static void main(String[] args){

//整数値を入力する為のパッケージ
Scanner scan = new Scanner(System.in);

System.out.println("1〜100の整数を入力してください。");

int num = scan.nextInt();

//7の倍数がでない時にループ処理をする
while(!(num%7==0)){

System.out.println("1〜100の整数を入力してください。");

num = scan.nextInt();

}
System.out.println("処理を終了しました");

}
}