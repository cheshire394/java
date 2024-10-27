package delSazAlicia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;




public class Juguetes implements Comparable<Juguetes> {
	
	
		//ATRIBUTOS
		protected int codigo_unico;
		protected String marca;
		protected int edad_recomendada;
		protected int [] dimensiones = new int[3];
		protected String descripcion; 
		protected int unidades;
		
		
		
		// CONSTRUCTORES
		public Juguetes() {
			super();
		} 
		public Juguetes(int codigo_unico, String marca, int edad_recomendada, int[] dimensiones, String descripcion,
				int unidades) {
			super();
			this.codigo_unico = codigo_unico;
			this.marca = marca;
			this.edad_recomendada = edad_recomendada;
			this.dimensiones = dimensiones;
			this.descripcion = descripcion;
			this.unidades = unidades;
		}
		
		
		
		
		public int getCodigo_unico() {
			return codigo_unico;
		}
		public void setCodigo_unico(int codigo_unico) {
			this.codigo_unico = codigo_unico;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public int getEdad_recomendada() {
			return edad_recomendada;
		}
		public void setEdad_recomendada(int edad_recomendada) {
			this.edad_recomendada = edad_recomendada;
		}
		public int[] getDimensiones() {
			return dimensiones;
		}
		public void setDimensiones(int[] dimensiones) {
			this.dimensiones = dimensiones;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public int getUnidades() {
			return unidades;
		}
		public void setUnidades(int unidades) {
			this.unidades = unidades;
		}
		
/*		
		@Override
		public int compareTo(Juguetes otro) {
			
			return this.getCodigo_unico().compareTo(otro.getCodigo_unico());
		}
		*/
		
		
		
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(dimensiones);
			result = prime * result + Objects.hash(codigo_unico, descripcion, edad_recomendada, marca, unidades);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Juguetes other = (Juguetes) obj;
			return codigo_unico == other.codigo_unico && Objects.equals(descripcion, other.descripcion)
					&& Arrays.equals(dimensiones, other.dimensiones) && edad_recomendada == other.edad_recomendada
					&& Objects.equals(marca, other.marca) && unidades == other.unidades;
		}
		@Override
		public String toString() {
			return "Juguetes [codigo_unico=" + codigo_unico + ", marca=" + marca + ", edad_recomendada="
					+ edad_recomendada + ", dimensiones=" + Arrays.toString(dimensiones) + ", descripcion="
					+ descripcion + ", unidades=" + unidades + "]";
		}
		
		
		
	
	
	
	
	
	
	
	
	
	

}
