package com.spring.ExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ExpressionLanguage/ExpLang.xml");
		Demo d = context.getBean("demo", Demo.class);
		System.out.println(d);
		
		System.out.println("--------------------------------------------------");
		
		/* We can also use various api's to parse */
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression exp = temp.parseExpression("11+22+33+44+55");
		System.out.println(exp.getValue());
		
	}
}
