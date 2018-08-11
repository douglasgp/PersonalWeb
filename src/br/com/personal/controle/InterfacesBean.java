package br.com.personal.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class InterfacesBean {
	private String opcao = "Simples";

	public String principal() {
		if (this.opcao.equals("Avançada")) {
			return "interface-avancada.xhtml";
		} else {
			return "interface-simples.xhtml";
		}
	}

	public String getOpcao() {
		return opcao;
	}

	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}

}
