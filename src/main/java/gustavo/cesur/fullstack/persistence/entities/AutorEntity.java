package gustavo.cesur.fullstack.persistence.entities;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Autor")
public class AutorEntity {

private Long id;

private String nombre;

private String nacionalidad;

@OneToMany(mappedBy = "autor")

private List<LibroEntity> libros = new ArrayList<>();

public void setAutor(String libro) {
	// TODO Auto-generated method stub
	
}

}