package rocketseat.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.passin.domain.events.Event;

public interface EventRepository extends JpaRepository<Event, String> {

}
