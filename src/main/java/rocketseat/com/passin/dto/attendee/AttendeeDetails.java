package rocketseat.com.passin.dto.attendee;

import java.time.LocalDateTime;

public record AttendeeDetails(String id, String name, String Email, LocalDateTime createdAt, LocalDateTime checkedInAt) {
}
