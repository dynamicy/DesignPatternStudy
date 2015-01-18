using System;
using System.Collections.Generic;
using System.Text;

namespace DefaultAdapter
{
    public interface IDraw
    {
        void DrawCircle(int pRadius);
        void DrawLine(int pLength);
        void DrawText(string pText);
    }
}
