package eu.ensup.dto;

import lombok.*;

import java.time.LocalDateTime;

/**
 * The type Student dto.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO extends PersonDTO{
    private LocalDateTime dateOfBirth;
}
