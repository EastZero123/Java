
import java.util.Arrays;
import java.util.Scanner;

public class Binary_game {
	int user1, count, object, user1data, cnt, gold, sum;
	int[] soil, level;

	public Binary_game() {
		System.out.println("������ �����մϴ�.");
		user1 = 0;
		object = 0;
		count = 0;
		cnt = 0;
		gold = 0;
		sum = 0;

		user1data = 0;

		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			object++;
			System.out.println("������ �����Ǿ����ϴ�." + "\n" + "1�� ���� �����ּ���");
			soil = new int[10];
			level = new int[10];

			int ans = scan.nextInt();
			if (ans == 1) {
				level[0] = 1;
				user1data = user1 + object;
				if (user1data % 2 != 0) {
					System.out.println("��ĥ ������ �����ϴ�.");
				}
				do {
					if (user1data % 2 != 0) {
						soil[count]++;
					}
					if (user1data / 2 != 0) {
						count++;
					}

					for (int i = 0; i <= count; i++) {
						level[i + 1] = level[i] + 1;
						sum += (level[i] * soil[i]);
					}
					for (int i = 0; i <= count; i++) {
						level[i] = 0;
						level[i] = 0;
					}
					level[0] = 1;
					gold += sum;
					sum = 0;
					user1data /= 2;
				} while (user1data != 0);
				user1 += object;
				object = 0;
				cnt++;

			} else {
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
				return;
			}

			for (int i = 0; i <= count; i++) {
				level[i + 1] = level[i] + 1;
				System.out.println(level[i] + "������ ������" + soil[i] + "�� �ֽ��ϴ�.");
			}
			System.out.println(Arrays.toString(soil));
			System.out.println("���� ���� ����" + gold + "����Դϴ�.");
//			System.out.println(cnt + "�� ���߽��ϴ�.");
			count = 0;
		}

	}

	public static void main(String[] args) {
		new Binary_game();

	}

}
