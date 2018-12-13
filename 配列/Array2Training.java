/**
* 多次元配列基礎
* @author nagaoka
*/


/**
*クラス名　Quesiton2
*二次元配列で４人の点数を格納し、
*それぞれの社員の１回目から３回目までの結果を出力するクラス。
*/

class Array2Training{
	/**
	*mainメソッド
	*二次元配列で４人の点数を格納し、
	*それぞれの社員の１回目から３回目までの結果を出力するメソッド。
	*@param args コマンドライン引数
	*/
	public static void main(String[] args){

		//社員の点数を二次元配列に格納
		int seiseki[][] = {
			{20,50,60},
			{30,60,70},
			{45,60,80},
			{35,40,50}
		};

		//社員の名前を配列に格納
		String[] empers ={"社員1","社員2","社員3","社員4"};

		for(int i =0;i < empers.length; i++){
			for(int j = 0; j < seiseki[i].length; j++){
				System.out.println(empers[i]+"の"+(j+1)+"回目の点数は"+seiseki[i][j]+"点です。");
			}
			//次の社員のループに行くにあたり、xを１に戻す
		}

	}
}