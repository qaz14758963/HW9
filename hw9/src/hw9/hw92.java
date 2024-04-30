package hw9;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class hw92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		String line;
		boolean loop=true;
		

		Set<String> set= new HashSet<>();
		
		
		
		 while (loop) {   
			line=input("請輸入電話號碼，結束請輸入0:");
			if(line.equals("0")) loop=false;
			else {
				set.add(line);
			}
					
		}
	    System.out.println(set.size());
	    System.out.println(set);
	    
		
		
		
		
		
		
	}
    static String input(String prompt) {
	  System.out.print(prompt);
	  Scanner scanner = new Scanner(System.in);
	  String line=scanner.nextLine();
	  return line;
	
}
	
	
}
