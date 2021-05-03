package Arrays;
public class Arrays2 {
		

	public static void main(String[] args) {
		
	int n = Sc.nextInt();
	int count = 1;
	
	for(int i = 2;i <= n;i++) {
		if(i % n == 0) {
			count++;
		}
	}
	if(count == 2) {
		System.out.println(n+"is a prime num");
	}else {
		System.out.println(n+"num is not a prime num");
	}
		}
	}

//}
