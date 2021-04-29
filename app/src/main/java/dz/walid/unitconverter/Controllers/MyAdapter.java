package dz.walid.unitconverter.Controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

import dz.walid.unitconverter.Models.Time;
import dz.walid.unitconverter.R;

/**
 * Created by Walid on 28/04/2021.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<Time> list;
    Context context;

    public MyAdapter(Context context, ArrayList<Time> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Time t = list.get(position);
        holder.seconde.setText(t.getSecondeAf());
        holder.minute.setText(t.getMinuteAf());
        holder.heure.setText(t.getHeureAf());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView seconde, minute, heure;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            seconde = itemView.findViewById(R.id.seconde);
            minute = itemView.findViewById(R.id.minute);
            heure = itemView.findViewById(R.id.heure);
        }
    }
}
