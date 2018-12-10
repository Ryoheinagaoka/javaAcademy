/**
* for文基礎
* @author nagaoka
*/

//文字列をint型に変換する為のパッケージをimport
import java.io.*;


/**
*クラス名　Question1
*1~実行時引数で渡された値の和を計算するクラス
*/
public class Question1{

public static void main(String[] args){

//sに実行時引数を代入
String s = args[0];
//intに変換したsをnumに代入
int num = Integer.parseInt(s);
//和を表示する為に使うsumを初期化
int sum = 0;

for(int i = 1; i <= num ; i++){
sum += i;
}
System.out.println("1から"+num+"の和は、"+sum);
}
}