import java.util.Random;
import java.util.Scanner;

public class lv2 {
    /*、
    设计一个对称矩阵相乘
    输出对称矩阵的对角线之和的程序
【知识点】
1.二维数组
2.线性代数的矩阵乘法
3.Java Random函数的使用
4.Scanner的使用

提示：
输入一个数字为对称矩阵的行数和列数（行==列），随机产生两个对称矩阵
两个对称矩阵相乘
输出这两个随机产生的对称矩阵
输出相乘后的矩阵
输出最后相乘后的矩阵的对角线元素之和
矩阵运算法则：
第一行×第一列
先相乘再相加，
放在第一行第一个位置上             2 9    8 2    76 30
                                   *      =
第一行×第二列 再相加              6 0    2 6    48  12
放第一行第二个位置

第二行×第一列
放第二行第一个
第二行×第三列
放第二行第二个

scanner函数，获取输入行/列，
随机产生两个二维数列
用for循环，计算arr1[0][0]*arr2[0][0]
第一行arr1[0][i]
第一列arr[i][0]
*/
    public static void main(String[] args) {
        System.out.println("请输入矩阵的行/列：");
        int num=new Scanner(System.in).nextInt();

        int mul=num*num;
        Random r=new Random();
        int arr[]={ };                  //生成一个随机一维数组
        for(int i=0;i<mul;i++){
            System.out.print("随生成的一个"+mul+"的数列为："+r.nextInt(100)+"\t");
        }


        int arr1[][]=new int[num][num];
        int a=mul/2;
        for(int foot1=0;foot1<a;foot1++){     //foot1=行 foot2=列
          for(int foot2=0;foot2<a;foot2++){
              arr1[0][foot2]=arr[foot1];
          }
        }

    }

}
