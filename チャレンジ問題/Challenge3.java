/**
* 多次元配列 チャレンジ問題
* @author nagaoka
*/

//Arraylist、Listを使用する為にパッケージをimport
import java.util.ArrayList;
import java.util.List;

/**
*クラス名　Quesiton2
*二次元配列で４人の点数を格納し、
*それぞれの社員の１回目から３回目までの結果を出力するクラス。
*/

class Challenge3{
	/**
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

		//合計点を入れる用の変数
		int sum = 0;

		//ArrayListを定義
		List<Integer> averages = new ArrayList<Integer>();

		//社員の名前を配列に格納
		String[] empers ={"社員1","社員2","社員3","社員4"};

		for(int i =0;i < empers.length; i++){
			for(int j = 0; j < seiseki[i].length; j++){
				System.out.println(empers[i] + "の" + (j + 1) + "回目の点数は" + seiseki[i][j] + "点です。");
				sum += seiseki[i][j];
			}
			sum /= seiseki[i].length;
			// 平均点を追加
			averages.add(sum);

			sum = 0;
		}

		for(int i = 0; i < averages.size(); i++){
			System.out.println(empers[i] + "の平均点は" + averages.get(i) + "点です");
		}

		// 平均点が60点以下か調べる
		for(int i = 0; i < averages.size(); i++){
			if(averages.get(i) < 60){
				System.out.println(empers[i]+ "さんはもう少し勉強しましょう");
			}
		}

	}
}