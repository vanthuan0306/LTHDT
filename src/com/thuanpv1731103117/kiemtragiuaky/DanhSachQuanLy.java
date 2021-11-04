package com.thuanpv1731103117.kiemtragiuaky;

import java.util.ArrayList;

public class DanhSachQuanLy extends Nguoi {

    private final ArrayList<Nguoi> danhSach = new ArrayList<>();

    public void them(Nguoi nguoi) {
        danhSach.add(nguoi);
    }

    public void inDanhSach() {
        for (int i = 0; i < danhSach.size(); i++) {
            danhSach.get(i).toString();
        }
    }
    
}
