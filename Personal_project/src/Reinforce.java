import java.util.Random;
import java.util.Scanner;

public class Reinforce {

	public Reinforce() {
		Random rand = new Random();
		int level = 1;
		int count = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("���� ��ȭ������ " + level + "�Դϴ� ��ȭ�� �õ��Ͻðڽ��ϱ�?(y/n)");
		int[] reinforce = new int[10];
		int[] user = new int[10];
		for (int i = 0; i < 10; i++) { //�� �õ����� ���Ӱ� �迭
			int n = rand.nextInt(2);
			reinforce[i] = n;
		}
		char ans = scan.next().charAt(0);
		while (ans == 'y') {
			for (int i = 0; i < 10; i++) {
				int n = rand.nextInt(2);
				user[i] = n;
			}
			for (int i = 0; i < 10; i++) {
				if (reinforce[i] == user[i]) {
					count++;
				}
			}
			if (count < level) {
				if (level > 3) {
					System.out.println("�ļյǾ����ϴ� ������ �Ͻðڽ��ϱ�?(y/n)");
					char ans2 = scan.next().charAt(0);
					if (ans2 == 'y') {
						Random rand2 = new Random();
						int broken = rand2.nextInt(100);					
						if (broken % level == 0) {						
							System.out.println("��������");
							level = 1;
							main(null);
							return;
						} else {
							System.out.println("�ı��Ǿ����ϴ�");
							level=0;
							break;
						}
					}
					level--;  //level�� 3�̻󿡼� ���� �õ��� ���������� -2�ǰ���
				}
				level--; // level�� 3���� ������ 1 ������
				break;
			} else {
				System.out.println("��ȭ ����");
				level++;
				System.out.println("����� ��ȭ������ " + level + "�Դϴ�.");
				count = 0;
			}
			if (level > 3) {
				System.out.println("�������� �����ϸ� �ļյ˴ϴ�");
			}
			System.out.print("��ȭ�� ����Ͻðڽ��ϱ�?");
			ans = scan.next().charAt(0);
			for(int i=0; i<10; i++) {
				System.out.println("");
			}
			
		} 
		System.out.println("���� ��ȭ������ " + level + "�Դϴ�");
		System.out.println("");
		System.out.println("");

	}



	public static void main(String[] args) {
		
		new Reinforce();

	}

}
