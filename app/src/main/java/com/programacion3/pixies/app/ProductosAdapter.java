package com.programacion3.pixies.app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mateo on 02/05/2018.
 */

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolder> {

    private Context mContext;
    private List<Producto> productoList;

    ProductosAdapter(Context context, List<Producto> list) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.item_image.setImageResource(productoList.get(position).getImage());
        holder.item_nombre.setText(productoList.get(position).getNombre());
        holder.item_precio.setText(productoList.get(position).getNombre());
        holder.item_cantidad.setText(productoList.get(position).getNombre());

    }

    @Override
    public int getItemCount() {
        return productoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView item_image;
        TextView item_nombre, item_precio, item_cantidad, item_comprar;

        public ViewHolder(View itemView) {
            super(itemView);
            item_image = (ImageView) itemView.findViewById(R.id.item_image);
            item_nombre = (TextView) itemView.findViewById(R.id.item_nombre);
            item_precio = (TextView) itemView.findViewById(R.id.item_precio);
            item_cantidad = (TextView) itemView.findViewById(R.id.item_cantidad);
            item_comprar = (TextView) itemView.findViewById(R.id.item_comprar);

        }
    }

}