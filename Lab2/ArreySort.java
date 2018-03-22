public class ArreySort {

	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		for(int i=0;i<length-1;i++){
			for(int j=i+1;j<length;j++){
				if(array[i]>array[j]){
					int tmp=array[i];
					array[i]=array[j];
					array[j]=tmp;
					}
				}
			}
            
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}        
		