package com.arthenyo.desafio01;

import com.arthenyo.desafio01.Entities.Order;
import com.arthenyo.desafio01.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o codigo do pedido: ");
		int code = sc.nextInt();

		System.out.print("Valor do pedido: ");
		Double basic = sc.nextDouble();

		System.out.print("Valor o desconto do pedido: ");
		Double discount = sc.nextDouble();

		Order order = new Order(code,basic,discount);

		System.out.println("\nCodigo do pedido: " + order.getCode() + "\nValor total: " + orderService.total(order));

		sc.close();
	}
}
