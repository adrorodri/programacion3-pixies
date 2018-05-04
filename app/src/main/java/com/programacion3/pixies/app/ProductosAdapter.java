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

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolder>{

    private Context mContext;
    private List<Producto> productList;
    ProductosAdapter(Context context,List<Producto> list){
        mContext = context;
        productList = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.cardview_productos2,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Producto productoItem = productList.get(position);

        ImageView image = holder.item_image;
        TextView nombre,precio,cantidad;
        nombre = holder.item_nombre;
        precio = holder.item_precio;
        cantidad = holder.item_cantidad;

        image.setImageResource(productoItem.getImage());
        nombre.setText(productoItem.getNombre());
        precio.setText(productoItem.getPrecio());
        cantidad.setText(productoItem.getCantidad());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView item_image;
        TextView item_nombre,item_precio,item_cantidad,item_comprar;

        public ViewHolder(View itemView) {
            super(itemView);
            item_image = itemView.findViewById(R.id.item_image);
            item_nombre = itemView.findViewById(R.id.item_nombre);
            item_precio = itemView.findViewById(R.id.item_precio);
            item_cantidad = itemView.findViewById(R.id.item_cantidad);
            item_comprar = itemView.findViewById(R.id.item_comprar);

        }
    }

//    Context context;
//    List<Producto> productList;
//    LayoutInflater inflater;
//
//    public ProductosAdapter(Context context, List<Producto> productList) {
//        this.context = context;
//        this.productList = productList;
//        inflater = LayoutInflater.from(context);
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View itemLayout = inflater.inflate(R.layout.cardview_productos2, null);
//
//        return new MyViewHolder(itemLayout);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.imagenProducto.setImageResource(productList.get(position).getImage());
//        holder.buttonMas.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                View layout = inflater.inflate(R.layout.activity_custom_dialog_comprar, null);
//                Button button = layout.findViewById(R.id.comprarCustomDialog);
//                button.setText("COMPRAR");
//                AlertDialog.Builder builder = new AlertDialog.Builder(context);
//                builder.setTitle("¿Deseas comprar este producto?");
//                builder.setView(layout);
//                AlertDialog alertDialog = builder.create();
//                alertDialog.show();
//                return true;            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return productList.size();
//    }
//
//    public static class MyViewHolder extends RecyclerView.ViewHolder{
//        ImageView imagenProducto;
//        CardView cardView;
//        Button buttonMas;
//
//        public MyViewHolder(View itemView){
//            super(itemView);
//
//            imagenProducto = (ImageView) itemView.findViewById(R.id.imagen_producto_id);
//            cardView = (CardView) itemView.findViewById(R.id.cardview);
//            buttonMas=(Button)itemView.findViewById(R.id.buttonMas);
//        }
//    }

}