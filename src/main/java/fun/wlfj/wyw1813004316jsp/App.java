package fun.wlfj.wyw1813004316jsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@MapperScan("fun.wlfj.wyw1813004316jsp.dao")
public class App{

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
