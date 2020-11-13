import java.util.InputMismatchException;
import java.util.Scanner;


    //    couple.count(number) // 帮我计数，累加number
//    couple.getCount() // 男/女朋友，帮我看看计数到哪了？
//    couple.fb(n) // 男/女朋友，帮我算算斐波那契数列第n项是多少？

class BF {
        private int n;           //阶乘
        private int a;            //求和
        private int f;              //斐波那契

        public int getN() {
            return n;
        }

        public void setN(int n) {
            int result = 1;                                   //计算阶乘
            for (int i = 1; i < n; i++) {
                result *= (i + 1);
                this.n=result;
            }
        }


        public int getA() {
            return a;
        }

        public void setA(int a) {
                                                        //累加求和
            int result = 0;
            int i = 1;
            result = (i + a) * a / 2;
            this.a=result;
        }



        public int getF() {
            return f;
        }

        public void setF(int f) {
            int a = 1;
            int b = 1;
            int temp = 0;

            for (int i = 3; i < f + 1; i++) {
                temp = a + b;
                a = b;
                b = temp;
                this.f = b;
            }
        }

     static class WAY{
        public void means() {
            BF couple = new BF();
            int method = new Scanner(System.in).nextInt();
            try {
                switch (method) {
                    case 1:
                        System.out.print("男朋友，帮我计数，累加到");
                        int num2 = new Scanner(System.in).nextInt();
                        couple.setA(num2);
                        System.out.println("答案是：" + couple.getA());
                        System.out.println("欢迎下次再来哦~");
                        break;
                    case 2:
                        System.out.print("男朋友，帮我计算阶乘，算到");
                        int num1 = new Scanner(System.in).nextInt();
                        couple.setN(num1);
                        System.out.println("答案是" + couple.getN()+"哦~");
                        System.out.println("欢迎下次再来哦~");
                        break;
                    case 3:
                        System.out.print("男朋友，帮我算算斐波那契数列，算到项数为");
                        int num3 = new Scanner(System.in).nextInt();
                        couple.setF(num3);
                        System.out.println("答案是：" + couple.getF());
                        break;
                    default:
                        System.out.println("我是个铁five，我不会其他的orz");
                }
            }
            catch (InputMismatchException e){
                System.out.println("项数过长，大脑报废啦！");
            }
        }
        }

    public static void main(String[] args) {

        System.out.println("感谢您点的虚拟男友哦，需要我干什么呢？");
        System.out.println("1.计数累加" + "\n" + "2.算阶乘" + "\n" + "3.计算斐波拉契数列");
        WAY couple = new WAY();
        couple.means();

    }
}


