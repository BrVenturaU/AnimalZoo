package com.example.animalzoo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalzoo.Entity.Animal;
import com.example.animalzoo.Interfaces.IAnimalService;
import com.example.animalzoo.R;
import com.example.animalzoo.Services.AnimalService;

import java.util.ArrayList;
import java.util.List;

public class AnimalesAdapter extends RecyclerView.Adapter<AnimalesAdapter.ViewHolder> implements View.OnClickListener{
    private int ANIMAL_COUNT = 0;
    private Context context;
    private ArrayList<Animal> animales;
    private IAnimalService animalService;
    private View.OnClickListener listener;

    public AnimalesAdapter(){
    }

    public void setData(ArrayList<Animal> list, IAnimalService service){
        animales = list;
        animalService = service;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombreAnimal, tvDescripcionAnimal;
        ImageView imvIcAnimal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNombreAnimal = itemView.findViewById(R.id.tvNombreAnimal);
            tvDescripcionAnimal = itemView.findViewById(R.id.tvDescripcionAnimal);
            imvIcAnimal = itemView.findViewById(R.id.imvIcAnimal);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.item_animal, parent, false);
        view.setOnClickListener(this);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Animal animal = animales.get(position);
        setAnimalData(animal, holder);
    }

    @Override
    public int getItemCount() {
        return animales.size();
    }

    public void setOnclicListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if(listener!= null){
            listener.onClick(view);
        }
    }

    public void setAnimalData(Animal animal, ViewHolder holder){
        String descripcionRecortada = animalService.substringAnimalDescription(context.getString(animal.getDescripcion()), 100);
        holder.tvNombreAnimal.setText(animal.getNombre());
        holder.tvDescripcionAnimal.setText(descripcionRecortada);
        holder.imvIcAnimal.setImageResource(animal.getIcono());
    }
}
