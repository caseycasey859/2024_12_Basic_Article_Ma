import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		
		System.out.printf("명령어)");
		
		Scanner sc = new Scanner(System.in);
		
		// 추가커밋 테스트
		while(true) {
			String cmd = sc.nextLine();
		
			System.out.println("입력된 명령어: " + cmd);
		
			if (cmd.equals("exit")) {
			break;
			} 
		}
	
		sc.close();
	
		System.out.println("== 프로그램 끝 ==");
	}
}
