package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {

		/*
		 * * ��Ʈ��ũ (NetWork): �������� ��ǻ�͵��� ����Ǿ��ִ� ��Ÿ��� ���� ����
		 * 					   => �̷� ��Ʈ��ũ�� ���� ���ΰ��� ������ ��ȯ ����!
		 * * IP �ּ�: ��Ʈ��ũ �� �� ��ǻ�͵��� �ĺ����� �� �ִ� ��ȣ (��ǻ���� �ֹι�ȣ)
		 * 
		 * * ������ Ŭ���̾�Ʈ
		 * > ����: Ŭ���̾�Ʈ(��)���� ���񽺸� �������ִ� ���α׷� (Ŭ���̾�Ʈ�� ��û�� ó���ؼ� �������ִ�)
		 * > Ŭ���̾�Ʈ: ������ ��û�ϴ� ��ǻ��(���񽺸� �����޴� ��)
		 * 
		 * - ������ ��û�ϱ� ���ؼ��� �� ��û�ϰ��� �ϴ� ������ IP�ּ�(�Ǵ� �����θ�), ��Ʈ��ȣ�� �˾ƾ� ��!
		 * 
		 */
		
		// InetAddress: ��Ʈ��ũ ���� (ip�ּ� ����)�� Ȯ���� �� �ִ� Ŭ����
		
		// LocalHost: �� PC
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost); // �� pc�� + / + �� IP�ּ�
			
			System.out.println("�� PC��: " + localhost.getHostName()); // ȣ��Ʈ�� �̸� ��ȯ
			System.out.println("�� IP�ּ�: " + localhost.getHostAddress()); // ȣ��Ʈ�� IP�ּ� ��ȯ
			
			System.out.println("==========================================");
			
			// ���� �˰��ִ� �������� ���� �� ���� ���õ� ���� ���
			InetAddress googleHost = InetAddress.getByName("www.google.com"); // �����θ��� ���ؼ� �ش� ȣ��Ʈ�� ���� ���� ��ȯ
			System.out.println("���� ������: " + googleHost.getHostName());
			System.out.println("���� IP�ּ�: " + googleHost.getHostAddress());
			System.out.println("================================");
			
			// �������� ���� �� ���� ������ �͵��� �迭�� ���� �� ����
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹� ȣ��Ʈ ����: " + naverHost.length);
			for(InetAddress n: naverHost) {
				System.out.println("���̹� ������: " + n.getHostName());
				System.out.println("���̹� IP�ּ�: " + n.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		/*
		 * * ���� �������� ������ ������
		 * 	  Ŭ���̾�Ʈ�� �� ������ ��û�� ���� �� ����! => ���� ����� ���ƿ�
		 * 
		 * - ��û�� ���信 ���� ���α׷��� ���ư� ('���'�Ѵٰ� ǥ����)
		 * 
		 * - �������� ��Ź��: HTTP �������� ���
		 * 
		 * * �ڹٸ��� ������ ������ Ŭ���̾�Ʈ ���� ������ ����غ���!!
		 * 	  �� �� �����͸� ������ϰ��� �Ѵٸ� ������ Ŭ���̾�Ʈ ���� ��Ʈ��(�������)�� �ʿ���!
		 * 
		 * * ����: ���μ��� ���� ����� ����ϴ� ��! (��Ʈ���� �����ϱ� ���� ��)
		 * 
		 * * ���� ���α׷�(TCP��� / UDP���)
		 * - TCP���: ������ ���� �ӵ��� ����! �����Ͱ� ��Ȯ�ϰ� ���������� ���޵� (�ŷڼ��� �䱸�Ǵ� ���α׷�: http, �̸���, ...)
		 * - UDT���: ������ ���� �ӵ��� ����! �ŷڼ� ���� ������ ���޵� �� ����. ������ �ǰų� �� �� ���� (�����͸� ���� �ӵ��� �����ϰ��� �ϴ� ���α׷�: �ǽð���Ʈ���ּ���)
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
