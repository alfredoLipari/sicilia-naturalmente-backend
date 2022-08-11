package it.elis.sicilianaturalmente.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
@Accessors(chain = true)
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTest", nullable = false)
    private Long idTest;

    @Column(name = "titolo",unique=true,nullable = false)
    private String titolo;

}
