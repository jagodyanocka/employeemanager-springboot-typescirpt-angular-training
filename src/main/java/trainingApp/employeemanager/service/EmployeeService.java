package trainingApp.employeemanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trainingApp.employeemanager.repository.EmployeeRepository;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

}