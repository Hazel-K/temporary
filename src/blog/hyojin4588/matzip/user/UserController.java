package blog.hyojin4588.matzip.user;

import javax.servlet.http.HttpServletRequest;

import blog.hyojin4588.matzip.Const;
import blog.hyojin4588.matzip.ViewRef;

public class UserController {
	// /user/login 경로로 접속 시 해당 메소드 실행
	public String login(HttpServletRequest request) {
		request.setAttribute(Const.TITLE, "로그인"); // title : "로그인"
		request.setAttribute(Const.VIEW, "/user/login"); // view : "/user/login"
		return ViewRef.DEFAULT; // 결과값 : "/template/default"
	}
}
