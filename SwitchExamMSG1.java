import java.util.Scanner;
	public class SwitchExamMSG1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

				System.out.print("���� �Է� (���� ������ ���̴� ������ �� ��) : ");		
				int a = sc.nextInt();
				String op = sc.next();
				int b = sc.nextInt();
				String answer = " ";

				switch(op) {

					case "+" :
						answer = Integer.toString(a + b); break;
					case "-" :
						answer = Integer.toString(a - b); break;
					case "*" :
						answer = Integer.toString(a * b); break;
					case "/" :
						answer = Integer.toString(a / b); break;
					default :
						answer = "��Ģ�����ڰ� �ƴմϴ�.";
				}
				System.out.println(a + " " + op +" "+ b + " " + "=" + " " + answer);
		}
	}