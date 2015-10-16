package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @Autowired
    protected EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping("/employees")
    public List<Map<String, Object>> employees(@RequestParam(value = "fields") String fieldsString) {

        String[] fields = fieldsString.split(",");
        return employeeRepository.findAllSelectingColumns(fields);
    }

}
