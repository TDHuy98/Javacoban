import java.util.Scanner;
public class Javacoban {
    public static void main(String[] args) {
        System.out.println("Tien Luong 1 Thang: ");
        Scanner scanner = new Scanner(System.in);
        int a;//Thu nhap 1 thang cua ca nhan
        String bb = "co";//co nguoi phu thuoc
        int c;//So nguoi phu thuoc
        int d;//So tien mien giam dua tren nguoi phu thuoc
        d = 0;
        double e;//Cac khoan duoc mien tru
        e = 0;
        double f;//Thu nhap tinh thue
        f=0;
        int g;//Loai thu nhap tinh thue
        double h;//Ty le thu nhap ca nhan
        int i;//Tien tru
        a = scanner.nextInt();
        if (a <= 11000000) {
            System.out.println("khong phai dong thue thu nhap ca nhan");
        } else {
            System.out.println("Co nguoi phu thuoc khong:");
            String b = scanner.next();
            if (b.equals(bb)) {
                System.out.println("Co bao nhieu nguoi phu thuoc:");
                c = scanner.nextInt();
                g = (c*4400000+11000000);
                if (a <= g) {
                    f = 0;
                } else if (a>g) {
                    System.out.println("So tien mien giam theo so nguoi phu thuoc:" + (d = c * 4400000));
                    //Tinh so tien mien giam dua tren so nguoi phu thuoc
                    System.out.println("So tien duoc mien tru:" + (e = g + a * 0.105));
                    System.out.println("Thu nhap tinh thue:" + (f = a - e));//Tinh thu nhap tinh thue
                }
                } else {
                    d = 0;
                    System.out.println("So tien duoc mien tru:" + (e = 11000000 + a * 0.105));//Tinh cac khoan duoc mien tru
                    System.out.println("Thu nhap tinh thue:" + (f = a - e));//Tinh thu nhap tinh thue
                    }
            if (f == 0) {
                System.out.println("Khong phai dong thue thu nhap ca nhan");
            }
            else if   (0<f &&f <= 5000000) {
                System.out.println("So tien thue thu nhap ca nhan phai dong:" + (f * 0.05));//Tinh thu nhap ca nhan

            } else if (5000000 < f && f <= 10000000) {
                System.out.println("So tien thue thu nhap ca nhan phai dong:" + (f * 0.1 - 250000));//Tinh thu nhap ca nhan

            } else if (10000000 < f && f<= 18000000) {
                System.out.println("So tien thue thu nhap ca nhan phai dong:" + (f * 0.15 - 750000));//Tinh thu nhap ca nhan

            } else if (18000000 < f && f <= 32000000) {
                System.out.println("So tien thue thu nhap ca nhan phai dong:" + (f * 0.2 - 1650000));//Tinh thu nhap ca nhan

            } else if (32000000 < f && f <= 52000000) {
                System.out.println("So tien thue thu nhap ca nhan phai dong:" + (f * 0.25 - 3250000));//Tinh thu nhap ca nhan

            } else if (52000000 < f && f <= 80000000) {
                System.out.println("So tien thue thu nhap ca nhan phai dong:" + (f * 0.30 - 5850000));//Tinh thu nhap ca nhan

            } else if (80000000 < f) {
                System.out.println("So tien thue thu nhap ca nhan phai dong:" + (f * 0.35 - 9850000));//Tinh thu nhap ca nhan

            }
        }

    }
}