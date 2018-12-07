import java.util.Scanner;

public class Question2{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("1〜100の整数を入力してください。");

int num = scan.nextInt();

while(!(num%7==0)){

System.out.println("1〜100の整数を入力してください。");

num = scan.nextInt();

}
System.out.println("処理を終了しました");

}
}