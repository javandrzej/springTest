package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class WorkerController
{
    @Autowired WorkerRepository workerRepository;

    @RequestMapping("/workers")
    public List<Worker> getWorkers()
    {
        return workerRepository.findAll();
    }

    @RequestMapping("/")
    public String getString()
    {
        return "String ..";
    }
}
