import java.io.*;

public class Question1{

public static void main(String[] args){

String s = args[0];

int num = Integer.parseInt(s);

int sum = 0;

for(int i = 1; i <= num ; i++){
sum += i;
}
System.out.println("1から"+num+"の和は、"+sum);
}
}