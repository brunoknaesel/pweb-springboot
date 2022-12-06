package projeto.web.beytrabalho3.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;

@Entity
@Table(name = "aula")
public class Aula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private String tipoAula;
	@Column(name = "categoria")
	private String categoria;
	@Column(name = "instrutor")
	private String instrutor;
	@Column(name = "dataAula")
	private Date dataAula;

	private String horarioAula;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public Usuario getAlunoAula() {
//		return alunoAula;
//	}

//	public void setAlunoAula(Usuario alunoAula) {
//		this.alunoAula = alunoAula;
//	}

	public String getHorarioAula() {
		return horarioAula;
	}

	public String getTipoAula() {
		return tipoAula;
	}

	public void setTipoAula(String tipoAula) {
		this.tipoAula = tipoAula;
	}

	public void setHorarioAula(String horarioAula) {
		this.horarioAula = horarioAula;
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

	public Date getDataAula() {
		return dataAula;
	}

	public void setDataAula(Date data) {
		this.dataAula = data;
	}
}
