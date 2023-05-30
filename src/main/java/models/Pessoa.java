package models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
	@NonNull
	private String nome;
	@NonNull
	private String sintoma;
	private List<String> alergia;
	private List<Remedio> remedios ;

	public Pessoa(String nome, String sintoma, List<String> alergia) {
		this.alergia = alergia;
		this.nome = nome;
		this.sintoma = sintoma;
		this.remedios = new ArrayList<>();
	}

}
