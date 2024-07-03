package collection.list.ex3;

import java.util.LinkedList;

public class ListTest3 {

	/*
	 * 目标： 掌握LinkedList集合的使用
	*/
	public static void main(String[] args) {
		// 1.创建一个队列
		LinkedList<String> queue = new LinkedList<>();
		queue.addLast("第一号人");
		queue.addLast("第二号人");
		queue.addLast("第三号人");
		queue.addLast("第四号人");
		System.out.println(queue);
		//出队
		System.out.println(queue.removeFirst());
		System.out.println(queue.removeFirst());
		System.out.println(queue.removeFirst());
		System.out.println(queue);
		
		System.out.println("-------------------------");
		
		//2.创建一个栈对象
		LinkedList<String> stack = new LinkedList<>();
		//压栈
		stack.push("第1个盘子");
		stack.addFirst("第2个盘子");
		stack.addFirst("第3个盘子");
		stack.addFirst("第4个盘子");
		stack.addFirst("第5个盘子");
		System.out.println(stack);
		//出栈
		System.out.println(stack.poll());
		System.out.println(stack.removeFirst());
		System.out.println(stack);
	}

}
