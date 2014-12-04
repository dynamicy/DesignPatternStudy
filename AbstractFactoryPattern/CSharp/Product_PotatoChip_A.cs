using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class Product_PotatoChip_A : AbstractProduct_PotatoChip
    {
        public override void GenaratePotatoChip()
        {
            Console.WriteLine("Generate PotatoChip A");
        }
    }
}
