using System;
using System.Collections.Generic;
using System.Text;

namespace CommandPattern
{
    public class Invoker
    {
        private List<Command> mCommands = new List<Command>();

        public void SetCommand(Command pCommand)
        {
            mCommands.Add(pCommand);
        }
        
        public void CancelCommand(Command pCommand)
        {
            mCommands.Remove(pCommand);
        }

        public void NotifyExecute ()
        {
            foreach (Command tCommand in mCommands)
            {
                tCommand.Execute();
            }
        }
 
    }
}
