package br.com.personal.modelo;

import java.util.Date;

public class Vagas {

	private Long id;
	private String tituloVaga;
	private Double salario;
	private String localidade;
	private String funcao;
	private String exigencia;
	private Boolean status;
	private String empresa;
	private Date data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTituloVaga() {
		return tituloVaga;
	}

	public void setTituloVaga(String tituloVaga) {
		this.tituloVaga = tituloVaga;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getExigencia() {
		return exigencia;
	}

	public void setExigencia(String exigencia) {
		this.exigencia = exigencia;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
