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
class Question3{
	public static void main(String[] args){

		//ArrayListを定義
		List<String> member = new ArrayList<String>();

		// 要素を追加
		member.add("長岡");
		member.add("安田");
		member.add("久保田");
		member.add("須藤");
		member.add("町田");
		member.add("山本");

		System.out.println("10月入社のメンバーを紹介します。");

		for(String mem : member){
			System.out.println(mem);
		}

		System.out.println("以上"+member.size()+"名。よろしくお願い致します。");

	}
}