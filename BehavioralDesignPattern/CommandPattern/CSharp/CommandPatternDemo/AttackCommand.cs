using System;
using System.Collections.Generic;
using System.Text;

namespace CommandPattern
{
    public class AttackCommand : Command
    {
        public AttackCommand(ReceiveRole pRole)
            : base(pRole)
        {
        }
 
        public override void Execute()
        {
            mReceiveRole.Attack();
        }
    }
}
