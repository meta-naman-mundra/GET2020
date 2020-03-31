package priority;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;
public class TestQueue 
{
	int size = 5;
	@Test
	public void test1()
	{
		Queue PriorityQueue = new Queue(size);
		try 
		{
			PriorityQueue.enqueue(new Node(1, 1));
			PriorityQueue.enqueue(new Node(2, 2));
			PriorityQueue.enqueue(new Node(3, 3));
			PriorityQueue.enqueue(new Node(4, 4));
			PriorityQueue.enqueue(new Node(5, 5));
			PriorityQueue.enqueue(new Node(6, 6));
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void test2()
	{
		Queue PriorityQueue = new Queue(size);
		try 
		{
			PriorityQueue.enqueue(new Node(1, 1));
			PriorityQueue.enqueue(new Node(2, 2));
			PriorityQueue.enqueue(new Node(3, 3));
			PriorityQueue.enqueue(new Node(4, 4));
			PriorityQueue.enqueue(new Node(5, 5));
			assertEquals(1, PriorityQueue.dequeue().getData());
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void test3()
	{
		Queue PriorityQueue = new Queue(size);
		try 
		{
			assertTrue(PriorityQueue.isEmpty());
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void test4()
	{
		Queue PriorityQueue = new Queue(size);
		try 
		{
			assertFalse(PriorityQueue.isFull());
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void test5()
	{
		Queue PriorityQueue = new Queue(size);
		try 
		{
			assertEquals(1, PriorityQueue.dequeue().getData());
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
