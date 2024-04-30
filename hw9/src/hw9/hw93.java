package hw9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hw93 {

public static void main(String[] args) {

// TODO Auto-generated method stub
String Sline; 
int Iline=0;
boolean loop =true;
// 創建一個HashMap來存儲學生名字和對應的成績

Map<String, Integer> grades = new HashMap<>();
while(loop) {
	 

	int num=Iinput("請選擇功能:1.新增學生成績 2.查詢學生成績 3.修改學生成績 4.刪除學生成績 "
			+ "5.列出所有學生成績 99.結束:");
	if(num==99) loop=false;
	else {
	switch (num){
	case 1:
		Sline=Sinput("請輸入學生姓名:");
		Iline=Iinput("請輸入學生分數:");
		grades.put(Sline,Iline);
	    break;
	case 2:
		// 查找特定學生的成績
		String studentName = Sinput("請輸入學生姓名:");
		if (grades.containsKey(studentName)) {

			System.out.println(studentName + "的成績是: " + grades.get(studentName));

			} else {

			System.out.println("沒有找到" + studentName + "的成績。");

			}
		    break;
	case 3:
		
		// 更新學生的成績
		String e= Sinput("請輸入學生姓名:");
        int u =Iinput("請輸入學生分數");
		
		grades.put(e,u);

		System.out.println("更新後，"+e+"的成績是: " + grades.get(e));
		break;
	case 4:
		// 移除一位學生的記錄
		String t= Sinput("請輸入學生姓名:");
		grades.remove(t);

		System.out.println(t+"已刪除");
		break;
	case 5:
		// 打印所有學生的成績

		System.out.println("學生成績列表:");

		for (Map.Entry<String, Integer> entry : grades.entrySet()) {

		System.out.println(entry.getKey() + ": " + entry.getValue());

		}
		break;
		

		


		
	
	  }
	 }
    }
  }

 


static int Iinput(String prompt) {
	  System.out.print(prompt);
	  Scanner scanner = new Scanner(System.in);
	  int line=scanner.nextInt();
	  return line;
	
	
}

static String Sinput(String prompt) {
	  System.out.print(prompt);
	  Scanner scanner = new Scanner(System.in);
	  String line=scanner.nextLine();
	  return line;

}
}