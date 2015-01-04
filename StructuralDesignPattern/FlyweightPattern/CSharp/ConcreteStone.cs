using System;
using System.Collections.Generic;
using System.Text;

namespace FlyweightPattern
{
    public class ConcreteStone : Stone
    {
        private string Name = "";
        public ConcreteStone(string name)
        {
            this.Name = name;
        }

        public override void Place(Point point)
        {
            Console.WriteLine(Name + " stone place on " + point.Placed());
        }
    }
}
