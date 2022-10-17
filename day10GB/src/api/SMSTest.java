package api;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SMSTest {

	public static void main(String[] args) {
		String api_key = "NCSOLRG0HRPG2Y6F";
		String api_secret = "I42WGCJ5MFESALLC6W2ORNXPFTFMXEYG";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", "01038812549");
		params.put("from", "01038812549");
		params.put("type", "SMS");
		params.put("text", "테스트중입니다. 확인");
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
	}

}
