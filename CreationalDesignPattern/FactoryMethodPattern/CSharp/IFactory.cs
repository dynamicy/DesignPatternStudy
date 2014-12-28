using System;
using System.Collections.Generic;
using System.Text;

namespace DesignPatthenStudy
{
    interface IFactory
    {
        AbstractProductSnacks CreateSnacks();
    }
}
