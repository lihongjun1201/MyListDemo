package com.newtalent.www;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

/**
 * 数组线性表 底层数据结构为数组 具有默认数组大小=16 若添加的元素个数大于默认大小，则重新分配更大的数组空间
 * 
 * @author AllenLee
 * 
 * @param <E>
 * 
 */
public class MyArrayList<E> extends MyAbstractList<E> {

	// 默认大小
	public static final int INIT_CAPACITY = 16;

	// 新建E[]数组
	E[] elements = (E[]) new Object[INIT_CAPACITY];

	@Override
	public void add(int index, E e) {

		if (index < 0) {
			System.err.println("非法插入位置！");
		}
		// 判断元素个数是否大于 size
		// 若是则新建数组，转移原数组元素
		// 否则按位置加入
		if ( elements.length  <= size) {

			E[] newElements = (E[]) new Object[size * 2];
			
			for (int i = 0; i < index; i++) {
			
				newElements[i] = elements[i];
			}
			System.arraycopy(elements, 0, newElements, 0, elements.length);
			
			//index位置之后的的元素后移一格
			for (int i = size ; i > index; i--) {
				newElements[i] = elements[i-1];
			}
			
			// 在index位置插入新元素
			newElements[index] = e;
		
			elements = newElements;
			size++;
		} else {
									
			// 将index 后面的元素往后移动
			for (int i = size -1; i >= index ; i--) {
				elements[i+1] = elements[i];
			}

			// 插入新元素
			elements[index] = e;
			size++;
		}

	}

	@Override
	public void clear() {
		//elements 指向新的默认大小数组，size = 0；
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
			System.out.println("Illegal index ！");
			return null;
		}
	}

	
	
	@Override
	public E get(int index) {
		if (index >= 0 && index <= size-1) {
			return elements[index];
		}
		else {
			System.out.println("索引位置越界！");
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
