package form.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import form.model.Formulario;

public class LeitorRemessa {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
private List <String> ler(String caminhoArquivo) {
		
		try {
			List <String> DadosForm = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);
			return DadosForm;
			
		}catch( IOException e){
			e.printStackTrace();
			
		}
		
		return null; 
		
	}
	
	public List <Formulario> converter (String caminhoArquivo) {
		List <String> conteudos = ler(caminhoArquivo);
		List <Formulario> formularios = new ArrayList();
		
		for(String linha:conteudos) {
			String[] campos = linha.split(";");
			Formulario f = new Formulario();
			
			f.setProfissao(campos[1]);
	    	f.setNome(campos[2]);
	    	f.setSalarioMin(Double.valueOf(campos[3]));
	    	f.setSalarioMax(Double.valueOf(campos[4]));
	    	
	    	String date = campos[5];
			LocalDate data = LocalDate.parse(date,formatter);
			f.setDataNascimento(data);
		    	
	    	f.setCpf(campos[6]);
	    	f.setRg(campos[7]);
	    	f.setEndereco(campos[8]);
	        
	    	String numero = campos [9];
	        Integer  number =  Integer.parseInt(numero);
	        f.setNumeroCasa(number);
				
	    	f.setBairro(campos[10]);
	    	f.setMunicipio(campos[11]);
	    	f.setUf(campos[12]);
	    	f.setCep(campos[13]);
	    	f.setNaturalidade(campos[14]);
	    	f.setPais(campos[15]);
	    	f.setTelefone(campos[16]);
	    	f.setCelular(campos[17]);
	        f.setEmail(campos[18]);
					
			
			formularios.add(f);
			
		}
		
		return formularios;
	}

}
