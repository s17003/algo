import java.util.Scanner;
public class En1_14 {
		public static void main(String[] args) {
				System.out.println("正方形を表示します");
				System.out.print("段落は：" );
				Scanner p = new Scanner(System.in);
				int n;
				n = p.nextInt();

				for (int i = 1; i <= n; i++) {
						for (int j = 1; j <= n; j++)
								System.out.print("* ");
						System.out.println();
				}
		}
}
