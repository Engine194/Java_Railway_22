package entity;

import java.util.Date;

public class Account {
	int accountId;
	String email;
	String username;
	String fullName;
	Department departmentId;
	Position positionId;
	Date  createDate;
	Group[] groups;
}
