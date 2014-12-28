import java.util.*;

public class BuilderPattern {
	public static void main(String args[])
	{
        // Create director and builders
        Director tDirector = new Director();

        Builder tBuilder1 = new ConcreteBuilder1();
        Builder tBuilder2 = new ConcreteBuilder2();

        // Construct two products
        tDirector.Construct(tBuilder1);
        Product tProduct1 = tBuilder1.GetResult();
        tProduct1.Show();

        tDirector.Construct(tBuilder2);
        Product tProduct2 = tBuilder2.GetResult();
        tProduct2.Show();
	}
}

class Director
{
    public void Construct(Builder builder)
    {
        builder.BuildPartA();
        builder.BuildPartB();
    }
}

abstract class Builder
{
    public abstract void BuildPartA();
    public abstract void BuildPartB();
    public abstract Product GetResult();
}

class ConcreteBuilder1 extends Builder
{
    private Product mProduct = new Product();

    public void BuildPartA()
    {
        mProduct.Add("Part A");
    }

    public void BuildPartB()
    {
        mProduct.Add("Part B");
    }

    public Product GetResult()
    {
        return mProduct;
    }
}

class ConcreteBuilder2 extends Builder
{
    private Product mProduct = new Product();

    public void BuildPartA()
    {
        mProduct.Add("Part X");
    }

    public void BuildPartB()
    {
        mProduct.Add("Part Y");
    }

    public Product GetResult()
    {
        return mProduct;
    }
}

class Product
{
    private ArrayList<String> szParts = new ArrayList<String>();

    public void Add(String pPart)
    {
        szParts.add(pPart);
    }

    public void Show()
    {
    	System.out.println("\nParts on product:");
        for(int i = 0; i < szParts.size(); ++i)
        	System.out.println(szParts.get(i));
    }
}