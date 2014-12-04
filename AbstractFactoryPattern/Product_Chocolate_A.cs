using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class Product_Chocolate_A : AbstractProduct_Chocolate
    {
        public override void GenarateChocolate()
        {
            Console.WriteLine("Generate Chocolate A");
        }
    }
}
