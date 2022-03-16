package eu.ensup.business;

import lombok.*;

import javax.persistence.*;

/**
 * The type Entity body.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class EntityBody {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable= false)
    private Long id;
    @Column(nullable = false, updatable= false)
    private String lastname;
    @Column(nullable = false, updatable= false)
    private String telephone;
    @Column(nullable = false, updatable= false)
    private String address;
    @Column(nullable = false, updatable= false)
    private String email;
}
