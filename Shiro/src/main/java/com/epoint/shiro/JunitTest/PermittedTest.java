package com.epoint.shiro.JunitTest;

import org.apache.shiro.subject.Subject;
import org.junit.Test;

import com.epoint.shiro.common.ShiroUtil;

public class PermittedTest {
	
	@Test
	public void testPermitted() {
		Subject currentUser = ShiroUtil.login("shiro_permitted.ini", "root", "11111");
		System.out.println(currentUser.isPermitted("user:select")?"���û��в�ѯȨ��":"���û��޲�ѯȨ��");
		System.out.println(currentUser.isPermitted("user:update")?"���û��и���Ȩ��":"���û��޸���Ȩ��");
	}
}
