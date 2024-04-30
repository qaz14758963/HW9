package hw9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class hw9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line=0 ,sum=0;
		boolean loop=true;
		

		List<Integer> list= new ArrayList<>();
		
		
		 while (loop) {   
			line=input("請輸入數字，結束請輸入-1:");
			if(line==-1) loop=false;
			else {
				list.add(line);
			}
					
		}
	    
		Collections.sort(list);
		for( int a:list) sum+=a;
		
		System.out.println("min:"+list.get(0)+"max:"
				+ ""+list.get(list.size()-1)+"avg:"+sum/list.size());
		
		
		
		
		
	}
    static int input(String prompt) {
	  System.out.print(prompt);
	  Scanner scanner = new Scanner(System.in);
	  int line=scanner.nextInt();
	  return line;
	
}
	
	
}
