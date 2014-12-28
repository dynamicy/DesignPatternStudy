using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class ProductChocolate : AbstractProductSnacks
    {
        public override void GenarateSnacks()
        {
            Console.WriteLine("Generate Chocolate");
        }
    }
}
