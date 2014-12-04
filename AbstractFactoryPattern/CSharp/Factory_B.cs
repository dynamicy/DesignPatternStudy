using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class Factory_B : AbstractFactory
    {
        public AbstractProduct_PotatoChip Create_PotatoChip()
        {
            return new Product_PotatoChip_B();
        }

        public AbstractProduct_Chocolate Create_Chocolate()
        {
            return new Product_Chocolate_B();
        }
    }
}
