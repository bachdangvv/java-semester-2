package asm1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("--- Nhập phân số 1 ---");
        ps1.nhapPhanSo(sc);
        ps1.rutGon();

        System.out.println("--- Nhập phân số 2 ---");
        ps2.nhapPhanSo(sc);
        ps2.rutGon();

        System.out.print("PS1 rút gọn: "); ps1.inPhanSo();
        System.out.print("\nPS2 rút gọn: "); ps2.inPhanSo();
        System.out.println("\n---------------------");3

        PhanSo tong = ps1.add(ps2);
        System.out.print("Tổng: "); tong.inPhanSo();

        PhanSo hieu = ps1.sub(ps2);
        System.out.print("\nHiệu: "); hieu.inPhanSo();

        PhanSo tich = ps1.mul(ps2);
        System.out.print("\nTích: "); tich.inPhanSo();

        PhanSo thuong = ps1.div(ps2);
        System.out.print("\nThương: "); thuong.inPhanSo();

        sc.close();
    }
}
