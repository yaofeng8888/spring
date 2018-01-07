package com.yaofeng.pojo.po;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //注解类，在测试类依然可以使用getbean来获取属性的值，因为@Component后面默认有个小括号里面就是
			//类名的小写，你也可以自己手动写上
//@Scope("prototype")//表示该类可以多实例化，每次实例都会有个新的对象
public class Phone {
@Value("小米")
	private String phoneName;
@Value("1555")
	private Integer price;
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Phone() {
		System.out.println("使用注解来实例化对象");
	}
	public Phone(String phoneName, Integer price) {
		super();
		this.phoneName = phoneName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [phoneName=" + phoneName + ", price=" + price + "]";
	}
	
}
