package atoms.work.demobatch.jpa;

import org.springframework.data.repository.Repository;

import java.util.Optional;
public interface PersonRepository extends Repository<PersonEntity, Long> {

    PersonEntity save(PersonEntity person);

    Optional<PersonEntity> findById(long id);
}
