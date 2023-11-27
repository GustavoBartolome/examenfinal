package gustavo.cesur.fullstack.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gustavo.cesur.fullstack.dominio.LibroDTO;
import gustavo.cesur.fullstack.mappers.LibroMapper;
import gustavo.cesur.fullstack.persistence.entities.LibroEntity;
import gustavo.cesur.fullstack.persistence.repositories.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	public LibroRepository cursoRepository;
	@Autowired
	public LibroMapper cursoMapper;
	

	@Override
	public LibroDTO createCourse(LibroDTO libroDTO) {

		LibroMapper libroMapper = null;
		return libroMapper.toDto(cursoRepository.save(libroMapper.toEntity(libroDTO)));
	}


	@Override
	public LibroDTO getCurso(Long cursoId) {
		
		LibroEntity cursoE = cursoRepository.findById(cursoId)
				.orElseThrow(() -> new RuntimeException("Curso no encontrado"));
		
		LibroMapper libroMapper = null;
		return libroMapper.toDto(cursoE);
	}


}