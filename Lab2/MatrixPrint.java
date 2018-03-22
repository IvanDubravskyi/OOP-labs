public class MatrixPrint {

	public static void main(String[] args) {
		
		int n = 5, m = 5;
		int Arr[][] = new int [n][m];
		int a = 1;
		
		for (int i=0; i<Arr.length; i++) {
			for (int j=0; j<Arr.length; j++) {
				Arr[i][j]=a++;
				if(i==j | i==m-j-1) {
					System.out.print(" * ");
				}
				else 
				{	
					if(Arr[i][j]<10)
						System.out.print(" "+ Arr[i][j] + " ");
					else
						System.out.print(Arr[i][j] + " ");
						
				}
			}
			System.out.println();
		}
	}
}
