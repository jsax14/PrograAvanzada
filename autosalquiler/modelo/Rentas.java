package com.jd.hn.autosalquiler.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity @Getter @Setter
public class Rentas {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Hidden
    @Column(length = 36)
    String oid;

    LocalDate fechaDeInicioDeAlquiler;
    LocalDate fechaDeFinDeAlquiler;

    @Column
    String nombreDeCliente;

    @Column
    String telefono;

}
