using System;
using System.Collections.Generic;
using System.Text;

namespace IteratorPattern
{
    public class IteratorPatternDemo
    {
        static void Main(string[] args)
        {
            ConcreteAggregate tConcreteAggregate = new ConcreteAggregate();
            tConcreteAggregate[0] = "Item 1";
            tConcreteAggregate[1] = "Item 2";
            tConcreteAggregate[2] = "Item 3";
            tConcreteAggregate[3] = "Item 4";
 
            ConcreteIterator tConcreteIterator = new ConcreteIterator(tConcreteAggregate);
 
            object tItem = tConcreteIterator.First();
            while (tItem != null)
            {
                Console.WriteLine(tItem);
                tItem = tConcreteIterator.Next();
            }
            Console.ReadKey();
        }
    }
}
