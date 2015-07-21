package app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner
{
   @Autowired WorkerRepository workerRepository;
   @Autowired DepartmentRepository departmentRepository;

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        workerRepository.save(new Worker(12, "Alice", "Smith", 3));
        workerRepository.save(new Worker(14, "Bob", "Smith", 1));

        departmentRepository.save(new Department(1,"Programmer"));
        departmentRepository.save(new Department(2,"Designer"));

        workerRepository.findAll().forEach((Worker a) -> System.out.println(a));
        departmentRepository.findAll().forEach((Department a) -> System.out.println(a));
    }
}
