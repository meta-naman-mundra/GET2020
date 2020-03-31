package priority;
/*
 * 
 */
public class Queue 
{
	//reference of array of node
	Node[] node;
	int front = 0;
	int rear = 0;

	//constructor to define the size of the array
	public Queue(int size) 
	{
		node = new Node[size];
	}

	//enqueue method to add the data into the node array
	public void enqueue(Node node) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Queue is full");
		}
		else
		{
			this.node[rear++] = node;

		}
	}

	//to check whether array is full or not
	public boolean isFull()
	{
		if(rear > node.length-1)
		{
			return true;
		}
		return false;
	}

	//private helper method to sort the array according to the priority
	private void getSorted()
	{
		for(int i=front;i<=rear;i++)
		{
			for(int j=front;j<rear-i-1;j++)
			{
				if(node[j].getPriority() > node[j+1].getPriority())
				{
					Node temp = node[j];
					node[j] = node[j+1];
					node[j+1] = temp;
				}
			}
		}
	}

	//dequeue method to delete the data or node from the array
	public Node dequeue() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is Empty");
		}
		else
		{
			getSorted();
			Node deletedNode = node[front++];
			return deletedNode;
		}
	}

	//to check whether array is empty or not
	public boolean isEmpty()
	{
		if(front == rear)
			return true;
		return false;
	}

}


 