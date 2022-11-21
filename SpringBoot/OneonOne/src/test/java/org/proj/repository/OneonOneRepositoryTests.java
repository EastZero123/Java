package org.proj.repository;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.proj.vo.OneonOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class OneonOneRepositoryTests {

	@Autowired
	private OneonOneRepository oneonOneRepository;

	@Test
	public void testInsert() {
		IntStream.rangeClosed(1, 100).forEach(i -> {
			OneonOne oneonOneVO = OneonOne.builder().title("title" + i).content("content" + i)
					.writer("user" + (i % 10)).build();

			OneonOne result = oneonOneRepository.save(oneonOneVO);
		});
	}
}
