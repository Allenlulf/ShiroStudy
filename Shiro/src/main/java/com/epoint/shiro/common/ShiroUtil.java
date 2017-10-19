package com.epoint.shiro.common;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * shiro��֤������
 * 
 * @author lulf
 *
 */
public class ShiroUtil {

	public static Subject login(String configfile, String userName, String password) {
		// ���ȶԴ���������ļ�����·����ȫ����shiro.ini==> classpath:shiro.ini
		String configfilepath = "classpath:" + configfile;
		// ��ȡ�����ļ�����ʼ��SecurityManager����
		Factory<SecurityManager> factory = new IniSecurityManagerFactory(configfilepath);
		// ��ȡSecurityManagerʵ��
		SecurityManager securityManager = factory.getInstance();
		// ��SecurityManagerʵ���󶨵�SecurityUtils
		SecurityUtils.setSecurityManager(securityManager);
		// �õ���ǰִ�е��û�
		Subject currentUser = SecurityUtils.getSubject();
		// ����token���� �û���/����
		UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
		// �����֤
		try {
			currentUser.login(token);
			System.out.println("�����֤�ɹ�");
		} catch (AuthenticationException e) {
			e.getStackTrace();
			System.out.println("�����֤ʧ��");
		}
		return currentUser;
	}

}
