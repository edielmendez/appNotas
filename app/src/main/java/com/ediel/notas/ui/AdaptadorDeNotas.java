package com.ediel.notas.ui;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ediel.notas.R;

/**
 * Adaptador del recycler view
 */
public class AdaptadorDeNotas extends RecyclerView.Adapter<AdaptadorDeNotas.ViewHolder> {
    private Cursor cursor;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public TextView titulo;
        public TextView texto;
        public TextView created_at;
        public TextView last_modification;


        public ViewHolder(View v) {
            super(v);
            titulo = (TextView) v.findViewById(R.id.titulo);
            texto = (TextView) v.findViewById(R.id.texto);
            created_at = (TextView) v.findViewById(R.id.created_at);
            last_modification = (TextView) v.findViewById(R.id.last_modification);

        }
    }

    public AdaptadorDeNotas(Context context) {
        this.context= context;

    }

    @Override
    public int getItemCount() {
        if (cursor!=null)
        return cursor.getCount();
        return 0;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_layout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        cursor.moveToPosition(i);

        String titulo;
        String texto;
        String created_at;
        String last_modification;

        titulo = cursor.getString(1);
        texto = cursor.getString(2);
        created_at = cursor.getString(3);
        last_modification = cursor.getString(4);
        System.out.println("CURSOSOSOSO "+cursor.getString(1));
        viewHolder.titulo.setText(titulo);
        viewHolder.texto.setText(texto);
        viewHolder.last_modification.setText(last_modification);
        viewHolder.created_at.setText(created_at);
    }

    public void swapCursor(Cursor newCursor) {
        cursor = newCursor;
        notifyDataSetChanged();
    }

    public Cursor getCursor() {
        return cursor;
    }
}