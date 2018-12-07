public class Question1{
	public static void main(String[] args){

		methods met = new methods();

		met.sameName();
		met.sameName(1);
		met.sameName(1,1);
		met.sameName("a");
		met.sameName("a","b");

	}
}

class methods{
	
	public void sameName(){
		System.out.println("引数を持たないsameNameメソッドです");
	}

	public void sameName(int i){
		System.out.println(i);
	}

	public void sameName(int i,int j){
		System.out.println(i+j);
	}

	public void sameName(String k){
		System.out.println(k);
	}

	public void sameName(String k,String l){
		System.out.println(k+l);
	}

}