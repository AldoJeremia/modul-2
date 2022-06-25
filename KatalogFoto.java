package com.example.cetakfoto_mod2;

public class KatalogFoto<resId> {

    private static int resId;
    private static String filename;




    public  KatalogFoto(int _resId, String _filename){
        resId = _resId;
        filename = _filename;
    }
    public static int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public static String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
