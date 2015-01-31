using System;
using System.Collections.Generic;
using System.Text;

namespace CommandPattern
{
    class CommandPatternDemo
    {
        static void Main(string[] args)
        {
            Invoker tInvoker = new Invoker();
            ReceiveRole tRole = new ReceiveRole();
            MoveForwardCommand tMoveForwardCommand = new MoveForwardCommand(tRole);
            TurnLeftCommand tTurnLeftCommand = new TurnLeftCommand(tRole);
            TurnRightCommand tTurnRightCommand = new TurnRightCommand(tRole);
            AttackCommand tAttackCommand = new AttackCommand(tRole);

            // set command list
            tInvoker.SetCommand(tTurnLeftCommand);
            tInvoker.SetCommand(tMoveForwardCommand);
            tInvoker.SetCommand(tMoveForwardCommand);
            tInvoker.SetCommand(tTurnRightCommand);
            tInvoker.SetCommand(tMoveForwardCommand);
            tInvoker.SetCommand(tAttackCommand);

            // Notify the role to execute command
            tInvoker.NotifyExecute();

            Console.ReadKey();
        }
    }
}
