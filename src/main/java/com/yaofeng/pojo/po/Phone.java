package com.yaofeng.pojo.po;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //ע���࣬�ڲ�������Ȼ����ʹ��getbean����ȡ���Ե�ֵ����Ϊ@Component����Ĭ���и�С�����������
			//������Сд����Ҳ�����Լ��ֶ�д��
//@Scope("prototype")//��ʾ������Զ�ʵ������ÿ��ʵ�������и��µĶ���
public class Phone {
@Value("С��")
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
		System.out.println("ʹ��ע����ʵ��������");
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
