package api;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class Validate {
	public static void main(String[] args) {
		// 사용자에게 핸드폰 번호 입력받고
		// 그 핸드폰 번호로 랜덤한 네자리 숫자 보내기
		// 사용자가 그 번호를 정확하게 입력했는지 비교해서
		// 맞다면 가입성공! 틀리다면 인증번호가 잘못됐습니다!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("휴대폰번호를 입력하세요 >> ");
		String num = sc.nextLine();
		
		Random r = new Random();
		
		// 문자 랜덤 하는 방법
//		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*()_+";
//		int len = source.length();
//		
//		String randNum = "";
//		for (int i = 0; i < 5; i++) {
//			int idx = r.nextInt(len);
//			randNum += source.charAt(idx);
//		}
		
		int account = r.nextInt(10000);
		
		String api_key = "NCSOLRG0HRPG2Y6F";
		String api_secret = "I42WGCJ5MFESALLC6W2ORNXPFTFMXEYG";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", num);
		params.put("from", "01038812549");
		params.put("type", "SMS");
		params.put("text", String.valueOf(account));
		params.put("app_version", "test app 1.2"); // application name and version
	
		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
			String result = "";
			System.out.print("인증번호를 입력하세요 >> ");
			result = sc.nextLine();
			if(String.valueOf(account).equals(result)) {
				System.out.println("가입성공!");
			}else {
				System.out.println("가입실패");
			}
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
	}
}
