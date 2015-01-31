using System;
using System.Collections.Generic;
using System.Text;

namespace CommandPattern
{
    public class MoveForwardCommand : Command
    {
        public MoveForwardCommand(ReceiveRole pRole)
            : base(pRole)
        {
        }
 
        public override void Execute()
        {
            mReceiveRole.Moveward();
        }
    }
}
