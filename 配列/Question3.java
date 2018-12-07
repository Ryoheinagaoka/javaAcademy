//今回は10月入社研修メンバー名を使用します。

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Question3{
	public static void main(String[] args){
	
		List<String> member = new ArrayList<String>();

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