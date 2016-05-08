package com.newtalent.www;

/**
 * MyList泛型借口
 * 定义List的公共操作
 * 具体的实现可以分为Array & LinkedList
 * @author AllenLee
 *
 */
public interface MyList<E> {
	
	/**
	 *添加一个元素到List 
	 * @param e
	 */
	public void add(E e);
	
	
	/**
	 * 按位置添加元素
	 * @param index
	 * @param e
	 */
	public void add(int index,E e);
	
	
	/**
	 * 清楚所有元素
	 */
	public void clear();
	
	
	/**
	 * 判断是否含有某元素
	 * @param e
	 * @return
	 */
	public boolean contains(E e);
	
	
	/**
	 * 按位置获取元素
	 * @param index
	 * @return
	 */
	public E get(int index);
	
	
	/**
	 * 获取某元素的具体索引位置
	 * @param e
	 * @return
	 */
	public int indexOf(E e);
	
	
	/**
	 * 判断表是否为空
	 * @return
	 */
	public boolean isEmpty();
	
	
	/**
	 * 获取该元素在数组中最后出现的索引位置
	 * @param e
	 * @return
	 */
	public int lastIndexOf(E e);
	
	
	/**
	 * 删除某元素
	 * @param e
	 * @return
	 */
	public boolean remove(E e);
	
	
	/**
	 * 删除该位置的元素
	 * @param index
	 * @return
	 */
	public E remove(int index);
	
	
	/**
	 * 设置某位置的元素
	 * @param index
	 * @param e
	 * @return
	 */
	public Object set(int index, E e);
	
	/**
	 * 获取表大小
	 * @return
	 */
	public int size();

}
