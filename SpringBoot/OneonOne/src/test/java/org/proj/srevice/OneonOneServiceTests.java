package org.proj.srevice;

import org.junit.jupiter.api.Test;
import org.proj.dto.OneonOneDTO;
import org.proj.service.OneonOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class OneonOneServiceTests {

	@Autowired
	private OneonOneService oneonOneService;

}
