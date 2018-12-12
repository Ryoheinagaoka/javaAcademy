/**
* if文基礎
* @author nagaoka
*/

//文字入力に必要なパッケージをインポートする
import java.util.Scanner;

/**
*クラス名　Question1
*キーボードから整数値(1~10)を入力し、
*場合に応じてメッセージを出力するクラス
*1~10の整数値以外が入力された場合は例外ハンドリングする
*/

public class IfTraining{
/**
*値を入力してメッセージを出力するメソッド
*/
	public static void main(String[] args){

		System.out.println("1~10の整数を入力してください");

		//例外ハンドリングをする為に、tryとcatchを設置
	    try{

	    	//文字入力を受け付ける為のパッケージ
	    	Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			//numが１未満,11以上の場合エラーを投げる
			if (num < 1 || 10 < num){
				obj();
			}
		//入力された1~10の値に応じて処理をする
		if (1 <= num && num < 5){
			System.out.println("５未満の整数"+num+"が入力されました");
		}else if (num == 5){
			System.out.println("5が入力されました");
		}else if (6 <= num && num < 11){
			System.out.println("6以上の整数"+num+"が入力されました");
		}
		//エラーが発生した際は下記のメッセージを返す
	 	}catch (Exception e){
			System.err.println("1~10の整数を入力してください!!!!!!");
		}

	}

/**
*エラーを投げる為のメソッド
*/
static void obj() throws Exception{
	    	throw new Exception();
}
}