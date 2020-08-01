package BTVN;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap so giai thua:");
		int n = scan.nextInt();
		System.out.println("Giai thừa của " + n + " là: "
                + bai2.tinhGiaithua(n));
	}

	public static long tinhGiaithua(int n) {
		if (n > 0) {
			return n * tinhGiaithua(n - 1);
		} else {
			return 1;
		}
	}
}
