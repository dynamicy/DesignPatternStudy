using System;
using System.Collections.Generic;
using System.Text;

namespace CommandPattern
{
    public class TurnLeftCommand : Command
    {
        public TurnLeftCommand(ReceiveRole pRole)
            : base(pRole)
        {
        }
 
        public override void Execute()
        {
            mReceiveRole.TurnLeft();
        }
    }
}
