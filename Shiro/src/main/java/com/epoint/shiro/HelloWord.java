package com.epoint.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * shiro ʵ��1
 * 
 * @author lulf
 *
 */
public class HelloWord {
	public static void main(String[] args) {
		// ��ȡ�����ļ�����ʼ��SecurityManager����
		Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		// ��ȡSecurityManagerʵ��
		SecurityManager securityManager = factory.getInstance();
		// ��SecurityManagerʵ���󶨵�SecurityUtils
		SecurityUtils.setSecurityManager(securityManager);
		// �õ���ǰִ�е��û�
		Subject currentUser = SecurityUtils.getSubject();
		// ����token���� �û���/����
		UsernamePasswordToken token = new UsernamePasswordToken("root", "11111");
		// �����֤
		try {
			currentUser.login(token);
			System.out.println("�����֤�ɹ�");
		} catch (AuthenticationException e) {
			e.getStackTrace();
			System.out.println("�����֤ʧ��");
		}
		// �˳�
		currentUser.logout();
	}
}
