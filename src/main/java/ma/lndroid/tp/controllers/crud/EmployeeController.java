package main.java.ma.lndroid.tp.controllers.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.java.ma.lndroid.tp.beans.crud.Employee;
import main.java.ma.lndroid.tp.dao.crud.EmployeeDAO;

@Controller
public class EmployeeController {

	private static String H_URL = "/crud/";

	@Autowired
	EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@RequestMapping("/employeeForm")
	public String showForm(Model model) {
		model.addAttribute("command", new Employee());
		return H_URL+"form-Employee";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") Employee employee) {
		employeeDAO.save(employee);
		return "redirect:/viewEmp";// will redirect to viewemp request mapping
	}

	@RequestMapping("/viewEmp")
	public String viewemp(Model model) {
		List<Employee> list = employeeDAO.getEmployees();
		model.addAttribute("listEmployees", list);
		return H_URL+"view-Employees";
	}

	@RequestMapping("/editEmpl/{id}")
	public String edit(@PathVariable int id, Model model) {
		Employee e = employeeDAO.getEmpById(id);
		model.addAttribute("command", e);
		return H_URL+"editForm-Employee";
	}

	@RequestMapping(value = "/editSaveEmp", method = RequestMethod.POST)
	public String editSaveEmployee(@ModelAttribute("emp") Employee e) {
		employeeDAO.update(e);
		return "redirect:/viewEmp";
	}

	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable int id) {
		employeeDAO.delete(id);
		return "redirect:/viewEmp";
	}
	
	@RequestMapping(value="/viewempByPage/{pageid}")    
    public String viewEmpByPage(@PathVariable int pageid,Model model){    
        int total=5;    
        if(pageid==1){}    
        else{    
            pageid=(pageid-1)*total+1;    
        }    
        System.out.println(pageid);  
        List<Employee> list=employeeDAO.getEmployeesByPage(pageid,total);    
        model.addAttribute("listEmployee", list);  
        return H_URL+"view-Employee-ByPage";    
    }    

}
