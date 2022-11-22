package projeto.web.beytrabalho3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.web.beytrabalho3.model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {

}
