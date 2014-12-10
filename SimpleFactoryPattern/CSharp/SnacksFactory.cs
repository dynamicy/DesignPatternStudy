using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class SnacksFactory
    {
        public static AbstractProductSnacks CreateSnacks(string pProductName)
        {
            AbstractProductSnacks pSnacks = null;
            switch (pProductName)
            {
                case "PotatoChip":
                    pSnacks = new ProductPotatoChip();
                    break;
                case "Chocolate":
                    pSnacks = new ProductChocolate();
                    break;
                default:
                    throw new Exception("UNKNOWN PRODUCT");
 
            }
            return pSnacks;
        }
    }
}
