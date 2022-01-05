package form.service;



import form.model.Formulario;
import form.model.GrauInstrucao;
import form.repository.FormularioRepository;

public class PreencherFicha {
	
	

	public void novoFormulario() {
		
		FormularioRepository repository = new FormularioRepository();
		Formulario form = new Formulario();
		
		form.setId(1);
		form.setProfissao("Desenvolvedora");
		form.setNome("Mayara");
		form.setSalarioMin(2000.55);
		form.setSalarioMax(30000.00);
		form.setDataNascimento(null);
		form.setCpf("123456789333");		
		form.setRg("416539725");
		form.setEndereco("Rua Conde de Porto Alegre");
		form.setNumeroCasa(1864);
		form.setBairro("Campo Belo");
		form.setMunicipio("São Paulo");
		form.setUf("SP");
		form.setCep("04608003");
		form.setNaturalidade("Pirassununga");
		form.setPais("Brasil");
		form.setTelefone("1155559876");
		form.setCelular("11982753125");
		form.setEmail("mayara.saavedra@gmail.com");
		form.setGrauinstrucao(GrauInstrucao.SUPERIOR);;
	
		repository.adicionarFormularios(form);
	
	}

}
