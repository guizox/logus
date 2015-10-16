package Beans;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import DAO.FuncionariosDAO;
import Objects.Funcionario;

@ManagedBean
@ViewScoped
public class FuncionariosBean {

	public List<Funcionario> getAllFuncionarios() throws SQLException{
		return new FuncionariosDAO().getFuncionario();
	}
}
	