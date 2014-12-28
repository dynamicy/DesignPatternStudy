using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class AbstractFactoryDemo
    {
        public static void Main()
        {
            AbstractFactory tFactory = null;
            AbstractProductPotatoChip bPotatoChip = null;
            AbstractProductChocolate bChocolate = null;

            tFactory = new FactoryA();
            bPotatoChip = tFactory.CreatePotatoChip();
            bPotatoChip.GenaratePotatoChip();
            bChocolate = tFactory.CreateChocolate();
            bChocolate.GenarateChocolate();

            tFactory = new FactoryB();
            bPotatoChip = tFactory.CreatePotatoChip();
            bPotatoChip.GenaratePotatoChip();
            bChocolate = tFactory.CreateChocolate();
            bChocolate.GenarateChocolate();
        }
    }
}
