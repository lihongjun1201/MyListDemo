package com.newtalent.www;


/**
 * 抽象表类
 * 实现泛型List接口
 * 
 * @author AllenLee
 * @param <E>
 *
 */
public abstract class MyAbstractList<E> implements MyList<E> {

	protected int size = 0;
	
	/**
	 * 默认构造函数
	 */
	protected  MyAbstractList() {
		
	}
	
	/**
	 * 传入数组以构造线性表
	 * @param elements
	 */
	protected MyAbstractList(E[] elements){
		for (int i = 0; i < elements.length; i++) {
			add(elements[i]);
		}
	}
	
	/**
	 * 默认在尾部添加新元素
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
