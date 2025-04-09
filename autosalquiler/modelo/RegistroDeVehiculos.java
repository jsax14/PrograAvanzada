package com.jd.hn.autosalquiler.modelo;

import java.math.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

/**
 * Esto es un ejemplo de una entidad.
 * 
 * Siéntete libre de renombrarla, modificarla o borrarla a tu gusto.
 */

@Entity @Getter @Setter
public class RegistroDeVehiculos {
	@Id
	@Column(length = 7)
	String numeroDePlaca;

	@Column(length = 15)
	String modelo;

	LocalDate fecha;

	@Required
	@Column(length = 1)
	BigDecimal estadoDeVehiculo;

	@TextArea
	@Column(length=500)
	String observaciones;
	
}
