package gustavo.cesur.fullstack.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gustavo.cesur.fullstack.persistence.entities.AutorEntity;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity, Long>{

}


