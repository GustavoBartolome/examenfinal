package gustavo.cesur.fullstack.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import gustavo.cesur.fullstack.dominio.AutorDTO;
import gustavo.cesur.fullstack.persistence.entities.LibroEntity;
import gustavo.cesur.fullstack.persistence.entities.AutorEntity;


@Mapper(componentModel = "spring")
public interface AutorMapper {
    
	@Mapping(source = "libro", target = "libroId", qualifiedByName = "mapLibroId")
    AutorDTO toDto(Object autor);

	AutorEntity toEntity(AutorDTO autorDTO);

    @Named("mapLibroId")
    default Long mapCursoId(LibroEntity libro) {
        if (libro == null) {
            return null;
        }
        return libro.getLibroId();
    }

	AutorDTO toDto(AutorEntity estE);

	AutorEntity toEntity1(AutorDTO autorDTO);
	
}