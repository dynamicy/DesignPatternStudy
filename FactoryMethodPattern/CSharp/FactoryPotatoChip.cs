using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class FactoryPotatoChip : IFactory
    {
        public AbstractProductSnacks CreateSnacks()
        {
            return new ProductPotatoChip();
        }
    }
}
