package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import utils.ScannerUtils;

public class Group {
	private int id;
	private String groupName;
	private Account[] accounts;
	public Group(int id, String groupName, Account[] accounts) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.accounts = accounts;
	}
	public Group() {
		super();
		this.id = ScannerUtils.inputInt("Mời nhập id: ", "Nhập sai định dạng mời nhập lại");
		this.groupName = ScannerUtils.inputString("Mời nhập group name: ");
		this.accounts = inputAccount();
		
	}
	private Account[] inputAccount() {
		String input = ScannerUtils.inputString("Bạn có muốn thêm accounts hay không? y/n");
		if ("y".equals(input.toLowerCase())) {
			// Khởi tạo một ArrayList có tên là results
			ArrayList<Account> results = new ArrayList<Account>();
			// Tạo một vòng while để khởi tạo Account
			do {
				Account account = new Account();
				results.add(account);
				System.out.println("Tạo account thành công!");
				System.out.println();
				String stopOrNot = ScannerUtils.inputString("Bạn có muốn tiếp tục thêm account không? y/n");
				// kết thúc 1 vòng loop hỏi người dùng có tạo tiếp account không?
				if ("y".equals(stopOrNot.toLowerCase())) {
					continue;
				} else {
					// Nếu không tạo nữa thì chuyển results thành Account[];
					Account[] initial = new Account[results.size()];
					return results.toArray(initial);
				}
			} while (true);
			
		} else {
			return null;
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", groupName=" + groupName + ", accounts=" + Arrays.toString(accounts) + "]";
	}
	
	
	
}
