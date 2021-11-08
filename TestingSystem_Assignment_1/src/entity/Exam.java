package entity;

import java.util.Date;

public class Exam {
	byte 		id;
	String 		code;
	String 		title;
	String 		category;
	byte 		duration;
	Account 	creator;
	Date 		createDate;
	Question[]  questions;
}
