package com.example.mann;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import redis.clients.jedis.Jedis;

@SpringBootApplication
public class RedisConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisConsoleApplication.class, args);
		
		try {
			Jedis jedis = new  Jedis("localhost");
			System.out.println("Connection Sucessfull");
			 
			// Redis server is respondig or not
			System.out.println("Server ping" + jedis.ping());
			
			//Show the redis servere info
			System.out.println(jedis.info());
			jedis.info();
			
			// List push
			System.out.println("Push key into this list" + jedis.lpush("list", "item1"));
			System.out.println("Push key into this list" + jedis.lpush("list", "item2"));
			System.out.println("Push key into this list" + jedis.lpush("list", "item3"));
			System.out.println("Pop from the list" + jedis.rpop("list"));
			System.out.println("Pop from the list" + jedis.rpop("list"));
			
		}
		catch(Exception e) {
			
			System.err.println(e.getMessage());
		}
	}
}
