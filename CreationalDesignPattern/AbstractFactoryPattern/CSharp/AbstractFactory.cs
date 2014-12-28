using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    interface AbstractFactory
    {
        AbstractProductPotatoChip CreatePotatoChip();
        AbstractProductChocolate CreateChocolate();
    }
}
