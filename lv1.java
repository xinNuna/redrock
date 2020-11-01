import java.util.Scanner;
public class lv1 {
    public static void main(String[] args) {
        int num[]={1,77,67,48,56,3};
        
        for(int i=1;i<num.length;i++){       //length=6,length-1=5
                                              //循环遍历 外层循环为选length==》意为选出5个较大的数

            for(int j=0;j<num.length-i;j++){
                                             //内层循环，从第一个数开始依次与后面的数进行比较大小，小的数往后面移，共移length-i次
                if(num[j]<num[j+1]){           //例如，选第一小的数字1，要与后面的数字比较5次，j=4,
                    int temp=0;
                    temp=num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                }
            }
        }

          System.out.println("从小到大重排后的数列为：");
        for(int a=0;a<num.length;a++){
            System.out.print(num[a]+" ");
        }
        System.out.println("\n"+"input:");
        int newNum=new Scanner(System.in).nextInt();           //输入新数

        int num1[]=new int[num.length+1];                   //数组重组，将输入的新数字插入到数组最后
        for(int m=0;m<num1.length;m++){
            if(m<num.length){
                num1[m]=num[m];
            }else{
                num1[m]=newNum;
            }
        }
        for(int i=1;i<num1.length;i++){                  //循环遍历
            for(int j=0;j<num1.length-i;j++) {
                if (num1[j] < num1[j + 1]) {
                    int temp = 0;
                    temp = num1[j + 1];
                    num1[j + 1] = num1[j];
                    num1[j] = temp;
                }
            }
        }
        System.out.print("新数列排序后:");
        for(int i=0;i<num1.length;i++) {
            System.out.print(num1[i]+" ");
        }
    }

}

