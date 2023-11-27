package gustavo.cesur.fullstack.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import gustavo.cesur.fullstack.dominio.LibroDTO;
import gustavo.cesur.fullstack.persistence.entities.LibroEntity;
import gustavo.cesur.fullstack.persistence.entities.AutorEntity;

@Mapper(componentModel = "spring", uses = {AutorMapper.class})
public interface LibroMapper {
	
	//@Mapping(target = "estudiantes", ignore = true)
    LibroDTO toDto(LibroEntity libro);
    LibroEntity toEntity(LibroDTO libroDTO);
    
    @Mapping(target = "estudiantes", ignore = true)
   LibroDTO toDtoWithoutStudents(LibroEntity libro);
}