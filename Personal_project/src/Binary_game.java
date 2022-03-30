
import java.util.Arrays;
import java.util.Scanner;

public class Binary_game {
	int user1, count, object, user1data, cnt, gold, sum;
	int[] soil, level;

	public Binary_game() {
		System.out.println("게임을 시작합니다.");
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
			System.out.println("병력이 생성되었습니다." + "\n" + "1을 눌러 합쳐주세요");
			soil = new int[10];
			level = new int[10];

			int ans = scan.nextInt();
			if (ans == 1) {
				level[0] = 1;
				user1data = user1 + object;
				if (user1data % 2 != 0) {
					System.out.println("합칠 병력이 없습니다.");
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
				System.out.println("잘못된 값을 입력하셨습니다.");
				return;
			}

			for (int i = 0; i <= count; i++) {
				level[i + 1] = level[i] + 1;
				System.out.println(level[i] + "레벨의 병력은" + soil[i] + "명 있습니다.");
			}
			System.out.println(Arrays.toString(soil));
			System.out.println("현재 보유 골드는" + gold + "골드입니다.");
//			System.out.println(cnt + "번 합했습니다.");
			count = 0;
		}

	}

	public static void main(String[] args) {
		new Binary_game();

	}

}
