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
            AbstractProduct_PotatoChip bPotatoChip = null;
            AbstractProduct_Chocolate bChocolate = null;

            tFactory = new Factory_A();
            bPotatoChip = tFactory.Create_PotatoChip();
            bPotatoChip.GenaratePotatoChip();
            bChocolate = tFactory.Create_Chocolate();
            bChocolate.GenarateChocolate();

            tFactory = new Factory_B();
            bPotatoChip = tFactory.Create_PotatoChip();
            bPotatoChip.GenaratePotatoChip();
            bChocolate = tFactory.Create_Chocolate();
            bChocolate.GenarateChocolate();
        }
    }
}
