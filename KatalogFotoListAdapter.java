package com.example.cetakfoto_mod2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KatalogFotoListAdapter extends RecyclerView.Adapter <KatalogFotoListAdapter.KatalogViewHolder > {

    private LayoutInflater mInflater;
    public KatalogFotoListAdapter(Context context){
        mInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public KatalogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.katalog_foto_item,parent, false);
        return new KatalogViewHolder(itemView,this) ;
    }

    @Override
    public void onBindViewHolder(@NonNull KatalogViewHolder holder, int position) {
        KatalogFoto katalogFoto = KatalogFotoUtil.getKatalogFotoAt(position);
        holder.ivKatalogFoto.setImageResource(KatalogFoto.getResId());
        holder.tvFilename.setText(KatalogFoto.getFilename());


    }

    @Override
    public int getItemCount() {
        return KatalogFotoUtil.getKatalogFotoList().size();
    }

    class KatalogViewHolder extends RecyclerView.ViewHolder {
        final Button btnCetak;
        final Button[] btnUkuranArray;
        final ImageView ivKatalogFoto;
        final TextView tvFilename;
        private KatalogFotoListAdapter mAdapter;

        private int[] restBtnUkuranArray = {
                 R.id.btn_ukuran3r,
                R.id.btn_ukuran4r,
                R.id.btn_ukuran8r,
                R.id.btn_ukuran10r,
        };



        public KatalogViewHolder(@NonNull View itemView, KatalogFotoListAdapter _mAdapter) {
            super(itemView);
            mAdapter = _mAdapter;

            btnCetak = itemView.findViewById(R.id.btn_cetak);
            ivKatalogFoto = itemView.findViewById(R.id.iv_katalog_foto_);
            tvFilename = itemView.findViewById(R.id.tv_katalog_filename);
            btnUkuranArray = new Button[restBtnUkuranArray.length];

            for(int i=0; i< restBtnUkuranArray.length;i++){
                btnUkuranArray[i] = itemView.findViewById(restBtnUkuranArray[i]);
            }
        }
    }
}
