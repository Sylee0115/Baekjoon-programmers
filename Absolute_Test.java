import java.util.Scanner;
	public class Absolute_Test {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("���� �Է� : ");
			int a = sc.nextInt();
			int answer = 0;
			
			
			if(a>=0){
				answer = a;
			}else {
				answer = a*(-1);
			}
			System.out.println(a+"�� ���밪�� "+answer+"�Դϴ�.");
		}
	}