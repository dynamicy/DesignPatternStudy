using System;
using System.Collections.Generic;
using System.Text;

namespace FlyweightPattern
{
    public class Point
    {
        private int X;
        private int Y;

        public Point(int x, int y)
        {
            X = x;
            Y = y;
        }

        public string Placed()
        {
            return "(" + X + "," + Y + ")";
        }
    }
}
