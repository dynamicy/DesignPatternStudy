using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class ProductPotatoChip : AbstractProductSnacks
    {
        public override void GenarateSnacks()
        {
            Console.WriteLine("Generate PotatoChip");
        }
    }
}
