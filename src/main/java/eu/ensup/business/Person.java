package eu.ensup.business;

import lombok.*;

import javax.persistence.*;

/**
 * The type Person.
 */
@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends EntityBody {

    private String uniqueId;
    @Column(nullable = false, updatable= false)
    private String firstname;
    @Column(nullable = false, updatable= false)
    private String password;
    private Role role;

}
