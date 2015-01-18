using System;
using System.Collections.Generic;
using System.Text;

namespace DefaultAdapter
{
    class DefaultAdapterDemo
    {
        static void Main(string[] args)
        {
            IDraw tDrawObj = new TextDrawer();
            tDrawObj.DrawText("I'm the king of the world");

            Console.ReadKey();
        }
    }
}
