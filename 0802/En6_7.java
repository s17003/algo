// 単純挿入ソート

import java.util.Scanner;

class En6_7 {

    //--- 単純挿入ソート ---//
    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];
            for (int b = 0; b < n; b++) {
                System.out.printf("%3d",a[b]);
            }
            System.out.println("");
            for (j = i; j > 0 && a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
            for (int o = 0; o < j;o++) {
                System.out.print("   ");
            }
            if (i == j){
                System.out.print("  +");
                System.out.println("");
            }
            else{
                for (int l = j; l <= i;l++){
                    if(l == (i)){
                        System.out.print("--+");
                    }else if(l == j){
                        System.out.print(" ^-");
                    }
                    else{
                        System.out.print("---");
                    }
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("単純挿入ソート");
        System.out.print("要素数：");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        insertionSort(x, nx);				// 配列xを単純挿入ソート

        System.out.println("昇順にソートしました。");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]＝" + x[i]);
    }
}
