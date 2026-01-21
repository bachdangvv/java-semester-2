package asm1;

import java.util.Scanner;

public class PhanSo {
    private Integer tuSo;
    private Integer mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public Integer getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public Integer getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void nhapPhanSo(Scanner sc) {
        System.out.print("\tNhập tử số: ");
        this.tuSo = sc.nextInt();
        System.out.print("\tNhập mẫu số: ");
        this.mauSo = sc.nextInt();
    }

    public void inPhanSo() {
        System.out.print(tuSo + "/" + mauSo);
    }

    private Integer timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0) return b;
        if (b == 0) return a;

        int ucln = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
            }
        }
        return ucln;
    }

    public void rutGon() {
        Integer ucln = timUCLN(tuSo, mauSo);
        this.tuSo /= ucln;
        this.mauSo /= ucln;
    }

    public void nghichDao() {
        Integer temp = tuSo;
        tuSo = mauSo;
        mauSo = temp;
    }

    public PhanSo add(PhanSo ps2) {
        int tuMoi = this.tuSo * ps2.mauSo + ps2.tuSo * this.mauSo;
        int mauMoi = this.mauSo * ps2.mauSo;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo sub(PhanSo ps2) {
        int tuMoi = this.tuSo * ps2.mauSo - ps2.tuSo * this.mauSo;
        int mauMoi = this.mauSo * ps2.mauSo;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo mul(PhanSo ps2) {
        int tuMoi = this.tuSo * ps2.tuSo;
        int mauMoi = this.mauSo * ps2.mauSo;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }

    public PhanSo div(PhanSo ps2) {
        int tuMoi = this.tuSo * ps2.mauSo;
        int mauMoi = this.mauSo * ps2.tuSo;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }
}
