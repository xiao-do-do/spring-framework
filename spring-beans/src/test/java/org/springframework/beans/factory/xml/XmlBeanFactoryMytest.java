package org.springframework.beans.factory.xml;

import org.springframework.core.io.ClassPathResource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;



class XmlBeanFactoryMytest {

	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("a.xml"));
		MyTestBean bean = (MyTestBean) factory.getBean("myTestBean");
		System.out.println(bean.getTestStr());
	}


}