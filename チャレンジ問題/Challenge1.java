/**
* じゃんけんゲーム
* @author nagaoka
*/

//乱数を使用するためにimport
import java.util.Random;

public class Challenge1{
	/**
	*1~3のランダムな数値を作成するメソッド
	*@return
	*/
	public static int makeRandom(){
		//Randomクラスの生成
		Random rnd = new Random();
		//playerhand用の変数に1~3のランダムな値を代入
		int random = rnd.nextInt(3) + 1;
		return random;
	}

	/**
	*playerhandの変数の中に入っている数字を元にジャンケンの手を出力するメソッド
	*@param hand playerhand変数を入れる
	*/
	public static void changeHand(int hand){
		switch(hand){
			case 1:
				System.out.println("グー");
				break;
			case 2:
				System.out.println("チョキ");
				break;
			case 3:
				System.out.println("パー");
				break;
		}
	}

	/**
	*player1,player2のじゃんけんの結果を出力するメソッドå
	*@param agrs コマンドライン引数
	*/
	public static void main(String[] args){

		//player1の手
		int player1hand = makeRandom();
		//player2の手
		int player2hand = makeRandom();

		//じゃんけんの結果
		String judge = "";

		//player1を主軸として、player2が何を出したかによって
		if(player1hand == 1){
			switch(player2hand){
			case 1:
        		judge = "あいこです";
        		break;
        	case 2:
        		judge = "player1の勝ちです。";
        		break;
	        case 3:
        		judge = "player2の勝ちです。";
        		break;
        	}
		}else if(player1hand == 2){
			switch(player2hand){
			case 1:
        		judge = "player2の勝ちです。";
        		break;
        	case 2:
        		judge = "あいこです";
        		break;
	        case 3:
        		judge = "player1の勝ちです。";
        		break;
        	}
		}else{
			switch(player2hand){
				case 1:
        		judge = "player1の勝ちです。";
        		break;
        	case 2:
        		judge = "player2の勝ちです。";
        		break;
	        case 3:
        		judge = "あいこです";
        		break;
			}
		}

		//結果出力

		System.out.println("じゃんけんを開始します");

		System.out.print("player1 :");
		changehand(player1hand);

		System.out.print("player2 :");
		changehand(player2hand);

		System.out.println(judge);

	}
}