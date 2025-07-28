class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x){
        q2.add(x); // Step 1: enqueue to q2
        while(!q1.isEmpty()){
            q2.add(q1.remove()); // Step 2: move all elements from q1 to q2
        }
        // Step 3: swap q1 and q2
        Queue<Integer> temp=q1;
        q1 =q2;
        q2 =temp;
    }

    public int pop(){
        return q1.remove(); // q1 always has the top element at front
    }

    public int top(){
        return q1.peek(); // front of q1 is the top of stack
    }

    public boolean empty(){
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */