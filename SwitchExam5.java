import java.util.Scanner;
	public class SwitchExam5 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				String b="";
				
				switch( a ) {
					case 1 : case 2 : case 3 : case 4 : 
						b = "����Ʈ�����"; break;
					case 5 : case 6 : 
						b = "�����ΰ�"; break;
				}
				System.out.println(a+"���� "+ b +"�Դϴ�.");
	}
}