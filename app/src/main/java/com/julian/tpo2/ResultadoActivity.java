package com.julian.tpo2;

import android.os.Bundle;
import com.julian.tpo2.Book.Libros;
import com.julian.tpo2.databinding.ActivityResultadoBinding;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {
    private ActivityResultadoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultadoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Libros libro = (Libros) getIntent().getSerializableExtra("libro");
        if (libro != null) {
            binding.tvTitulo.setText("Título: " + libro.getTitulo());
            binding.tvAutor.setText("Autor: " + libro.getAutor());
            binding.tvAnio.setText("Año: " + libro.getAnio());
            if (libro.getPortadaResId() != 0) {
                binding.ivPortada.setImageResource(libro.getPortadaResId());
            } else {
                binding.ivPortada.setImageResource(android.R.color.transparent);
            }
        } else {
            binding.tvTitulo.setText("Libro no encontrado");
            binding.tvAutor.setText("");
            binding.tvAnio.setText("");
            binding.ivPortada.setImageResource(android.R.color.transparent);
        }
    }
}