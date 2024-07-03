package Lesson3_2.generics;

public class Pocket<E> {

	//E　仮置き
	private E data;

	//构造器后面有参数
	public Pocket(E data) {
		this.data = data;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	
	
	
}
