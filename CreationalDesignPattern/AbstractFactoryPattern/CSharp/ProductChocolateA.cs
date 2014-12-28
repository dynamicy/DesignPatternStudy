using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class ProductChocolateA : AbstractProductChocolate
    {
        public override void GenarateChocolate()
        {
            Console.WriteLine("Generate Chocolate A");
        }
    }
}
