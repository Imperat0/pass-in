package rocketseat.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.passin.domain.checkin.Checkin;

import java.util.Optional;

public interface CheckInRepository extends JpaRepository<Checkin, Integer> {
    Optional<Checkin> findByAttendeeId(String attendeeId);
}
