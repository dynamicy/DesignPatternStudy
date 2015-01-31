public class NameIterator implements Iterator
{
    public String names[] = { "Apple" , "Banana" ,"Car" , "Dog", "Elephant", "Fork"};
    int index;

    @Override
    public boolean hasNext()
    {
        if(index < names.length)
        {
            return true;
        }
        return false;
    }

    @Override
    public Object next()
    {
        if(this.hasNext())
        {
            return names[index++];
        }
        return null;
    }
}
