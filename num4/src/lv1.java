import java.util.InputMismatchException;
import java.util.Scanner;


//    couple.count(number) // 帮我计数，累加number
//    couple.getCount() // 男/女朋友，帮我看看计数到哪了？
//    couple.fb(n) // 男/女朋友，帮我算算斐波那契数列第n项是多少？
interface Compute {
    int sum(int a);

    int mul(int n);

    int fb(int f);
}

class ToolsMan implements Compute {
    @Override
    public int sum(int a) {
        int result = 0;
        int i = 1;
        result = (i + a) * a / 2;
        return result;
    }

    @Override
    public int mul(int n) {
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= (i + 1);

        }
        return result;
    }

    @Override
    public int fb(int f) {
        int a = 1;
        int b = 1;
        int temp = 0;
        for (int i = 3; i < f + 1; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}

class BF extends ToolsMan {
    public void PrintSum() {

        System.out.println("项数是：");
        int num1 = new Scanner(System.in).nextInt();
        System.out.print("男朋友，帮我计数，累加到" + num1);
        System.out.println( "答案是" + sum(num1) + "哦~");
        System.out.println("欢迎下次再来哦~");
    }

    public void PrintMul() {
        System.out.print("男朋友，帮我计算阶乘，算到" );
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("答案是" + mul(num2) + "哦~");
        System.out.println("欢迎下次再来哦~");
    }

    public void PrintFb() {
        System.out.print("男朋友，帮我算算斐波那契数列，算到项数为" );
        int num3 = new Scanner(System.in).nextInt();
        System.out.println( "答案是" + fb(num3) + "哦~");
        System.out.println("欢迎下次再来哦~");
    }
}

public class lv1 {
    public static void main(String[] args) {
        System.out.println("感谢您点的虚拟男友哦，需要我干什么呢？");
        System.out.println("1.计数累加" + "\n" + "2.算阶乘" + "\n" + "3.计算斐波拉契数列");
        int method = new Scanner(System.in).nextInt();
        ToolsMan couple = new BF();
        BF bf = (BF) couple;
        try {
            switch (method) {
                case 1:
                    bf.PrintSum();
                    break;
                case 2:
                    bf.PrintMul();
                    break;
                case 3:
                    bf.PrintFb();
                    break;
                default:
                    System.out.println("我是个铁five，我不会其他的orz");
            }
        } catch (InputMismatchException e) {
            System.out.println("项数过长，大脑报废啦！");
        }

    }
}




