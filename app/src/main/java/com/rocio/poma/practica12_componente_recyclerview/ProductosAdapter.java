package com.rocio.poma.practica12_componente_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProductosAdapter extends ArrayAdapter<Productos> {


    public ProductosAdapter(@NonNull Context context, @NonNull List<Productos> objets) {
        super(context, 0,objets);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.grit_item,parent,false);
        }

        Productos p=getItem(position);

        TextView txtNombre= convertView.findViewById(R.id.txtNombre);
        txtNombre.setText(p.getNombre());

        //TextView txtPrecio= convertView.findViewById(R.id.txtPrecio);
       // txtPrecio.setText((int) p.getPrecio());

        ImageView imgView=convertView.findViewById(R.id.imgView);

        Glide
                .with(getContext())
                .load(p.getImagenUrl())
                .centerCrop()
                //.placeholder(R.drawable.loading_spinner)
                .into(imgView);
        return convertView;
    }

}
