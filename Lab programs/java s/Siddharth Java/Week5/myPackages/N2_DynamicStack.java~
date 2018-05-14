class N2_DynamicStack implements a
{
    private int stck[];
    private int tos;
    N2_DynamicStack(int size)
    {
        stck = new int[size];
        tos = -1;
    }
    public void push(int item)
    {
        if(tos==stck.length-1)
        {
            int temp[] = new int[stck.length * 2];    // double size
            for(int i=0; i<stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }
    public int pop()
    {
        if(tos < 0)
        {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class N2_FixStack

{
    public static void main(String args[])
	{
		N2_DynamicStack mystack1 = new N2_DynamicStack(5);
		N2_DynamicStack mystack2 = new N2_DynamicStack(8);
	        for(int i=0; i<12; i++)
		{
			mystack1.push(i);
		}
		for(int i=0; i<20; i++)
	        {
			mystack2.push(i);
	        }
		System.out.println("Stack in mystack1:");
		for(int i=0; i<12; i++)
		{
		System.out.println(mystack1.pop());
		}
		System.out.println("Stack in mystack2:");
		for(int i=0; i<20; i++)
		{
		System.out.println(mystack2.pop());
		}
	}
}
    class N2_DynStack
    {
        public static void main(String args[])
        {
            N2_Fixed_Stack mystack;
            N2_DynamicStack ds = new DynStack(5);
            N2_FixStack fs = new FixedStack(8);
            mystack = ds;
            for(int i=0; i<12; i++) mystack.push(i);
            mystack = fs;
            for(int i=0; i<8; i++) mystack.push(i);
            mystack = ds;
            System.out.println("Values in dynamic stack:");
            for(int i=0; i<12; i++)
            System.out.println(mystack.pop());
            mystack = fs;
            System.out.println("Values in fixed stack:");
            for(int i=0; i<8; i++)
            System.out.println(mystack.pop());
        }
    }

