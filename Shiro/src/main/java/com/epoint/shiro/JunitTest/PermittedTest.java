package com.epoint.shiro.JunitTest;

import org.apache.shiro.subject.Subject;
import org.junit.Test;

import com.epoint.shiro.common.ShiroUtil;

public class PermittedTest {
	
	@Test
	public void testPermitted() {
		Subject currentUser = ShiroUtil.login("shiro_permitted.ini", "root", "11111");
		System.out.println(currentUser.isPermitted("user:select")?"此用户有查询权限":"此用户无查询权限");
		System.out.println(currentUser.isPermitted("user:update")?"此用户有更新权限":"此用户无更新权限");
	}
}
