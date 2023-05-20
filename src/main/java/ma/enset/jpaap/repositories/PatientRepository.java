package ma.enset.jpaap.repositories;

import ma.enset.jpaap.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
/*public List<Patient> findByMalade(boolean m);
 Page<Patient> findByMalade(boolean m, Pageable pageable);
 List<Patient> findByMaladeIsTrueAndScoreLessThan(int score);

 @Query("select p from Patient p where p.nom like :x  and p.score<:y")
List<Patient> chercherPatient(@Param("x") String nom, @Param("y") int scoreMin);*/
}
