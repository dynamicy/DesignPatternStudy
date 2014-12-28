using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class FactoryA : AbstractFactory
    {
        public AbstractProductPotatoChip CreatePotatoChip()
        {
            return new ProductPotatoChipA();
        }

        public AbstractProductChocolate CreateChocolate()
        {
            return new ProductChocolateA();
        }
    }
}
