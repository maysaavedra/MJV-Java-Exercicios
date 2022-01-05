package form.repository;

import java.util.HashSet;
import java.util.Set;

import form.model.Formulario;

public class FormularioRepository {
	private Set <Formulario> formularios = new HashSet<Formulario>();
	
	
	public void adicionarFormularios(Formulario formulario) {
		formularios.add(formulario);
	}
	
	public void RemoverFormulariosByName(Formulario formulario) {
		formularios.remove(formulario);
	}
	public Set <Formulario> getFormularios() {
		return formularios;
	}
}

