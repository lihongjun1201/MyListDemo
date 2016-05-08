package com.newtalent.www;

/**
 * MyList���ͽ��
 * ����List�Ĺ�������
 * �����ʵ�ֿ��Է�ΪArray & LinkedList
 * @author AllenLee
 *
 */
public interface MyList<E> {
	
	/**
	 *���һ��Ԫ�ص�List 
	 * @param e
	 */
	public void add(E e);
	
	
	/**
	 * ��λ�����Ԫ��
	 * @param index
	 * @param e
	 */
	public void add(int index,E e);
	
	
	/**
	 * �������Ԫ��
	 */
	public void clear();
	
	
	/**
	 * �ж��Ƿ���ĳԪ��
	 * @param e
	 * @return
	 */
	public boolean contains(E e);
	
	
	/**
	 * ��λ�û�ȡԪ��
	 * @param index
	 * @return
	 */
	public E get(int index);
	
	
	/**
	 * ��ȡĳԪ�صľ�������λ��
	 * @param e
	 * @return
	 */
	public int indexOf(E e);
	
	
	/**
	 * �жϱ��Ƿ�Ϊ��
	 * @return
	 */
	public boolean isEmpty();
	
	
	/**
	 * ��ȡ��Ԫ���������������ֵ�����λ��
	 * @param e
	 * @return
	 */
	public int lastIndexOf(E e);
	
	
	/**
	 * ɾ��ĳԪ��
	 * @param e
	 * @return
	 */
	public boolean remove(E e);
	
	
	/**
	 * ɾ����λ�õ�Ԫ��
	 * @param index
	 * @return
	 */
	public E remove(int index);
	
	
	/**
	 * ����ĳλ�õ�Ԫ��
	 * @param index
	 * @param e
	 * @return
	 */
	public Object set(int index, E e);
	
	/**
	 * ��ȡ���С
	 * @return
	 */
	public int size();

}
