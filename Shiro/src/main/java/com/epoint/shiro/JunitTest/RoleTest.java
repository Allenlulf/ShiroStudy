package com.epoint.shiro.JunitTest;

import java.util.Arrays;

import org.apache.shiro.subject.Subject;
import org.junit.Test;

import com.epoint.shiro.common.ShiroUtil;

public class RoleTest {
	@Test
	public void testHasRole() {
		//验证hasrole
		Subject currentUser = ShiroUtil.login("shiro_role.ini", "root", "11111");
		System.out.println(currentUser.hasRole("role1") ? "有role1角色" : "无role1角色");
		Subject currentUser2 = ShiroUtil.login("shiro_role.ini", "root", "11111");
		System.out.println(currentUser2.hasRole("role2") ? "有role2角色" : "无role2角色");

		//验证hasroles
		boolean[] result = currentUser.hasRoles(Arrays.asList("role1", "role2", "role3"));
		System.out.println(result[0] ? "有role1角色" : "无role1角色");
		System.out.println(result[1] ? "有role2角色" : "无role2角色");
		System.out.println(result[2] ? "有role3角色" : "无role3角色");

		//验证hasallroles
		Subject currentUser1 = ShiroUtil.login("shiro_role.ini", "lulf", "12345");
		System.out.println(
				currentUser1.hasAllRoles(Arrays.asList("role1", "role2")) ? "role1,role2都有" : "role1,role2不都有");

	}
}
