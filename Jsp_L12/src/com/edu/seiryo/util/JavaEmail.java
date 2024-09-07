package com.edu.seiryo.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class JavaEmail {

	/**
	 * �����ʼ�������:ͨ��qq�ʼ�����,��Ϊ����ssl����,���õ���smtpЭ��
	 * 
	 * @param mailServer
	 *            �ʼ���������������:�� "smtp.qq.com"
	 * @param loginAccount
	 *            ��¼������˺�:�� "1974544863@qq.com"
	 * @param loginAuthCode
	 *            ��¼qq����ʱ����Ҫ����Ȩ��:���Խ���qq����,�˺���������"������Ȩ��"
	 * @param sender
	 *            ������
	 * @param recipients
	 *            �ռ���:֧��Ⱥ��
	 * @param emailSubject
	 *            �ʼ�������
	 * @param emailContent
	 *            �ʼ�������
	 * @param emailContentType
	 *            �ʼ����ݵ�����,֧�ִ��ı�:"text/plain;charset=utf-8";,����Html��ʽ������:
	 *            "text/html;charset=utf-8"
	 * @return
	 */
	public static int sendEmail(String mailServer, final String loginAccount,
			final String loginAuthCode, String sender, String[] recipients,
			String emailSubject, String emailContent, String emailContentType) {
		int res = 0;

		try {
			// ��smtp����������һ������
			Properties p = new Properties();
			// �����ʼ�������������
			p.setProperty("mail.host", mailServer);
			// ���ͷ�������Ҫ�����֤,Ҫ����ָ���û�������ķ�ʽȥ��֤
			p.setProperty("mail.smtp.auth", "true");
			// �����ʼ�Э������
			p.setProperty("mail.transport.protocol", "smtp");

			// ����SSL���ܣ������ʧ��
			MailSSLSocketFactory sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
			p.put("mail.smtp.ssl.enable", "true");
			p.put("mail.smtp.ssl.socketFactory", sf);

			// ����session
			Session session = Session.getDefaultInstance(p,
					new Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							// �û���������QQ�˺�Ҳ����������ı���:��һ������Ϊ�����˺�,�ڶ���Ϊ��Ȩ��
							PasswordAuthentication pa = new PasswordAuthentication(
									loginAccount, loginAuthCode);
							return pa;
						}
					});

			// ���ô򿪵���״̬
			session.setDebug(true);

			// ���Է��ͼ����ʼ�:���������� forѭ�����
			// ����һ��Message����(����һ���ʼ�),��session�д���
			MimeMessage msg = new MimeMessage(session);
			// �ʼ���Ϣ��װ
			// 1������
			msg.setFrom(new InternetAddress(sender));

			// 2�ռ���:���Զ��
			// һ�����ռ���
			// msg.setRecipient(RecipientType.TO, new
			// InternetAddress("linsenzhong@126.com"));

			InternetAddress[] receptientsEmail = new InternetAddress[recipients.length];
			for (int i = 0; i < recipients.length; i++) {
				receptientsEmail[i] = new InternetAddress(recipients[i]);
			}

			// ����ռ���
			msg.setRecipients(RecipientType.TO, receptientsEmail);

			// 3�ʼ�����:���⡢����
			msg.setSubject(emailSubject);
			// msg.setContent("Hello, ����debug!!!", );//���ı�
			msg.setContent(emailContent, emailContentType);// ��html��ʽ���ı�
			// ���Ͷ���
			Transport.send(msg);
			System.out.println("�ʼ����ͳɹ�");
			res = 1;

		} catch (Exception e) {
			System.out.println("�ʼ�����ʧ��: " + e.getMessage());

			res = 0;
		}
		return res;
	}

	public static void main(String[] args) throws Exception {

	/*	int res = sendEmail("smtp.qq.com", "��������",
				"svrpzsdyuzcrbbdb", "�Լ�����",
				new String[] { "����˭" // �������һϵ�е��ռ��˵�������
				}, "����", "����", "text/html;charset=utf-8");
	*/
		int res = sendEmail("smtp.qq.com", "123123123@qq.com",
				"��Ȩ��", "123123123@qq.com",
				new String[] { "123123123@qq.com" // �������һϵ�е��ռ��˵�������
				}, "ף��", "��Һ�!", "text/html;charset=utf-8");
		
		
		
		
		System.out.println("\n���ͽ��:" + res);
	}
}
