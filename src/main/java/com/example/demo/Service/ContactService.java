package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Model.Contact;

import com.example.demo.Repository.ContactRepository;

@Service
@Transactional
public class ContactService {

	@Autowired
	ContactRepository contactRepository;
	@Autowired
	JavaMailSender javaMailSender;
	
	
	public Page<Contact> findAllContact(Pageable pageable) {
		return contactRepository.findAll(pageable);
		}
	public boolean sendMailContact(String to, String subject, String content) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("maincreep1010@gmail.com");
		msg.setTo(to);
		msg.setSubject(subject);
		msg.setText(content);
		try {
			javaMailSender.send(msg);
			return true;
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
		
	}
}
