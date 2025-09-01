package com.julian.tpo2;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.julian.tpo2.Book.Libros;
import com.julian.tpo2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainViewModelActivity viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModelActivity.class);

        binding.btnBusqueda.setOnClickListener(v -> {
            String busqueda = binding.etCampoBusqueda.getText().toString().trim();
            Libros libro = viewModel.buscarLibro(busqueda, busqueda, busqueda);
            Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
            intent.putExtra("libro", libro);
            startActivity(intent);
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.etCampoBusqueda.setText("");//limpio el campo de busqueda
    }
}