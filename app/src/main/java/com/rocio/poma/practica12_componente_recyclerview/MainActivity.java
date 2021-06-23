package com.rocio.poma.practica12_componente_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Productos> productosList=new ArrayList<Productos>();

        productosList.add(new Productos("Producto 1",40,"https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2018/07/receta-borrachitos.jpg",5));
        productosList.add(new Productos("Producto 2",30,"https://cdn2.cocinadelirante.com/sites/default/files/styles/gallerie/public/images/2017/08/macarronesfranceses.jpg",4));
        productosList.add(new Productos("Producto 3",60,"https://headbng.com/wp-content/uploads/2018/04/Festival-del-Helado-Mexicano-3.jpg",3));
        productosList.add(new Productos("Producto 4",28,"https://headbng.com/wp-content/uploads/2018/04/Festival-del-Helado-Mexicano-5.jpg",5));
        productosList.add(new Productos("Producto 5",10,"https://headbng.com/wp-content/uploads/2018/04/Festival-del-Helado-Mexicano-5.jpg",2));

        GridView gridView1=findViewById(R.id.gridView1);
        ProductosAdapter adapter=new ProductosAdapter(getApplicationContext(),productosList);
        gridView1.setAdapter(adapter);
    }
}