package net.burtsev.example.web;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("session")
public class TestBean implements Serializable {

	private static final long serialVersionUID = -1;

	private String name;
	private String hello;

	public void sayHelloAction() {
		hello = StringUtils.isNotBlank(name) ? "Hello " + name : "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
}
