package Beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean 
@ViewScoped
public class LoginBean {
	private String user;
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void Login() {
		System.out.println(user);
	}

//	public void Logar(FacesContext fc, UIComponent u, Object value)
//			throws ValidatorException {
//		if (this.usuario.user.isEmpty() || this.usuario.password.isEmpty()) {
//			throw new ValidatorException(new FacesMessage("Deveria come�ar com 1"));
//		} else {
//			throw new ValidatorException(new FacesMessage("Logado com sucesso"));
//		}
//	}
}