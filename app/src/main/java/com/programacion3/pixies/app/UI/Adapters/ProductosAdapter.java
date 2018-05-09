package com.programacion3.pixies.app.UI.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.programacion3.pixies.app.Controler.DBController;
import com.programacion3.pixies.app.Model.Producto;
import com.programacion3.pixies.app.R;
import com.programacion3.pixies.app.Controler.SharedPreferencesController;

import java.util.List;

/**
 * Created by Mateo on 02/05/2018.
 */

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolder> {

    private Context mContext;
    private List<Producto> productoList;
    DBController dbController;
    SharedPreferencesController sharedPreferences;

    public ProductosAdapter(Context context, List<Producto> list) {
        mContext = context;
        productoList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.cardview_productos2, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        dbController = new DBController(mContext, "Carrito.db", null, 1);
        sharedPreferences = new SharedPreferencesController(mContext);

        holder.item_image.setImageResource(productoList.get(position).getImage());
        holder.item_nombre.setText(productoList.get(position).getNombre());
        holder.item_precio.setText(String.valueOf(productoList.get(position).getPrecio()));
        holder.item_cantidad.setText(String.valueOf(productoList.get(position).getCantidad()));
        holder.item_add_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbController.insertCarrito(productoList.get(position).getImage(),
                        productoList.get(position).getCantidad(),
                        productoList.get(position).getPrecio(),
                        productoList.get(position).getNombre(),
                        sharedPreferences.getUsuario());
                Toast.makeText(mContext, "Producto añadido al carrito", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return productoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView item_image,item_add_cart;
        TextView item_nombre, item_precio, item_cantidad;

        public ViewHolder(View itemView) {
            super(itemView);
            item_image = (ImageView) itemView.findViewById(R.id.item_image);
            item_nombre = (TextView) itemView.findViewById(R.id.item_nombre);
            item_precio = (TextView) itemView.findViewById(R.id.item_precio);
            item_cantidad = (TextView) itemView.findViewById(R.id.item_cantidad);
            item_add_cart=(ImageView)itemView.findViewById(R.id.item_add_cart);

        }
    }

}