using System;
using System.Collections.Generic;
using System.Text;

namespace DecoratorPattern
{
    public class Bus307 : IBus
    {
        public string GetDescription()
        {
            return "This is a bus(line 307)";
        }
    }
}
