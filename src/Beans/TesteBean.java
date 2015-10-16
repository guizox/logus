package Beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TesteBean {
	private String teste;

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	public void imprimir(){
		System.out.println(getTeste());
	}
}
