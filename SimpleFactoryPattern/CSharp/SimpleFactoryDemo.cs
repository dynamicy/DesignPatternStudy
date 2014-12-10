using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class SimpleFactoryDemo
    {
        public static void Main()
        {
            AbstractProductSnacks bSnacks = null;

            bSnacks = SnacksFactory.CreateSnacks("PotatoChip");
            bSnacks.GenarateSnacks();

            bSnacks = SnacksFactory.CreateSnacks("Chocolate");
            bSnacks.GenarateSnacks();
        }
    }
}
