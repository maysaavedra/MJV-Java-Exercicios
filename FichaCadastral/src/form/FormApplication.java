package form;

import java.util.List;


import form.model.Formulario;
//import form.model.GrauInstrucao;
//import form.repository.*;
//import form.service.PreencherFicha;
import form.util.FormPrint;
//import form.util.GravarDados;
import form.util.LeitorRemessa;

public class FormApplication {

	public static void main(String[] args) {
		LeitorRemessa leitor = new LeitorRemessa();
		
		List<Formulario> registros = leitor.converter("C:\\Users\\mayar\\Desktop\\MJV-JAVA\\Exercicio Ficha Cadastral\\FichaCadastral\\Form.txt");
		
		FormPrint printer = new FormPrint();
		printer.imprimir(registros.get(0));
		printer.imprimir(registros.get(1));
		printer.imprimir(registros.get(2));
		
		
		
//		FormularioRepository repository = new FormularioRepository();		
//
//		Formulario form = new Formulario();
//		
//		form.setId(1);
//		form.setProfissao("Desenvolvedora");
//		form.setNome("Mayara");
//		form.setSalarioMin(2000.55);
//		form.setSalarioMax(30000.00);
//		form.setDataNascimento(null);
//		form.setCpf("123456789333");		
//		form.setRg("416539725");
//		form.setEndereco("Rua Conde de Porto Alegre");
//		form.setNumeroCasa(1864);
//		form.setBairro("Campo Belo");
//		form.setMunicipio("SÃO PAULO");
//		form.setUf("SP");
//		form.setCep("04608003");
//		form.setNaturalidade("Pirassununga");
//		form.setPais("Brasil");
//		form.setTelefone("1155559876");
//		form.setCelular("11982753125");
//		form.setEmail("mayara.saavedra@gmail.com");
//		form.setGrauinstrucao(GrauInstrucao.SUPERIOR);;
//		
//		repository.adicionarFormularios(form);
//	
//		
//		Set<Formulario> formularios = repository.getFormularios();
//		
//		System.out.println(formularios);	
//		
//		GravarDados gd = new GravarDados();
//		gd.abrir();
//		gd.escrever(formularios);
//		gd.fechar();
	}

}
