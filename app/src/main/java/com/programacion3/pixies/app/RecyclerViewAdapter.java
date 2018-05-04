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
import android.widget.Toast;

import java.util.List;

/**
 * Created by Mateo on 01/05/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    Context context;
    List<Producto> productList;
    LayoutInflater inflater;

    public RecyclerViewAdapter(Context context, List<Producto> productList) {
        this.context = context;
        this.productList = productList;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLayout = inflater.inflate(R.layout.cardview_productos, null);

        return new MyViewHolder(itemLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nombreProducto.setText(productList.get(position).getDescription());
        holder.imagenProducto.setImageResource(productList.get(position).getImage());
        holder.cardView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                View layout = inflater.inflate(R.layout.activity_custom_dialog_comprar, null);
                Button button = layout.findViewById(R.id.comprarCustomDialog);
                button.setText("COMPRAR");
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("¿Deseas comprar este producto?");
                builder.setView(layout);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                return true;            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nombreProducto;
        ImageView imagenProducto;
        CardView  cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            nombreProducto = (TextView) itemView.findViewById(R.id.nombre_producto_id);
            imagenProducto = (ImageView) itemView.findViewById(R.id.imagen_producto_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview);
        }
    }

}
