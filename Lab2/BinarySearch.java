public class BinarySearch {

	
public static void main(String[] args) {

	int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;
        int i = 0;
        int j = data.length-1;
        int m = j/2;
        int value;
       
        while((value=data[m])!=numberToFind & i < j){
            if(numberToFind > data[m]){
                i = m+1;
                m =((i+j)/2);
                }
            else {
                j = m-1;
                m =((i+j)/2);
                }
        }
        if (data[m]==numberToFind){
        	System.out.println(m);
        }
        else {
        	System.out.println(-1);
        }
    }
}
        