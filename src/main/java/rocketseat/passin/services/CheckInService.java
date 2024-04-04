package rocketseat.passin.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rocketseat.passin.domain.attendee.Attendee;
import rocketseat.passin.domain.checkin.Checkin;
import rocketseat.passin.domain.checkin.exceptions.CheckInAlreadyExistsException;
import rocketseat.passin.repositories.CheckInRepository;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CheckInService {
    private final CheckInRepository checkInRepository;

    public void registerCheckIn(Attendee attendee) {
        this.veriFyCheckInExists(attendee.getId());
        Checkin newCheckIn = new Checkin();
        newCheckIn.setAttendee(attendee);
        newCheckIn.setCreatedAt(LocalDateTime.now());
        this.checkInRepository.save(newCheckIn);
    }

    private void veriFyCheckInExists(String attendeId) {
        Optional<Checkin> IscheckedIn = this.getCheckIn(attendeId);
        if (IscheckedIn.isPresent()) throw new CheckInAlreadyExistsException("Attende already exists");
    }

    public Optional<Checkin> getCheckIn(String attendeeId) {
        return this.checkInRepository.findByAttendeeId(attendeeId);
    }
}
