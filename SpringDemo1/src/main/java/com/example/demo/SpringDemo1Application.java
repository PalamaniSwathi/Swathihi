package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDemo1Application.class, args);
		ShoeShop shop=ctx.getBean("ashop", ShoeShop.class);
		System.out.println(shop.sellShoe());
	}

}
abstract class Shoe{}
class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}
abstract class Factory{
	public abstract Shoe makeShoe();
	
}
@Component("bsf")
class BataShoeFactory extends Factory{
	public BataShoeFactory() {
		System.out.println("Bata shoe factory object created...");
	}
	@Override
	public Shoe makeShoe() {
		
		return new LeatherShoe();
	}
}
@Component("lsf")
class LakshaniShoeFactory extends Factory{
	public LakshaniShoeFactory() {
		System.out.println("Lakhani shoe factory object created..");
	}
	@Override
	public Shoe makeShoe() {
		
		return new SportsShoe();
	}
}
abstract class ShoeShop{
	@Autowired
	@Qualifier("bsf")
	private Factory factory;
	public Factory getFactory() {
		return factory;
	}
	public void setFactory(Factory factory) {
		this.factory=factory;
	}
	public abstract Shoe sellShoe();
}
@Component("ashop")
class AnoundShop extends ShoeShop{
	public AnoundShop() {
		System.out.println("anound shoe shop object created...");
	}
	@Override
	public Shoe sellShoe() {
		System.out.println(getFactory());
		return getFactory().makeShoe();
	}
	
}