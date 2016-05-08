package com.newtalent.www;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

/**
 * �������Ա� �ײ����ݽṹΪ���� ����Ĭ�������С=16 ����ӵ�Ԫ�ظ�������Ĭ�ϴ�С�������·�����������ռ�
 * 
 * @author AllenLee
 * 
 * @param <E>
 * 
 */
public class MyArrayList<E> extends MyAbstractList<E> {

	// Ĭ�ϴ�С
	public static final int INIT_CAPACITY = 16;

	// �½�E[]����
	E[] elements = (E[]) new Object[INIT_CAPACITY];

	@Override
	public void add(int index, E e) {

		if (index < 0) {
			System.err.println("�Ƿ�����λ�ã�");
		}
		// �ж�Ԫ�ظ����Ƿ���� size
		// �������½����飬ת��ԭ����Ԫ��
		// ����λ�ü���
		if ( elements.length  <= size) {

			E[] newElements = (E[]) new Object[size * 2];
			
			for (int i = 0; i < index; i++) {
			
				newElements[i] = elements[i];
			}
			System.arraycopy(elements, 0, newElements, 0, elements.length);
			
			//indexλ��֮��ĵ�Ԫ�غ���һ��
			for (int i = size ; i > index; i--) {
				newElements[i] = elements[i-1];
			}
			
			// ��indexλ�ò�����Ԫ��
			newElements[index] = e;
		
			elements = newElements;
			size++;
		} else {
									
			// ��index �����Ԫ�������ƶ�
			for (int i = size -1; i >= index ; i--) {
				elements[i+1] = elements[i];
			}

			// ������Ԫ��
			elements[index] = e;
			size++;
		}

	}

	@Override
	public void clear() {
		//elements ָ���µ�Ĭ�ϴ�С���飬size = 0��
		elements = (E[]) new Object[INIT_CAPACITY];
		size = 0;
	}

	@Override
	public int indexOf(E e) {
		for (int i = 0; i < size; i++) {
			if (e.equals(elements[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E e) {
		for (int i = elements.length - 1; i >= 0; i--) {
			if (e.equals(elements[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public E remove(int index) {
		if (index >= 0 && index <= size -1) {
			E temp = elements[index];
			for (int i = index + 1; i <= size ; i++) {
				elements[i-1] = elements[i];
			}
			size--;
			return temp;
		}
		else {
			System.out.println("Illegal index ��");
			return null;
		}
	}

	
	
	@Override
	public E get(int index) {
		if (index >= 0 && index <= size-1) {
			return elements[index];
		}
		else {
			System.out.println("����λ��Խ�磡");
			return null;
		}
	}

	@Override
	public E set(int index, E e) {
		E old = elements[index];
		elements[index] = e;
		return old;
	}

	@Override
	public boolean contains(E e) {
		for (int i = 0; i < elements.length; i++) {
			if (e.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder showResult = new StringBuilder("[");
		
		for (int i = 0; i < size; i++) {
			showResult.append(elements[i]);
			if (i < size - 1 ) {
				showResult.append(",");
			}
		}
		
		return showResult.toString() + "]";
	}

	
	
}
