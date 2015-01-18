using System;
using System.Collections.Generic;
using System.Text;

namespace ObjectAdapter
{
    class ObjectAdapterDemo
    {
        static void Main(string[] args)
        {
            NikonLens tNikonLens = new LensAdaptor("Canon EF 70-200mm F4l USM");
            tNikonLens.SetupNikonCamera("Nikon D5300");

            Console.ReadKey();
        }
    }
}
