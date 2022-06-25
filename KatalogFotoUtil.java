package com.example.cetakfoto_mod2;

import java.util.ArrayList;
import java.util.List;

public class KatalogFotoUtil {
    private static int[] ridArray = {
            R.drawable.robot,
            R.drawable.robot2,
            R.drawable.robot3,
            R.drawable.robot4,
            R.drawable.robot5,
    };

    private static String[] filenameArray = {
            "robot","robot2","robot3","robot4","robot5"
    };

    private static List<KatalogFoto> katalogFotoList;

    public static void  init(){
        katalogFotoList = new ArrayList<>();
        int nArray = ridArray.length;
        for(int i=0;i<nArray;i++){
            katalogFotoList.add(new KatalogFoto(ridArray[i], filenameArray[i]));
        }
    }

    public static List<KatalogFoto> getKatalogFotoList() {

        return katalogFotoList;
    }

    public static KatalogFoto getKatalogFotoAt(int i){
        return katalogFotoList.get(i);
    }
}
