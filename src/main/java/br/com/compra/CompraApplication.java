package br.com.compra;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class CompraApplication {
	@Bean
	public ModelMapper newModelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(CompraApplication.class, args);
	}

//	/**
//	 * Configuração de Cors para funcionar em servers diferentes
//	 * @return
//	 */
//	@Bean
//	public CorsFilter corsFilter() {
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration config = new CorsConfiguration();
//		config.setAllowCredentials(true);
//		config.addAllowedOrigin("*");
//		config.addAllowedHeader("*");
//		config.addAllowedMethod("GET");
//		config.addAllowedMethod("PUT");
//		config.addAllowedMethod("POST");
//		config.addAllowedMethod("OPTIONS");
//		config.addAllowedMethod("DELETE");
//		source.registerCorsConfiguration("/**", config);
//		return new CorsFilter(source);
//	}

}
