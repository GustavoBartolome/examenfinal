package gustavo.cesur.fullstack.dominio;

import java.util.List;
import java.util.ArrayList;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorDTO {

private Long id;

private String nombre;

private String nacionalidad;

private List<LibroDTO> libros = new ArrayList<>();

public Object getLibroId() {
	// TODO Auto-generated method stub
	return null;
}

public static Long getAutorId() {
	// TODO Auto-generated method stub
	return null;
}

}