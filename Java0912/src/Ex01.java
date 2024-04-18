
public class Ex01 {

	public static void main(String[] args) {
		int i0 = 4, i1 = 55, i2 = 32, i3 = 28, i4 = 35, i5 = 2, i6 = 99, i7 = 13, i8 = 43, i9 = 65;
		int sum = i0 + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9;
		System.out.println("합계 : " + sum);
		int i[] = {4, 55, 32, 28, 35, 2, 99, 13, 43, 65};
		int sum2 = i[0] + i[1] + i[2] + i[3] + i[4] + i[5] + i[6] + i[7] + i[8] + i[9];
		System.out.println("합계 : " + sum2);
		int sum3 = 0;
		for (int j = 0; j < i.length; j++) {
			sum3 += i[j];
		}
		System.out.println("합계 : " + sum3);
	}

}
