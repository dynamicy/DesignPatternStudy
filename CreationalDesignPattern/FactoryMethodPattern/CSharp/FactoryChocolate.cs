using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    class Factory_Chocolate : IFactory
    {
        public AbstractProductSnacks CreateSnacks()
        {
            return new ProductChocolate();
        }
    }
}
