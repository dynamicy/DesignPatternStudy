using System;
using System.Collections.Generic;
using System.Text;

namespace CommandPattern
{
    public class ReceiveRole
    {
        public void Moveward()
        {
            Console.WriteLine("Move forward");
        }

        public void TurnLeft()
        {
            Console.WriteLine("Turn left");
        }

        public void TurnRight()
        {
            Console.WriteLine("Turn right");
        }

        public void Attack()
        {
            Console.WriteLine("Attack");
        }

    }
}
