package com.songproject.song;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SongApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongApplication.class, args);
	}
}
