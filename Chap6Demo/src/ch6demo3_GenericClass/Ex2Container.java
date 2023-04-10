package ch6demo3_GenericClass;

public class Ex2Container<T>
{
    private T obj;

    public Ex2Container() {
    	
    }
    
    public T getObj()
    {
        return obj;
    }

    public void setObj(T obj)
    {
        this.obj = obj;
    }
}