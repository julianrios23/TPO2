package com.julian.tpo2;

import androidx.lifecycle.ViewModel;
import com.julian.tpo2.Book.Libros;
import java.util.ArrayList;
import java.util.List;

public class MainViewModelActivity extends ViewModel {
    private List<Libros> librosList;

    public MainViewModelActivity() {
        librosList = new ArrayList<>();
        librosList.add(new Libros("Programación multimedia y dispositivos móviles", "Jacinto D. Cabrera Rodríguez", "2024", R.drawable.programacion_multimedia));
        librosList.add(new Libros("Clean Code", "Robert C. Martin", "2008", R.drawable.clean_code));
        librosList.add(new Libros("Cien años de soledad", "Gabriel García Márquez", "1967", R.drawable.cien_anos_de_soledad));
        librosList.add(new Libros("El arte de la guerra", "Sun Tzu", "500 a.C.", R.drawable.el_arte_de_la_guerra));
        librosList.add(new Libros("Don Quijote de la Mancha", "Miguel de Cervantes", "1605", R.drawable.don_quijote_de_la_mancha));
        librosList.add(new Libros("Sapiens: De animales a dioses", "Yuval Noah Harari", "2011", R.drawable.sapiens_de_animales_a_dioses));
        librosList.add(new Libros("Cronica de una muerte anunciada", "Gabriel García Márquez", "1981", R.drawable.cronica_de_una_muerte_anunciada));
        librosList.add(new Libros("El señor de los anillos", "J.R.R. Tolkien", "1954", R.drawable.el_senor_de_los_anillos));
        librosList.add(new Libros("Padre rico, padre pobre", "Robert T. Kiyosaki", "1997", R.drawable.padre_rico_padre_pobre));
        librosList.add(new Libros("Introducción a los algoritmos", "Thomas H. Cormen", "1990", R.drawable.introduccion_a_los_algoritmos));


        }
    public Libros buscarLibro(String titulo, String autor, String anio) {
        for (Libros libro : librosList) {
            if (titulo != null && titulo.length() >= 4 &&
                    libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return libro;
            }
            if (autor != null && autor.length() >= 4 &&
                    libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                return libro;
            }
            if (anio != null && anio.length() >= 4 &&
                    libro.getAnio().toLowerCase().contains(anio.toLowerCase())) {
                return libro;
            }
        }
        return null;
    }

}
