import java.util.Scanner;

	public class Salary_Switch {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("�� ������ �Է��ϼ��� : ");
			double currentSalary = sc.nextDouble();   		// ������
			
			sc.nextLine();

			System.out.print("�ٹ��򰡵���� �Է��ϼ��� : ");
			String rating = sc.nextLine();					// ���
				
			double raise = 0.0;						// ���� �λ��

			double newSalary;						// �� ����

				
			switch( rating ) {
				case "���" : 
					raise =  ( currentSalary * 0.06 ); 
					break;
				case "����" : 
					raise = ( currentSalary * 0.04 ); 
					break;
				case "�ҷ�" : 
					raise = ( currentSalary * 0.02 ); 
					break;
				default :
					System.out.println("��ȿ���� ���� ����Դϴ�.");
					return;
					
			}
			newSalary = currentSalary + raise; 
			System.out.println("�����λ�� : " + (int)raise);
			System.out.println("�� �����λ�� : " + (int)newSalary);
	}
}