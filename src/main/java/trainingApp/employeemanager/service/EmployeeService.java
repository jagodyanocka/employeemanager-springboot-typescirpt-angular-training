package trainingApp.employeemanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trainingApp.employeemanager.exception.UserNotFoundException;
import trainingApp.employeemanager.model.Employee;
import trainingApp.employeemanager.repository.EmployeeRepository;
import java.util.List;


@Service
public class EmployeeService {

    private EmployeeRepository repo;

    @Autowired
    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return repo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return repo.save(employee);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }

    public Employee findEmployeeById(Long id) {
        return repo.findEmployeeById(id). orElseThrow(() -> new UserNotFoundException("User by id: " + id + " not found"));
    }
}
