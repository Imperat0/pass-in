package rocketseat.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.passin.domain.attendee.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
}
