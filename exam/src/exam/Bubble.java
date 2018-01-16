package exam;

public class Bubble {

	public static void main(String[] args) {
		int n[] = { 45, 81, 9, 72, 4, 6};
		for (int i = 0;i < n.length - 1;i = i+1 ){
			for(int j = i + 1;j < n.length;j = j+1){
				if(n[j]>n[i]){
					int tmp = n[i];
					n[i] = n[j];
					n[j] = tmp; 
				}
			}
		}
		int a[] = { 6, 5, 2, 8, 1, 9, 13, 4, 11, 7};
		for (int i = 0;i < a.length - 1;i = i+1 ){
			for(int j = i + 1;j < a.length;j = j+1){
				if(a[j]>a[i]){
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp; 
				}
			}
		}
		for(int num : n){
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num : a){
			System.out.print(num + " ");
		}
	}

}
