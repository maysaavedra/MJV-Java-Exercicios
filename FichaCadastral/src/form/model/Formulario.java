package form.model;

import java.time.LocalDate;

public class Formulario {
	private int id;
	private String profissao;
	private String nome;
	private Double SalarioMin;
	private Double SalarioMax;
	private LocalDate dataNascimento;
	private String cpf;
	private String rg;
	private String endereco;
	private Integer numeroCasa;
	private String bairro;
	private String municipio;
	private String uf;
	private String cep;
	private String naturalidade;
	private String pais;
	private String telefone;
	private String celular;
	private String email;
	private GrauInstrucao grauinstrucao;
	
	
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalarioMin() {
		return SalarioMin;
	}
	public void setSalarioMin(Double salarioMin) {
		SalarioMin = salarioMin;
	}
	public Double getSalarioMax() {
		return SalarioMax;
	}
	public void setSalarioMax(Double salarioMax) {
		SalarioMax = salarioMax;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(Integer numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public GrauInstrucao getGrauinstrucao() {
		return grauinstrucao;
	}
	public void setGrauinstrucao(GrauInstrucao grauinstrucao) {
		this.grauinstrucao = grauinstrucao;
	}
	@Override
	public String toString() {
		return    id + ";" + profissao +";" + nome+";" + SalarioMin+";" + SalarioMax+";"
				+ dataNascimento+";" + cpf+";" + rg+";" +  endereco+";"
				+ numeroCasa+";" + bairro+";" +  municipio+";" + uf+";"
				+ cep+";" + naturalidade+";" +  pais+";" + telefone+";"
				+  celular+";" +  email+";" +  grauinstrucao +";";
	}
	
	
	
	

}
