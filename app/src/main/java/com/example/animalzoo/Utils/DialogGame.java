package com.example.animalzoo.Utils;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.animalzoo.HomeActivity;
import com.example.animalzoo.Interfaces.IDialogGameListener;
import com.example.animalzoo.JuegoActivity;

public class DialogGame extends AppCompatDialogFragment {
    private IDialogGameListener listener;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Has agotado tus vidas")
                .setMessage("¿Deseas continuar?")
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        listener.okOptionGameState(0, 5);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getActivity(), HomeActivity.class);
                        listener.cancelOptionGameState(intent);
                    }
                });
        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (IDialogGameListener) context;
        } catch (ClassCastException e){
            throw new ClassCastException(context.toString() + "Deberia implementar IDialogGameListener");
        }
    }
}
