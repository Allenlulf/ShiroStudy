package com.epoint.shiro.JunitTest;

import java.util.Arrays;

import org.apache.shiro.subject.Subject;
import org.junit.Test;

import com.epoint.shiro.common.ShiroUtil;

public class RoleTest {
	@Test
	public void testHasRole() {
		//��֤hasrole
		Subject currentUser = ShiroUtil.login("shiro_role.ini", "root", "11111");
		System.out.println(currentUser.hasRole("role1") ? "��role1��ɫ" : "��role1��ɫ");
		Subject currentUser2 = ShiroUtil.login("shiro_role.ini", "root", "11111");
		System.out.println(currentUser2.hasRole("role2") ? "��role2��ɫ" : "��role2��ɫ");

		//��֤hasroles
		boolean[] result = currentUser.hasRoles(Arrays.asList("role1", "role2", "role3"));
		System.out.println(result[0] ? "��role1��ɫ" : "��role1��ɫ");
		System.out.println(result[1] ? "��role2��ɫ" : "��role2��ɫ");
		System.out.println(result[2] ? "��role3��ɫ" : "��role3��ɫ");

		//��֤hasallroles
		Subject currentUser1 = ShiroUtil.login("shiro_role.ini", "lulf", "12345");
		System.out.println(
				currentUser1.hasAllRoles(Arrays.asList("role1", "role2")) ? "role1,role2����" : "role1,role2������");

	}
}
