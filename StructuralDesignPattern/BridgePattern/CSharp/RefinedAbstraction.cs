using System;
using System.Collections.Generic;
using System.Text;

namespace BridgePattern
{
    class RefinedAbstraction : Abstraction
    {
        public override void Operation()
        {
            implementor.Operation();
        }
    }
}
