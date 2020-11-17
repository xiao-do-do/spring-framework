package org.springframework.beans.mytest;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


class XmlBeanFactoryMytest {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("a.xml"));
		MyTestBean bean = (MyTestBean) factory.getBean("myTestBean");
		System.out.println(bean.getTestStr());
	}


}