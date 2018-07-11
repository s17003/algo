// 線形探索（番兵法）

import java.util.Scanner;

class En3_3 {

	//--- 配列aの先頭n個の要素からkeyと一致する要素を線形探索（番兵法）---//
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;

		for (int i = 0; i < n; i++)
			if (a[i] == key)
				idx[count++] = i;
		return count;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		int[] y = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		System.out.print("探す値：");
		int ky = stdIn.nextInt();

		int count = searchIdx(x, num, ky, y);

		if (count == 0)
			System.out.println("その値の要素は存在しません。");
		else
			for (int i = 0; i < count; i++)
				System.out.println("その値は" + "x[" + y[i] + "]にあります。");
	}
}
