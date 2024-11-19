package day11;

public class MathlnParam {

	public static void main(String[] args) {
		int even[]= new int[30];
		for(int i=0;i<30; i++) {
		            even[i]=i;
		}             
         //even은 대괄호안의 숫자들중 첫번째 인수의 시작주소를 기억하는 변수다.
		int value=2;
         int sumeven=sum(even,value);
         System.out.println("sumeven ="+sumeven);
	}//main
	public static int sum(int[]arr,int v) {//독립된 공간에서 생성되는 변수야
		int sum =0;
		for(int i=0; i<arr.length;i++) {
			if(i%v==0)
			sum+=arr[i];
	}
	return 0;
	}//sum
		
}//class