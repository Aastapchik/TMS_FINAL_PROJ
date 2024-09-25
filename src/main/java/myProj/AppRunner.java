package myProj;

import myProj.dataBase.request.user.UserRequestDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class AppRunner {

	public static void main(String[] args) throws SQLException {

		System.out.println(UserRequestDB.getUser());

		SpringApplication.run(AppRunner.class, args);
	}

}
