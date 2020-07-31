package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserManagerTest {
//	static UserManager userManager = null;
	List<User> originUserList = new ArrayList<User>() {
		{
			add(new User("Black"));
			add(new User("Lotus"));
			add(new User("Tiem"));
			add(new User("Walk"));
		}
		
	};
	HashMap<String,User> originUserMap = new HashMap<String,User>() {
		{
			put("Black",new User("Black"));
			put("Lotus",new User("Lotus"));
			put("Time",new User("Time"));
			put("Walk",new User("Walk"));
		}
	};

	@BeforeAll
	static void テスト前処理() {
		
	}
	@Test
	void 正常系_UserManagerインスタンス() {
		UserManager ins1 = UserManager.getInstance();
		UserManager ins2 = UserManager.getInstance();
		assertThat(ins1).isSameAs(ins2);
	}
	@Test
	void 正常系_userList登録参照() {
		UserManager userManager = UserManager.getInstance(); 
		
		for(User u : originUserList) {
			userManager.setUserToList((User) u);
			List<User> reUserList = userManager.getUserList();
			assertThat(reUserList).contains(u);
		}
	}
	@Test
	void 正常系_userMap登録参照() {
		UserManager userManager = UserManager.getInstance(); 
		
		for(Map.Entry<String, User> entry : originUserMap.entrySet()) {
			userManager.setUserToMap(entry.getValue());
			Map<String,User> reUserMap = userManager.getUserMap();
			assertThat(reUserMap).contains(entry);
		}
	}
	@Test
	void 正常系_useｒ全削除() {
		
	}

}
