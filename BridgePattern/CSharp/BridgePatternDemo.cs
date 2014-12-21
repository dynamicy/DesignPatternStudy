using System;
using System.Collections.Generic;
using System.Text;

namespace BridgePattern
{
    class BridgePatternDemo
    {
        static void Main(string[] args)
        {
            Abstraction ab = new RefinedAbstraction();

            ab.Implementor = new ConcreteImplementorA();
            ab.Operation();

            ab.Implementor = new ConcreteImplementorB();
            ab.Operation();

            // Wait for user
            Console.ReadKey();
        }
    }
}
