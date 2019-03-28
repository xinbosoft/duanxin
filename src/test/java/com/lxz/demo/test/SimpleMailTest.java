package com.lxz.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SimpleMailTest {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Test
	public void sendMail(){
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("793247123@qq.com");
		mailMessage.setTo("2353583654@qq.com");
		mailMessage.setSubject("lxz卢祥征");
		mailMessage.setText("Hello,卢祥征");
		javaMailSender.send(mailMessage);
	}
}
