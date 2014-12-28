using System;
using System.Collections.Generic;
using System.Text;

namespace BridgePattern
{
    class ConcreteImplementorB : Implementor
    {
        public override void Operation()
        {
            Console.WriteLine("ConcreteImplementorB Operation");
        }
    }
}
