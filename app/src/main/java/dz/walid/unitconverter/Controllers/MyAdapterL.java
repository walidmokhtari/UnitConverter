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
import dz.walid.unitconverter.Models.Time;
import dz.walid.unitconverter.R;

/**
 * Created by Walid on 29/04/2021.
 */
public class MyAdapterL extends RecyclerView.Adapter<MyAdapterL.MyViewHolder>  {

    ArrayList<Liquid> list;
    Context context;

    public MyAdapterL(Context context, ArrayList<Liquid> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyAdapterL.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_l,parent,false);
        return new MyAdapterL.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterL.MyViewHolder holder, int position) {
        Liquid l = list.get(position);
        holder.ml.setText(l.getMlAf());
        holder.cl.setText(l.getClAf());
        holder.dl.setText(l.getDlAf());
        holder.l.setText(l.getlAf());
        holder.dal.setText(l.getDalAf());
        holder.hl.setText(l.getHlAf());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView ml, cl, dl, l, dal, hl;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ml = itemView.findViewById(R.id.ml);
            cl = itemView.findViewById(R.id.cl);
            dl = itemView.findViewById(R.id.dl);
            l = itemView.findViewById(R.id.l);
            dal = itemView.findViewById(R.id.dal);
            hl = itemView.findViewById(R.id.hl);
        }
    }
}
