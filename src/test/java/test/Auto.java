package test;

public class Auto {

		String modelo;
		int precio;
		Asiento [] asientos;
		int registro;
		String marca;
		Motor motor;
		static int cantidadCreados;
		int cantidadAsientos() {
			int numeroAsientos = 0;
			for(int i = 0 ; i < asientos.length ; i++) {
				if(asientos[i] != null){
				numeroAsientos++;	
				}
			}
			return numeroAsientos;
		}
		String verificarIntegridad() {
			if(this.registro == this.motor.registro) {
				for(int a = 0; a < asientos.length; a++) {
					if(asientos[a] != null && asientos[a].registro != registro) {
						return "Las piezas no son originales";
					}
				}
				return "Auto original";
			}
			else {return "Las piezas no son originales";}
		}
	}

