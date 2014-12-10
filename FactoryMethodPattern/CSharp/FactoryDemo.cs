using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class FactoryDemo
    {
        public static void Main()
        {
            IFactory tFactory = null;
            AbstractProductSnacks bSnacks = null;

            tFactory = new FactoryPotatoChip();
            bSnacks = tFactory.CreateSnacks();
            bSnacks.GenarateSnacks();

            tFactory = new Factory_Chocolate();
            bSnacks = tFactory.CreateSnacks();
            bSnacks.GenarateSnacks();
        }
    }
}
