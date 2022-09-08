package Project_Euler;

public class Pr_0005 {
//1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까??
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 1;
		int check = 0;
		while(true) {
			for(int i = 2; i < 21; i++) {
				if(num % i != 0) {
					check = 1;
					break;
				}
			}		
			if(check == 0) {
				System.out.println(num);
				break;
			}
			num++;	
			check = 0;
		}
	}
}