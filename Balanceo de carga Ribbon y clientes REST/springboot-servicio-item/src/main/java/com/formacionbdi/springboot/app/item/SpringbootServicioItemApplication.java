package com.formacionbdi.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "servicio-productos")
//Importante para habilitar clientes feign que tengamos en nuestro proyecto y nos permite inyectar estos
// clientes en nuestros controladores u otros componentes de spring, por ejemplo en una clase service, habilita
//la inyeccion de dependencias con el @autowired
@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioItemApplication.class, args);
	}

}
