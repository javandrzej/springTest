package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class DepartmentController
{
    @Autowired
    DepartmentRepository departmentRepository;

    @RequestMapping("/workers")
    public List<Department> getDepartments()
    {
        return departmentRepository.findAll();
    }
}
