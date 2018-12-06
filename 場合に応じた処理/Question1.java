/**
* if文基礎
* @author nagaoka
*/

//文字入力に必要なパッケージをインポートする
import java.util.Scanner;

/**
*クラス名　nomal1
*キーボードから整数値(1~10)を入力し、
*場合に応じてメッセージを出力するクラス
*1~10の整数値以外が入力された場合は例外あり
*/

public class Question1{
/**
*値を入力してメッセージを出力するメソッド
*/

	public static void main(String[] args){

		
		System.out.println("1~10の整数を入力してください");

	    try{

	    	Scanner scan = new Scanner(System.in);

			int num = scan.nextInt();

			if(num <= 1 || 10 < num){
				obj();
			}

		if(1 <= num && num < 5){
			System.out.println("５未満の整数"+num+"が入力されました");
		}else if(num == 5){
			System.out.println("5が入力されました");
		}else if(6 <= num && num < 11){
			System.out.println("6以上の整数"+num+"が入力されました");
		}

	 	}catch(Exception e){
			System.err.println("1~10の整数を入力してください!!!!!!");
		}

	}

static void obj() throws Exception{

	    	throw new Exception();

}
}

