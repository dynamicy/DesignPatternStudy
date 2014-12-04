using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    interface AbstractFactory
    {
        AbstractProduct_PotatoChip Create_PotatoChip();
        AbstractProduct_Chocolate Create_Chocolate();
    }
}
