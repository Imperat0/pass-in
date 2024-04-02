package rocketseat.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.passin.domain.checkin.Checkin;

public interface CheckInRepository extends JpaRepository<Checkin, Integer> {
}
