using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class ProductPotatoChipA : AbstractProductPotatoChip
    {
        public override void GenaratePotatoChip()
        {
            Console.WriteLine("Generate PotatoChip A");
        }
    }
}
