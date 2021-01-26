package package_VO;

public class AdminVO {
	// 관리자 아이디 이 클래스에서만 사용
	// 시퀀스=식별자
	private String id = "Admin";

	// 관리자 비밀번호 이 클래스에서만 사용
	private String pw = "bajisajang";

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
