/**
* カプセル化基礎
* @author nagaoka
*/

/**
*クラス名 Question4
*/
public class Question4{
	public static void main(String[] args){

		
		CapsulationPractice cap = new CapsulationPractice();




		System.out.println();

	}
}
/**
*クラス名　CapsulationPractice
*/
class CapsulationPractice{

	private int parivateData = 100;

	public int getPrivateData(){
		return this.parivateData;
	}

	public int setPrivateDate(int i){
		this.privateDate = i;
	}
}