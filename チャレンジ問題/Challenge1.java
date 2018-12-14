/**
* じゃんけんゲーム
* @author nagaoka
*/

//乱数を使用するためにimport
import java.util.Random;

public class Challenge1{
	/**
	*player1,player2のじゃんけんの結果を出力するメソッド
	*@param agrs コマンドライン引数
	*/
	public static void main(String[] args){

		//Randomクラスの生成
		Random rnd = new Random();
		//player1用の変数に1~3のランダムな値を代入
		int random1 = rnd.nextInt(3) + 1;
		//player2用の変数に1~3のランダムな値を代入
		int random2 = rnd.nextInt(3) + 1;

		//グー用の変数
		String rock = "グー" ;
		//チョキ用の変数
		String scissors = "チョキ" ;
		//パー用の変数
		String paper = "パー" ;

		//player1の手
		String player1hand = "";
		//player2の手
		String player2hand = "";

		//じゃんけんの結果
		String judge = "";

		//random2の数値によって出したじゃんけんの手を設定
		switch (random1){
        	case 1:
        		player1hand = rock;
        		break;
        	case 2:
        		player1hand = scissors;
        		break;
	        case 3:
        		player1hand = paper;
        		break;
		}

		//random1の数値によって出したじゃんけんの手を設定
		switch (random2){
        	case 1:
        		player2hand = rock;
        		break;
        	case 2:
        		player2hand = scissors;
        		break;
	        case 3:
        		player2hand = paper;
        		break;
		}

		//player1を主軸として、player2が何を出したかによって
		//出力を変えるメソッド
		if(player1hand == "グー"){
			switch(player2hand){
				case "グー":
        		judge = "あいこです";
        		break;
        	case "チョキ":
        		judge = "player1の勝ちです。";
        		break;
	        case "パー":
        		judge = "player2の勝ちです。";
        		break;
        	}
		}else if(player1hand == "チョキ"){
			switch(player2hand){
				case "グー":
        		judge = "player2の勝ちです。";
        		break;
        	case "チョキ":
        		judge = "あいこです";
        		break;
	        case "パー":
        		judge = "player1の勝ちです。";
        		break;
        	}
		}else{
			switch(player2hand){
				case "グー":
        		judge = "player1の勝ちです。";
        		break;
        	case "チョキ":
        		judge = "player2の勝ちです。";
        		break;
	        case "パー":
        		judge = "あいこです";
        		break;
			}

		}

		//結果出力

		System.out.println("じゃんけんを開始します");

		System.out.println("player1 :" + player1hand);

		System.out.println("player2 :" + player2hand);

		System.out.println(judge);

	}
}