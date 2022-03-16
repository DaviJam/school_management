package eu.ensup.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntityBodyDTO {
    private Long id;
    private String lastname;
    private String telephone;
    private String address;
    private String email;
}
