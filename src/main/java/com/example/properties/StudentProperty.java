package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * 该类对应的是配置文件中的Student属性，将其数据绑定到该类中
 * @author fan
 * 创建时间：2018年6月6日
 */
@Component
@ConfigurationProperties(prefix="student")
public class StudentProperty {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentProperty [name=" + name + ", age=" + age + "]";
	}

	public StudentProperty() {
		super();
	}

}
