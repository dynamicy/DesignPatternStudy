using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class Factory_A : AbstractFactory
    {
        public AbstractProduct_PotatoChip Create_PotatoChip()
        {
            return new Product_PotatoChip_A();
        }

        public AbstractProduct_Chocolate Create_Chocolate()
        {
            return new Product_Chocolate_A();
        }
    }
}
