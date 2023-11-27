package gustavo.cesur.fullstack.dominio;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroDTO {

private Long id;

private String titulo;

private String isbn;

private BigDecimal precio;

private Long autorId;

public Object getLibroId() {
	// TODO Auto-generated method stub
	return null;
}

public Object getLibroId1() {
	// TODO Auto-generated method stub
	return null;
}

}