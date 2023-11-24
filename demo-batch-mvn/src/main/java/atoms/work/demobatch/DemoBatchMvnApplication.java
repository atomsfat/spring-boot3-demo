package atoms.work.demobatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoBatchMvnApplication {

    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(DemoBatchMvnApplication.class, args)));
    }

}
