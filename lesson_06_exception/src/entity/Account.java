package entity;

import utils.ScannerUtils;

public class Account {
		private int id;
		private String username;
		
		public Account(int id, String username) {
			super();
			this.id = id;
			this.username = username;
		}

		public Account() {
			super();
			this.id = ScannerUtils.inputInt("Mời nhập id: ", "Nhập sai định dạng mời nhập lại");
			this.username = ScannerUtils.inputString("Mời nhập username");
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		@Override
		public String toString() {
			return "Account [id=" + id + ", username=" + username + "]";
		}
		
	}

