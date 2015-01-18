using System;
using System.Collections.Generic;
using System.Text;

namespace DefaultAdapter
{
    public class TextDrawer : DrawAdapter
    {
        public override void DrawText(string pText)
        {
            Console.WriteLine("Draw text:" + pText);
        }
    }
}
