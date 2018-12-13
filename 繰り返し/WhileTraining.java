/**
* 配列基礎
* @author nagaoka
*/

/**
*社員の点数を一次元配列に格納し、
*その配列を用いて社員の点数、過去問を解いた社員の人数を出力するクラス
*/
public class ArrayTraining{
	/**
	*mainメソッド
	*社員の点数を一次元配列に格納し、
	*その配列を用いて社員の点数、過去問を解いた社員の人数を出力するメソッド
	*@param コマンドライン引数
	*/
	public static void main(String[] args){

		Integer[] empers = {20,30,45,35};

		//ループ用　何番目の人か判断するための変数
		int loop = 0;

		for(int emp : empers){
			loop++;
			System.out.println(loop + "番目の社員の点数は" + emp + "です");
		}

		//社員の総数をempers.lengthで表記
		System.out.println("過去問を解いた社員の人数は全部で" + loop + "人です。");
	}
}










//↓問題を勘違いしたコード描き途中　一応残しておきます。

// public class Question1{
// 	public static void main(String[] args){

// 		//HashMapクラスのオブジェクトを生成
// 		Map map = new HashMap();

// 		Map<String,Integer> emp =new HashMap<String,String>();
// 		emp.put(社員1 , 20);
// 		emp.put(社員2 , 30);
// 		emp.put(社員3 , 45);
// 		emp.put(社員4 , 35);

// 		for(Map.Entry<String,Integer> e : map.entrySet()){
// 			System.out.println(e.getKey()+":"+e.getValue())
// 		}

// 	}
// }