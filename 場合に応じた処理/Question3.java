public class Question3 {
	public static void main(String[] args) {
		String s1 = "SeattleConsulting";
		String s2 = "SeattleConsulting";
		String s3 = "Seattle";
String s4 = new String("SeattleConsulting");
		s3 = s3 + "Consulting";
		if(s1 == s2) {
			System.out.println("s1とs2は等しいです。(==比較)");} 
	if(s1 == s3) {
			System.out.println("s1とs3は等しいです。(==比較)");
		}
	if(s1 == s4) {
			System.out.println("s1とs4は等しいです。(==比較)");
		}
if(s1.equals(s2)) {
			System.out.println("s1とs2は等しいです。(.equals比較)");
		}
		if(s1.equals(s3)) {
			System.out.println("s1とs3は等しいです。(.equals比較)");
	}
	if(s1.equals(s4)) {
			System.out.println("s1とs4は等しいです。(.equals比較)");
		}
	}
}