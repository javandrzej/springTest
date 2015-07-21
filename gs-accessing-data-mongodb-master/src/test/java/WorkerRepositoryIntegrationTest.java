/*
import app.Worker;
import app.WorkerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = ApplicationConfiguration.class)
public class WorkerRepositoryIntegrationTest
{
     @Autowired public WorkerRepository workerRepository;

    @Test
    public void sampleTestCase() {

        Worker worker = new Worker(11, "Mateusz","Bojarski",1);
        worker = workerRepository.save(worker);

        Worker carter = new Worker(12, "Jan","Kowalski",1);
        carter = workerRepository.save(carter);

        workerRepository.findAll().forEach((Worker w) -> {
            System.out.println(w);
        });

       // assertThat(result.size(), is(1));
       // assertThat(result, hasItem(dave));
    }

}
*/
