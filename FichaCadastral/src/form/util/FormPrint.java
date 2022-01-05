package form.util;

import form.model.Formulario;

public class FormPrint {
public String imprimir(Formulario registro) {
		
		StringBuilder cupom = new StringBuilder();
		cupom.append("----------------------------- FICHA PROFISSIONAL -----------------------------\n");
		cupom.append("\n");
		cupom.append(String.format("%-12s%s\n","PROFISSÃO: ",registro.getProfissao()));
		cupom.append("\n");
		cupom.append(String.format("%-11s%s\n","NOME: ",registro.getNome()));
		cupom.append("\n");
		cupom.append(String.format("%-5s%s","SALÁRIO REQUERIDO:  MÍNIMO: ",FormaterUtil.moeda(registro.getSalarioMin())));
		cupom.append(String.format("%23s%s\n","MÁXIMO: ",FormaterUtil.moeda(registro.getSalarioMax())));
		cupom.append("\n");
		cupom.append(String.format("%10s%s","DATA NASC: ",FormaterUtil.data(registro.getDataNascimento())));
		cupom.append(String.format("%10s%s","CPF: ",FormaterUtil.cpf(registro.getCpf())));
		cupom.append(String.format("%10s%s\n","RG:", FormaterUtil.rg(registro.getRg())));
		cupom.append("\n");
		cupom.append(String.format("%-11s%s\n","ENDEREÇO: ",registro.getEndereco()));
		cupom.append("\n");
		cupom.append(String.format("%-2s%s","N: ",registro.getNumeroCasa()));
		cupom.append(String.format("%13s%s","BAIRRO: ",registro.getBairro()));
		cupom.append(String.format("%16s%s","MUNICÍPIO: ",registro.getMunicipio()));
		cupom.append(String.format("%12s%s\n","UF: ",registro.getUf()));
		cupom.append("\n");
		cupom.append(String.format("%-2s%s","CEP: ",FormaterUtil.cep(registro.getCep())));
		cupom.append(String.format("%20s%s","NATURALIDADE: ",registro.getNaturalidade()));
		cupom.append(String.format("%16s%s\n","PAÍS: ",registro.getPais()));
		cupom.append("\n");
		cupom.append(String.format("%-4s%s","TELEFONE: ",FormaterUtil.formataTelefone(registro.getTelefone())));
		cupom.append(String.format("%26s%s\n","CELULAR: ",FormaterUtil.formataTelefone(registro.getCelular())));
		cupom.append("\n");
		cupom.append(String.format("%-11s%s\n","EMAIL: ",registro.getEmail()));
		
		cupom.append("------------------------------------------------------------------------------\n");
		
		
		System.out.println(cupom);
		return cupom.toString();
	}
}
