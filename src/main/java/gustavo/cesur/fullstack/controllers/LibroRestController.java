package gustavo.cesur.fullstack.controllers;

import java.net.URI;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import gustavo.cesur.fullstack.dominio.LibroDTO;
import gustavo.cesur.fullstack.dominio.AutorDTO;
import gustavo.cesur.fullstack.services.LibroService;

@RestController
@RequestMapping("/cursos")
public class LibroRestController {

	@Autowired
	LibroService cursoService;

	@PostMapping
	ResponseEntity<?> createCourse(@RequestBody LibroDTO cursoDTO) {

		LibroDTO curso = cursoService.createCourse(cursoDTO);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + curso.getLibroId())
				.buildAndExpand(curso.getLibroId()).toUri();

		return ResponseEntity.created(location).build();

	}

	@GetMapping("/{cursoId}")
	ResponseEntity<?> getCourse(@PathVariable Long cursoId) {

		return ResponseEntity.ok(cursoService.getCurso(cursoId));
	}

}