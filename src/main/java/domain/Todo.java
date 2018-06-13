package domain;

import java.util.Date;

import lombok.Data;

@Data
public class Todo {
	private Long tno;
	private String title, todo;
	private Date compdate;
}
