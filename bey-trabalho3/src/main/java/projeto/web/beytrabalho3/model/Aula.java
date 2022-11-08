package projeto.web.beytrabalho3.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "aula")
public class Aula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "tipoAula")
	private boolean tipoAula;
//	@Column(name = "aluno")
//	private Usuario alunoAula;
	@Column(name = "categoria")
	private String categoria;
	@Column(name = "instrutor")
	private String instrutor;
	@Column(name = "data")
	private Date data;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Usuario getAlunoAula() {
//		return alunoAula;
//	}

//	public void setAlunoAula(Usuario alunoAula) {
//		this.alunoAula = alunoAula;
//	}

	public boolean getTipoAula() {
		return tipoAula;
	}

	public void setTipoAula(boolean tipoAula) {
		this.tipoAula = tipoAula;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
