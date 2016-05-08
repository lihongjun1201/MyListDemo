package com.newtalent.www;


/**
 * �������
 * ʵ�ַ���List�ӿ�
 * 
 * @author AllenLee
 * @param <E>
 *
 */
public abstract class MyAbstractList<E> implements MyList<E> {

	protected int size = 0;
	
	/**
	 * Ĭ�Ϲ��캯��
	 */
	protected  MyAbstractList() {
		
	}
	
	/**
	 * ���������Թ������Ա�
	 * @param elements
	 */
	protected MyAbstractList(E[] elements){
		for (int i = 0; i < elements.length; i++) {
			add(elements[i]);
		}
	}
	
	/**
	 * Ĭ����β�������Ԫ��
	 */
	@Override
	public void add(E e) {
		add(size, e);
	}


	@Override
	public boolean isEmpty() {
		return 0 == size;
	}


	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		if (indexOf(e) >= 0) {
			remove(indexOf(e));
			return true;
		}
		else {
			return false;			
		}
	}



	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
}
