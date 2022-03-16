package eu.ensup.business;

import eu.ensup.dto.EntityBodyDTO;
import lombok.*;

import javax.persistence.*;

/**
 * The type School.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class School extends EntityBody
{

    private Integer director;
}
