package ma.mundiapolis.tp3_hospital.repositories;

import ma.mundiapolis.tp3_hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
