package eu.ensup.dto;

import eu.ensup.business.Role;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO extends EntityBodyDTO {
    private String uniqueId;
    private String firstname;
    private Role role;
    private String password;
}
