package com.vam.controller;

import java.util.Random;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vam.model.MemberVO;
import com.vam.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired
	private MemberService memberservice;

	@Autowired
	private JavaMailSender mailSender;

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@GetMapping("/join")
	public void loginGET() {
		logger.info("회원가입 페이지 진입");
	}

	@GetMapping("/login")
	public void joinGET() {
		logger.info("로그인 페이지 진입");
	}

	@PostMapping("/join")
	public String joinPost(MemberVO member) throws Exception {

		logger.info("join 진입");

		memberservice.memberJoin(member);

		logger.info("join service 성공");

		return "redirect:/main";
	}

	@PostMapping("/memberIdChk")
	@ResponseBody
	public String memberIdChkPOST(String memberId) throws Exception {

		logger.info("memberIdChk() 진입");

		int result = memberservice.idCheck(memberId);

		logger.info("결과값 = " + result);

		if (result != 0) {
			return "fail";
		} else {
			return "success";
		}
	}

	@GetMapping("/mailCheck")
	@ResponseBody
	public String mailCheckGET(String email) throws Exception {

		logger.info("이메일 데이터 전송 확인");
		logger.info("인증번호: " + email);

		Random random = new Random();
		int checkNum = random.nextInt(888888) + 111111;
		logger.info("인증번호 " + checkNum);

		String setFrom = "dy1004p@gmail.com";
		String toMail = email;
		String title = "회원가입 인증 이메일 입니다.";
		String content = "홈페이지를 방문해주셔서 감사합니다." + "<br><br>" + "인증 번호는 " + checkNum + "입니다." + "<br>"
				+ "해당 인증번호를 인증번호 확인란에 기입하여 주세요.";

		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
			helper.setFrom(setFrom);
			helper.setTo(toMail);
			helper.setSubject(title);
			helper.setText(content, true);
			mailSender.send(message);
		} catch (Exception e) {
			// TODO: handle exception
		}

		String num = Integer.toString(checkNum);

		return num;
	}

}
