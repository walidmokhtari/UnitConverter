package dz.walid.unitconverter.Controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dz.walid.unitconverter.Models.Liquid;
import dz.walid.unitconverter.Models.Weight;
import dz.walid.unitconverter.R;

/**
 * Created by Walid on 29/04/2021.
 */
public class MyAdapterW extends RecyclerView.Adapter<MyAdapterW.MyViewHolder>{

    ArrayList<Weight> list;
    Context context;

    public MyAdapterW(Context context, ArrayList<Weight> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyAdapterW.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_w,parent,false);
        return new MyAdapterW.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterW.MyViewHolder holder, int position) {
        Weight w = list.get(position);
        holder.mg.setText(w.getMgAf());
        holder.cg.setText(w.getCgAf());
        holder.dg.setText(w.getDgAf());
        holder.g.setText(w.getgAf());
        holder.dag.setText(w.getDagAf());
        holder.hg.setText(w.getHgAf());
        holder.kg.setText(w.getKgAf());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mg, cg, dg, g, dag, hg, kg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mg = itemView.findViewById(R.id.mg);
            cg = itemView.findViewById(R.id.cg);
            dg = itemView.findViewById(R.id.dg);
            g = itemView.findViewById(R.id.g);
            dag = itemView.findViewById(R.id.dag);
            hg = itemView.findViewById(R.id.hg);
            kg = itemView.findViewById(R.id.kg);
        }
    }
}
