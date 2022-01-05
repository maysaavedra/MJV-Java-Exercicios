package form.model;

public enum GrauInstrucao {
	ANALFABETO("analfabeto"),
	LE_ESCREVE("leEscreve"),
	FUNDAMENTAL_INCOMPLTO("fundamentalIncompleto"),
	ENSINO_FUNDAMENTAL("ensinoFundamental"),
	ENSINO_MEDIO_INCOMPLETO("ensinoMedioIncompleto"),
	ENSINO_MEDIO_COMPLETO("ensinoMedioCompleto"),
	SUPERIOR("superior"),
	MESTRADO("mestrado"),
	DOUTORADO("doutorado");
	
	private String descricao;

	GrauInstrucao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	

}
