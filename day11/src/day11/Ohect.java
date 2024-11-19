package day11;

public class Ohect {

	public static void main(String[] args) {
	   Job samsung=new Job();
	   System.out.println(samsung.pay+":"+samsung.distance);
	   
	   Job lg=new Job();
	   System.out.println(lg.pay+":"+lg.distance);
	   

	}

}

class Job{
	int pay;
	int distance;
	public Job() {  //멤버변수를 초기화
		pay =300;
		distance=30;
	}
}