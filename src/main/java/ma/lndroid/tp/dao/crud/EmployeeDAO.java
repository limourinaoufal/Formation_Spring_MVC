package main.java.ma.lndroid.tp.dao.crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import main.java.ma.lndroid.tp.beans.crud.Employee;

public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int save(Employee p){
		String sql = "INSERT INTO EMPLOYEE ( NAME , SALARY , DESIGNATION ) VALUES(?,?,?)";
		return jdbcTemplate.update(sql, p.getName(),p.getSalary(),p.getDesignation());
	}
	
	public int update(Employee p){    
	    String sql="UPDATE EMPLOYEE SET  NAME=?,SALARY=?,DESIGNATION=?  WHERE ID=?";    
	    return jdbcTemplate.update(sql,p.getName(),p.getSalary(),p.getDesignation(),p.getId());    
	}  
	
	public int delete(int idP){    
	    String sql="DELETE FROM EMPLOYEE WHERE ID=? ";    
	    return jdbcTemplate.update(sql,idP);    
	}  
	
	public Employee getEmpById(int idP){    
	    String sql="SELECT * FROM EMPLOYEE where id=?";    
	    return jdbcTemplate.queryForObject(sql, new Object[]{idP},new BeanPropertyRowMapper<Employee>(Employee.class));    
	}    
	
	public List<Employee> getEmployees(){
		return jdbcTemplate.query("SELECT * FROM EMPLOYEE", new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId((rs.getInt("ID")));
				e.setName((rs.getString("NAME")));
				e.setSalary((rs.getDouble("SALARY")));
				e.setDesignation((rs.getString("DESIGNATION")));
				return e;
			}
			
		});
	}
	
	public List<Employee> getEmployeesByPage(int pageid,int total){    
	    String sql="SELECT * FROM EMPLOYEE LIMIT ?,?";    
	    return jdbcTemplate.query(sql,new Object []{(pageid-1),total},new RowMapper<Employee>(){    
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
	        	Employee e=new Employee();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setSalary(rs.getDouble(3));
	            e.setDesignation(rs.getString(4));
	            return e;    
	        }    
	    });    
	}    
	
	
}
