
public class CircularQueue{

	private int[] array;
	private int front = 0;
	private int rear = 0;
	private int count = 0;
	private int size = 0;
	private Boolean override = true;
	// if override is true, enqueue() will overwrite the oldest element in array when it is full
	// if override is false, enqueue() will throw exception message when array is full
	
	
	public CircularQueue(int size) {
		this.array = new int[size+1];
		this.size = size;
	}
	
	public CircularQueue(){
		this.array = new int[11]; 
		this.size = 10; //default size of 10
	}

	public synchronized void initialize(int[] array1){
		if(array1.length > size ){
			System.out.println("Can not initialize : Bigger size");
		} else {
			for(int i=0; i< array1.length; i++ ){
				enqueue(array1[i]);
			}
			//display();
		}
	}
	

	public synchronized void enqueue(int value){
		if(count == size){
			if(!override) {
				System.out.println("Exception : Queue is Full");
			} else {
				rear = (rear % (size)) + 1;
				System.out.println("Overwriting the value :"+array[rear]);
				array[rear] = value;
				front = (front % (size)) + 1;
			}
		}else{
			rear = (rear % (size)) + 1;
			array[rear] = value;
			count++;
		}
	}
	
	public synchronized void dequeue(){
		if(count == 0){
			System.out.println("Queue is Empty");
		}else{
			front = (front % (size)) + 1;
			System.out.println("Element Deleted : "+array[front]);
			array[front]= 0;
			count--;
		}
		
	}
	
	//0th element in array is not part of circular queue, so never displayed
	public synchronized void display(){
		for(int i= 1; i<=size; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("");
	}
	
	
}
