package day11;

public class CharArray {

	public static void main(String[] args) {
	String name ="kimhyunwoo";
	System.out.println("name:"+name);
	//자신의 이름을 문자배열을 만들어 넣으시오.
	char[] nameArr2 = {'A','B','C'};//'A' /"A"-->"A/0"
	char[] nameArr =name.toCharArray();
	for(int i=0; i<nameArr.length; i++) {
		System.out.println(nameArr[i]);
	}
	}

}
