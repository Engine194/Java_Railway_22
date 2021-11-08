package entity;


import java.time.LocalDate;

public class Question {

	int 		id;
	String 		content;
	CategoryQuestion categoryQuestion;
	TypeQuestion typeQuestion;
	Account 	creator;
	LocalDate 	createDate;
	Exam[] 		exams;
}