using System;
using System.Collections.Generic;
using System.Text;

namespace FlyweightPattern
{
    public class FlyweightPatternDemo
    {
        static void Main(string[] args)
        {
            StoneFactory tSF = new StoneFactory();

            Stone tS01 = tSF.GetStone("Black");
            tS01.Place(new Point(15, 15));

            Stone tS02 = tSF.GetStone("White");
            tS02.Place(new Point(14, 13));

            Stone tS03 = tSF.GetStone("Black");
            tS03.Place(new Point(15, 16));

            Stone tS04 = tSF.GetStone("White");
            tS04.Place(new Point(15, 13));

            Console.ReadKey();
        }
    }
}
