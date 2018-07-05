// 二つの配列が等しいかどうかを判定

import java.util.Scanner;

class En2_5 {

	//--- 配列bの全要素を配列aにコピーする ---//
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[b.length - i - 1];
	}

	//--- 二つの配列a, bの全要素は等しいか？ ---//
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])
				return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("配列aの要素数：");
		int na = stdIn.nextInt();		// 配列aの要素数

		int[] a = new int[na];			// 要素数naの配列

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.print("配列bの要素数：");
		int nb = stdIn.nextInt();		// 配列bの要素数

		int[] b = new int[nb];			// 要素数nbの配列

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}

		copy(a, b);

		System.out.println("配列bの全要素を配列aに逆順にコピーしました。");
		for (int i = 0; i < nb; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
