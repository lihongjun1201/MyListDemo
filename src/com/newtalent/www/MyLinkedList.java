package com.newtalent.www;

import java.util.Currency;

import javax.lang.model.element.Element;


/**
 * ����������
 * ����
 * @author AllenLee
 *
 */
public class MyLinkedList<E> extends MyAbstractList<E> {
	private Node<E> head;
	private Node<E> tail;
	
	public MyLinkedList(){
		head = null;
		tail = null;
	}
	
	public  MyLinkedList(E[] elements) {
		super(elements);
	}

	/**
	 * ͷ�巨
	 */
	public void addFirst(E e) {
		//������+1
		size++;
		
		//�����½ڵ�
		Node<E> element = new Node<E>(e);
		
		//�������Ϊ��
		if (head == null) {
			head = element;
			tail = element;
		}
		//���������Ԫ��
		else {
			element.next = head;
			head = element;
		}
	}
	
	/**
	 * β�巨
	 */
	public void addLast(E e) {
		size++;

		Node<E> element = new Node<E>(e);
		
		if (head == null) {
			head = tail = element;
		}
		else {
			tail.next = element;
			tail = element;			
		}
	}
	
	/**
	 * ����½ڵ㣬�������ʵ��
	 * �������õ�ַ����
	 * 
	 */
	@Override
	public void add(int index, E e) {
		//������ͷ�������½ڵ�
		if (index == 0) {
			addFirst(e);
		}
		//������ĩβ�����½ڵ�
		else if (index >= size) {
			addLast(e);
		} 
		//���м�����λ�ò����½ڵ�
		else {
			Node<E> element = new Node<E>(e);
			size++;
			
			Node<E> current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			
			element.next = current.next;
			current.next = element;
		}
			
		
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
	}

	@Override
	public boolean contains(E e) {
		Node<E> current = head;
		while (current != null ) {
			if (current.element.equals(e)) {
				return true;
			}
		}		
		return false;
	}

	@Override
	public E get(int index) {
		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.element;
	}

	@Override
	public int indexOf(E e) {
		Node<E> current = head;
		int index = 0;
		while (current != null) {
			if (current.element.equals(e)) {
				return index;
			}
			index++;
		}
		
		return -1;
	}

	@Override
	public int lastIndexOf(E e) {
		int[] showIndex = new int[size];
		int showTimes = 0;
		
		Node<E> currunt = head;
		for (int index = 0; index < size; index++) {
			if (currunt.element.equals(e)) {
				showIndex[showTimes] = index;
				showTimes++;
			}
		}
		return showIndex[showTimes];
	}

	public E removeFirst() {
		if (head == null) {
			return null ;
		}
		else {
			size--;
			Node<E> temp = head;
			head = head.next;
			if (size == 0) {
				tail = null;
			}
			return temp.element;
		}
	}
	
	public E removeLast() {
		if (size == 0) {
			return null;
		}
		else if (size == 1) {
			size = 0;
			Node<E> temp = head;
			head = tail = null;
			return temp.element;
		} 
		else {
			Node<E> current = head;
			
			for (int i = 0; i < size - 2; i++) {
				current = current.next;
			}
			
			Node<E> temp = tail;
			tail = current;
			current.next = null;
			size--;
			return temp.element;
		}
		
	}
	
	
	/**
	 * ������λ��ɾ���ڵ�
	 */
	@Override
	public E remove(int index) {
		if (index < 0 || index > size)
			return null;
		
		if (index == 0) {
			removeFirst();
		}
		else if (index == size-1) {
			removeLast();
		} 
		else {
			Node<E> pre = head;
			for (int i = 1; i < index; i++) {
				pre = pre.next;
			}
			Node<E> toDeleteNode = pre.next;
			pre.next = toDeleteNode.next;
			size--;
			return toDeleteNode.element;
		}		
		return null;
	}

	
	/**
	 * ��������λ�õ�Ԫ��
	 */
	@Override
	public Object set(int index, E e) {
		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		current.element = e;
		return current.element;
	}
	
	
	@Override
	public String toString() {
		StringBuilder showBuilder = new StringBuilder("[");
		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			showBuilder.append(current.element);
			current = current.next;
			if (current != null) {
				showBuilder.append(" -> ");
			}
			else {
				showBuilder.append("]");
			}
		}
	
		return showBuilder.toString();
	}
	
	
	
	/**
	 * ��̬�ڲ���
	 * ����ڵ�
	 * 
	 * @author AllenLee
	 *
	 * @param <E>
	 */
	private static class Node<E> {
		
		//������
		E element;
		
		//��һ�ڵ�����
		Node<E> next;
		
		/**
		 * ����ڵ㹹�캯��
		 * @param e
		 */
		public Node(E e){
			element = e;
		}
	}
	
}



