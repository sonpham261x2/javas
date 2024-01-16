import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //1.1
    static Scanner s = new Scanner(System.in);

    static void if1() {
        int a, b, c;
        System.out.println("nhap 3 so : ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        System.out.println("So lon nhat = " + max(max(a, b), c));
    }

    static int max(int a, int b) {
        if (a > b) return a;
        return b;
    }

    //1.2
    static void if2() {
        System.out.print("nhap diem = ");
        double a = s.nextDouble();
        String xep_loai = "";
        if (a > 8) xep_loai = "gioi";
        else if (a > 6.5) xep_loai = "kha";
        else if (a > 5) xep_loai = "trung binh";
        else xep_loai = "yeu";
        System.out.println("Xep loai : " + xep_loai);
    }

    //1.3
    static void if3() {
        System.out.println("nhap vao 1 so");
        int a = s.nextInt();
        if (a > 0) System.out.println("==> Positive");
        else if (a < 0) System.out.println("==> Negative");
        else System.out.println("==> 0");
    }

    //2.1
    static void loop1() {
        System.out.print("Nhap so = ");
        int a = s.nextInt();
        int giai_thua = 1;
        for (int i = 2; i <= a; i++)
            giai_thua *= i;
        System.out.println(a + "! = " + giai_thua);
    }

    //2.2
    static void loop2() {
        System.out.println("20 so snt dau tien : ");
        int i = 2, count = 0;
        while (true) {
            if (snt(i) != 0) {
                count++;
                System.out.println(i);
            }
            if (count == 20) break;
            i++;
        }
    }

    static int snt(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++)
            if (a % i == 0)
                return 0;
        return a;
    }

    //2.3
    static void loop3() {
        System.out.println("20 so fibonacci dau tien : ");
        int a = 0, b = 1, count = 0;
        System.out.println(a);
        System.out.println(b);
        while (count < 20) {
            System.out.println(next_fibonacci(a, b));
            int temp = b;
            b = next_fibonacci(a, b);
            a = temp;
            count++;
        }
    }

    static int next_fibonacci(int a, int b) {
        if (a == 0) return 1;
        return a + b;
    }

    //2.4
    static void loop4() {
        System.out.print("Nhap so tien gui = ");
        double tien = s.nextDouble();
        System.out.print("Nhap lai suat = ");
        double ls = s.nextDouble();
        System.out.print("Nhap so thang gui = ");
        int thang = s.nextInt();
        double lai;
        for (int i = 1; i <= thang; i++) {
            lai = tien * ls;
            tien += lai;
        }
        System.out.println("So tien nhan duoc sau khi su dung lai kep trong " + thang + " = " + tien);
    }

    //2.5
    static void loop5() {
        System.out.println("Mang : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) System.out.println(" HelloWorld ");
            else if (i % 5 == 0) System.out.println(" World ");
            else if (i % 3 == 0) System.out.println(" Hello ");
            else System.out.println(" " + i + " ");
        }
    }

    //2.6
    static void loop6() {
        int a, b, rd, du_doan, count = 0;
        Random ramdom = new Random();
        System.out.println("Nhap 2 so bat ki : ");
        a = s.nextInt();
        b = s.nextInt();
        if (a < b) rd = a + ramdom.nextInt(b + 1 - a);
        else rd = b + ramdom.nextInt(a + 1 - b);
        while (count < 3) {
            System.out.print("nhap so du doan = ");
            du_doan = s.nextInt();
            if (du_doan == rd) {
                System.out.println("====Ban da thang====");
                break;
            }
            if (du_doan > rd) System.out.println("--Giam xuong--");
            if (du_doan < rd) System.out.println(("--Tang len--"));
            count++;
        }
        if (count == 3) System.out.println("====Ban da thua====");
    }


    public static void main(String[] args) {
        //1.1
        System.out.println("-====================-");
        if1();
        //1.2
        System.out.println("-====================-");
        if2();
        //1.3
        System.out.println("-====================-");
        if3();
        //2.1
        System.out.println("-====================-");
        loop1();
        //2.2
        System.out.println("-====================-");
        loop2();
        //2.3
        System.out.println("-====================-");
        loop3();
        //2.4
        System.out.println("-====================-");
        loop4();
        //2.5
        System.out.println("-====================-");
        loop5();
        //2.6
        System.out.println("-====================-");
        loop6();
    }
}