using System;
using System.Collections.Generic;
using System.Text;

namespace CommandPattern
{
    public class TurnRightCommand : Command
    {
        public TurnRightCommand(ReceiveRole pRole)
            : base(pRole)
        {
        }
 
        public override void Execute()
        {
            mReceiveRole.TurnRight();
        }
    }
}
