/**
* チーム１８紹介
* @author nagaoka
* ※今回は10月入社研修メンバー名を使用します。
*/

//Arraylist、Listを使用する為にパッケージをimport
import java.util.ArrayList;
import java.util.List;

/**
*クラス名　Quesiton2
*ArrayListにチーム10月入社研修メンバーの名前を追加し、
*入力した全員の名前、人数を出力するクラス
*/
class Team18info{
	/*
	*ArrayListにチーム10月入社研修メンバーの名前を追加し、
	*入力した全員の名前、人数を出力するクラス
	*/
	public static void main(String[] args){

		//配列にメンバー名を格納
		String[] names = {"長岡","安田","久保田","須藤","町田","山本"};

		//ArrayListを定義
		List<String> members= new ArrayList<String>();

		//memberにメンバー名を格納
		for(String name : names){
			members.add(name);
		}

		System.out.println("10月入社のメンバーを紹介します。");

		for(String member : members){
			System.out.println(mem);
		}

		System.out.println("以上" + member.size() + "名。よろしくお願い致します。");

	}
}