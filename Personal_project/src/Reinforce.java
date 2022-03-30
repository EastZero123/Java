import java.util.Random;
import java.util.Scanner;

public class Reinforce {

	public Reinforce() {
		Random rand = new Random();
		int level = 1;
		int count = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("현재 강화정도는 " + level + "입니다 강화를 시도하시겠습니까?(y/n)");
		int[] reinforce = new int[10];
		int[] user = new int[10];
		for (int i = 0; i < 10; i++) { //매 시도마다 새롭게 배열
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
					System.out.println("파손되었습니다 복구를 하시겠습니까?(y/n)");
					char ans2 = scan.next().charAt(0);
					if (ans2 == 'y') {
						Random rand2 = new Random();
						int broken = rand2.nextInt(100);					
						if (broken % level == 0) {						
							System.out.println("복구성공");
							level = 1;
							main(null);
							return;
						} else {
							System.out.println("파괴되었습니다");
							level=0;
							break;
						}
					}
					level--;  //level이 3이상에서 복구 시도를 하지않으면 -2되게함
				}
				level--; // level이 3보다 작으면 1 감소함
				break;
			} else {
				System.out.println("강화 성공");
				level++;
				System.out.println("당신의 강화정도는 " + level + "입니다.");
				count = 0;
			}
			if (level > 3) {
				System.out.println("이제부터 실패하면 파손됩니다");
			}
			System.out.print("강화를 계속하시겠습니까?");
			ans = scan.next().charAt(0);
			for(int i=0; i<10; i++) {
				System.out.println("");
			}
			
		} 
		System.out.println("현재 강화정도는 " + level + "입니다");
		System.out.println("");
		System.out.println("");

	}



	public static void main(String[] args) {
		
		new Reinforce();

	}

}
