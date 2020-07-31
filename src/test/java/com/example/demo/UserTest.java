package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//import com.example.demo.User;

public class UserTest {
	static User user = null; 
	@BeforeAll
	static void テスト前処理() {
	    String str = null;
		user = new User(str);
	}
	@Test
	void 正常系_ユーザー管理コード登録() {
		user.setCode("1234");
		String code = user.getCode();
		
		assertThat(code).isEqualTo("1234");
	}
	@Test
	void 正常系_名前登録参照(){
		user.setName("常盤金成");
		String name = user.getName();
		
		assertThat(name).isEqualTo("常盤金成");
	}
	@Test
	void 正常系_年齢登録参照() {
		user.setAge(24);
		Integer age = user.getAge();
		
		assertThat(age).isEqualTo(24);
	}
	@Test
	void 異常系_範囲外年齢登録() {
		user.setAge(-23);
		Integer nonAge = user.getAge();
		
		assertThat(nonAge).isEqualTo(-1);
	}
	@Test
	void 異常系_特異年齢登録() {
		
		Integer pecAge = user.getAge();
		user.setAge(65);
		
		assertThat(pecAge).isEqualTo(-1);
	}
	@AfterAll
	static void テスト後処理() {
	    user = null;
	}
}
