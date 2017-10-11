package com.abs.attendance;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main Class for application.
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.abs.attendance")
public class AttendanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendanceApplication.class, args);
	}
}
