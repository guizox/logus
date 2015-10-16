package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Objects.Funcionario;

public class FuncionariosDAO {
	private ArrayList<Funcionario> array = new ArrayList<Funcionario>();
	public ArrayList<Funcionario> getFuncionario() throws SQLException {
		ConnectionInformix connectionInformix = new ConnectionInformix();
		ResultSet rs = connectionInformix.getSet("select u.dcr_nome, u.dcr_email, d.dcr_departamento_usuario " +
												 "  from usuarios u" +
												 "  left outer join departamentosusuario d" +
												 "    on d.iddepartamentousuario = u.iddepartamentousuario" +
												 " where u.dat_desativacao is null" +
												 "   and dcr_departamento_usuario is not null" +
												 " order by d.dcr_departamento_usuario");
		while (rs.next()){
			Funcionario fun = new Funcionario(rs.getString(1), rs.getString(2), rs.getString(3));
			array.add(fun);
		}
		connectionInformix.fecharConexao();
		return array;
	}
}
