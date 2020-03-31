package priority;

//POJO class of node
public class Node 
{

	private int data;
	private int priority;

	//constructor to initialize the properties of Node
	public Node(int data, int priority)
	{
		this.data = data;
		this.priority = priority;
	}

	//return the data of the node
	public int getData() 
	{
		return data;
	}

	//return the priority of the node
	public int getPriority() 
	{
		return priority;
	}



}
 