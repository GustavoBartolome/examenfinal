package gustavo.cesur.fullstack.persistence.entities;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LibroEntity {

private Long id;

private String titulo;

private String isbn;

private BigDecimal precio;

@ManyToOne

@JoinColumn(name = "autor_id")

private AutorEntity autor;

public Long getLibroId() {
	// TODO Auto-generated method stub
	return null;
}

}