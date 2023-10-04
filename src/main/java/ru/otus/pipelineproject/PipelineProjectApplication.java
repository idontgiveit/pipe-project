package ru.otus.pipelineproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ru.otus")
public class PipelineProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipelineProjectApplication.class, args);
	}

}
