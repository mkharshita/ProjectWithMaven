package org.springExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springExpressionLanguageConfig.xml");
        Demo demo = applicationContext.getBean("demo", Demo.class);
        System.out.println(demo);

        System.out.println("------------------------------------------------------------------------");

        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression expression = spelExpressionParser.parseExpression("2+3");
        System.out.println(expression.getValue());
    }
}
