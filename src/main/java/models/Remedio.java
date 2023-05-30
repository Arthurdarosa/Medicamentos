package models;

import java.util.List;

import enums.EnumAdministracao;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Remedio {
	@NonNull
	private String nome;
	private List<String>fazMal;
	@NonNull
	private List<String>indicado;
	@NonNull
	private EnumAdministracao administracao;

	public Remedio(String nome, List<String> fazMal, List<String> indicado, EnumAdministracao administracao) {
		this.nome = nome;
		this.fazMal = fazMal;
		this.indicado = indicado;
		this.administracao = administracao;
	}
}
