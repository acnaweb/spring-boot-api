package br.com.marketmining.spring_boot_api.model;

public enum DiretoriaEnum {
	EIS("E.I.S"), RECUPERACAO("Recuperação"), NEGOCIO("Negócios");

	private String descricao;

	private DiretoriaEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
