package org.proj.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OneonOneDTO {

	private Long bno;

	@NotEmpty
	@Size(max = 100)
	private String title;

	@NotEmpty
	private String content;

	@NotEmpty
	private String writer;

	private LocalDateTime regDate;

	private LocalDateTime modDate;
}
