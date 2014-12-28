using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class FactoryB : AbstractFactory
    {
        public AbstractProductPotatoChip CreatePotatoChip()
        {
            return new ProductPotatoChipB();
        }

        public AbstractProductChocolate CreateChocolate()
        {
            return new ProductChocolateB();
        }
    }
}
