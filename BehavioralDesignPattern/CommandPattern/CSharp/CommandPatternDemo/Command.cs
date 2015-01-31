using System;
using System.Collections.Generic;
using System.Text;

namespace CommandPattern
{
    public abstract class Command
    {
        protected ReceiveRole mReceiveRole;

        public Command(ReceiveRole pRole)
        {
            mReceiveRole = pRole;
        }

        public abstract void Execute();
    }
}
