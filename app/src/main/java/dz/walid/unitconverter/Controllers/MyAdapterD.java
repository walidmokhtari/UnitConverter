package dz.walid.unitconverter.Controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dz.walid.unitconverter.Models.Distance;
import dz.walid.unitconverter.Models.Weight;
import dz.walid.unitconverter.R;

/**
 * Created by Walid on 29/04/2021.
 */
public class MyAdapterD extends RecyclerView.Adapter<MyAdapterD.MyViewHolder> {

    ArrayList<Distance> list;
    Context context;

    public MyAdapterD(Context context, ArrayList<Distance> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyAdapterD.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_d,parent,false);
        return new MyAdapterD.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterD.MyViewHolder holder, int position) {
        Distance d = list.get(position);
        holder.mm.setText(d.getMmAf());
        holder.cm.setText(d.getCmAf());
        holder.dm.setText(d.getDmAf());
        holder.m.setText(d.getmAf());
        holder.dam.setText(d.getDamAf());
        holder.hm.setText(d.getHmAf());
        holder.km.setText(d.getKmAf());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mm, cm, dm, m, dam, hm, km;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mm = itemView.findViewById(R.id.mm);
            cm = itemView.findViewById(R.id.cm);
            dm = itemView.findViewById(R.id.dm);
            m = itemView.findViewById(R.id.m);
            dam = itemView.findViewById(R.id.dam);
            hm = itemView.findViewById(R.id.hm);
            km = itemView.findViewById(R.id.km);
        }
    }
}
