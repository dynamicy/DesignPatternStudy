using System;
using System.Collections.Generic;
using System.Text;

namespace DefaultAdapter
{
    public abstract class DrawAdapter : IDraw
    {
        public virtual void DrawCircle(int pRadius) { }
        public virtual void DrawLine(int pLength) { }
        public virtual void DrawText(string pText) { }
    }
}
