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
	private boolean ehPratica;
	private boolean ehTeorica;
//	@Column(name = "aluno")
//	private Usuario alunoAula;
	@Column(name = "categoria")
	private String categoria;
	@Column(name = "instrutor")
	private String instrutor;
	@Column(name = "data")
	private Date data;

	
	
	public Aula(boolean ehPratica, boolean ehTeorica, String categoria, String instrutor, Date data) {
		super();
		this.ehPratica = ehPratica;
		this.ehTeorica = ehTeorica;
		this.categoria = categoria;
		this.instrutor = instrutor;
		this.data = data;
	}

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

	public String getCategoria() {
		return categoria;
	}

	public boolean isEhPratica() {
		return ehPratica;
	}

	public void setEhPratica(boolean ehPratica) {
		this.ehPratica = ehPratica;
	}

	public boolean isEhTeorica() {
		return ehTeorica;
	}

	public void setEhTeorica(boolean ehTeorica) {
		this.ehTeorica = ehTeorica;
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
