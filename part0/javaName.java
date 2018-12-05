// 入力された自分の名前を表示するプログラム
// @author nagaoka

// 文字入力に必要なパッケージをインポートする
import java.io.*;

//クラス名 javaName
//名前を表示するクラス

public class javaName{
	// mainメソッド
	// 名前を入力して表示するメソッド
	// ＠param args コマンドライン
public static void main(String[] args) throws Exception {
// throws Exceptionは入力する時に文字列以外を入れたらエラーを返すという意味です。 
	
	// 文字入力の準備を行う
InputStreamReader input = new InputStreamReader(System.in); 
BufferedReader br = new BufferedReader(input);

// ↑のこの２行で文字入力の準備は整いました！

System.out.println("名前を入力してください");

//入力を待つ
String str = br.readLine();

System.out.println("私の名前は"+ str +"です");

}
}