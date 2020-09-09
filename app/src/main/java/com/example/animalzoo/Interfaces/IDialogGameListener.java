package com.example.animalzoo.Interfaces;

import android.content.Intent;

public interface IDialogGameListener {
    public void okOptionGameState(Integer puntos, Integer vidas);
    public void cancelOptionGameState(Intent intent);
}
