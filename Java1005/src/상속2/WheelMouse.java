package ���2;

//�ٸ��콺 Ŭ����
//���: �θ�Ŭ������ ��� + ��ũ��
public class WheelMouse extends Mouse{
    
	
	//Override(������) : �θ�Ŭ������ ���� ��� �ڽ�Ŭ�������� ���ο� �������� �������ϴ� ��
	//Override�� �θ�Ŭ�������� ���ǵ� Ʋ�� �״�� ����ؾ� ��!
	//superŰ����: �θ�Ŭ������ ��Ī
	// -super(): �θ�Ŭ������ ������
	// - super.�޼ҵ��() : �θ�Ŭ������ �޼ҵ�
	@Override
	public void leftClick() {
		
		//super.leftClick(); //�θ�Ŭ������ leftClick() ȣ��! ->������� �ʴ´ٸ� ������ ��!
		System.out.println("�ٸ��콺 ���� Ŭ��!");
	}
	
	//�θ�Ŭ������ rightClick()�� move()�� �ڽ�Ŭ�������� �������Ͻÿ�.
	
	@Override
	public void rightClick() {
		System.out.println("�ٸ��콺 ������ Ŭ��!");
	}
	@Override
	public void move() {
		System.out.println("�ٸ��콺 ������!");
	}
	
	public void scroll() {
    	System.out.println("��ũ��!");
    }
	
}
