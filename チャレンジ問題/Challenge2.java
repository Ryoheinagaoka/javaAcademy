/**
* ピラミッド作成ゲーム
* @author nagaoka
*/


public class Challenge2{
	/**
	*ピラミッド型の文字列を出力する
	*/
	public static void main(String[] args){

		//ピラミッドを列毎に設定
		String row1 = "      ■      ";
		String row2 = "    ■   ■    ";
		String row3 = "  ■ ■ ■ ■ ■  ";
		String row4 = "■ ■ ■ ■ ■ ■ ■";
		//列毎に入れた変数を上から順に配列に格納
		String[] pyramids ={row1,row2,row3,row4};

		for(String pyramid:pyramids){
			System.out.println(pyramid);
		}
	}
}