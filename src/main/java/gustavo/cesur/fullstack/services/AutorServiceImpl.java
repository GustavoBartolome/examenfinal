package gustavo.cesur.fullstack.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gustavo.cesur.fullstack.dominio.AutorDTO;
import gustavo.cesur.fullstack.dominio.LibroDTO;
import gustavo.cesur.fullstack.mappers.AutorMapper;
import gustavo.cesur.fullstack.persistence.entities.LibroEntity;
import gustavo.cesur.fullstack.persistence.entities.AutorEntity;
import gustavo.cesur.fullstack.persistence.repositories.LibroRepository;
import gustavo.cesur.fullstack.persistence.repositories.AutorRepository;
import gustavo.cesur.fullstack.mappers.AutorMapper;
import gustavo.cesur.fullstack.persistence.repositories.AutorRepository;
import gustavo.cesur.fullstack.persistence.repositories.LibroRepository;
import jakarta.transaction.Transactional;

@Service
public class AutorServiceImpl  implements LibroService{
	
	private static final String Libro = null;
	@Autowired
	AutorRepository autorRepository;
	@Autowired
	AutorMapper autorMapper;
	@Autowired
	LibroRepository libroRepository;


	public AutorDTO createAutor(AutorDTO autorDTO) {
		
		AutorEntity estE = autorRepository.save(((AutorMapper) autorMapper).toEntity(autorDTO));
		return autorMapper.toDto(estE);
	}
	
	

	@Transactional
	public AutorDTO createAutorWhithLibro(AutorDTO autorDTO) {
		AutorEntity estudiante = autorMapper.toEntity(autorDTO);
	    
		Object autor;
		if (autorDTO.getLibroId() != null) {
	        LibroEntity curso = libroRepository.findById(AutorDTO.getAutorId())
	                            .orElseThrow(() -> new RuntimeException("curso no encontrado"));
	        
	        Object libro;
			((AutorEntity) autor).setAutor(libro);
	    }
		
	    autor = autorRepository.save(autor);
	    return autorMapper.toDto(autor);
	}
	

	public AutorDTO inscribirAutorAunLibro(Long autorId, Long libroId) {
		
		AutorEntity autor = autorRepository.findById(autorId)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

        LibroEntity curso = libroRepository.findById(libroId)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));

        autor.setAutor(Libro);
        autor = autorRepository.save(autor);
        
        return autorMapper.toDto(autor);
		
	}



	@Override
	public LibroDTO createCourse(LibroDTO libroDTO) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public LibroDTO getCurso(Long libroId) {
		// TODO Auto-generated method stub
		return null;
	}

	


}