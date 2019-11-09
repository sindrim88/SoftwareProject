package is.hi.hbv503.FitnessTracker.FitnessTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FitnessTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessTrackerApplication.class, args);
	}
}
