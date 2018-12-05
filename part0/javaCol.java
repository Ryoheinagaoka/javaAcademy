// 整数を２つ入力し、それぞれの数字を加算・減算・乗算・徐算・徐算の余りを出力するプログラム
// @author nagaoka

// 文字入力に必要なパッケージをインポートする
import java.io.*;

//クラス名 javaName
//名前を表示するクラス

public class javaCol{
	// mainメソッド
	// 名前を入力して表示するメソッド
	// ＠param args コマンドライン
public static void main(String[] args) throws Exception {
// throws Exceptionは入力する時に数字以外を入れたらエラーを返すという意味です。 
	
	// 文字入力の準備を行う
InputStreamReader input = new InputStreamReader(System.in); 
BufferedReader br = new BufferedReader(input);

// ↑のこの２行で文字入力の準備は整いました！

System.out.println("１つ目の数字を入力してください");

//入力を待つ
String number1 = br.readLine();

System.out.println("２つ目の数字を入力してください");

//入力を待つ
String number2 = br.readLine();

// 文字列をint型に変換する 
// String型なのでこのままだと計算できないため、int型へ変換する 
// 変数宣言と文字入力を同時に行う場合はこのように書くことも出来ます！ 

int a = Integer.parseInt(number1);
int b = Integer.parseInt(number2);

int tasu = a + b;
int hiku = a - b;
int kakeru = a * b;
int waru = a / b;
int amari = a % b;

System.out.println("加算の結果は"+tasu+"です");
System.out.println("減算の結果は"+hiku+"です");
System.out.println("乗算の結果は"+kakeru+"です");
System.out.println("徐算の結果は"+waru+"です");
System.out.println("徐算の余りは"+amari+"です");



}
}