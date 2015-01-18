using System;
using System.Collections.Generic;
using System.Text;

namespace ClassAdapter
{
    class ClassAdapterDemo
    {
        static void Main(string[] args)
        {
            INikonLens tNikonLens = new LensAdaptor();
            tNikonLens.SetupNikonCamera("Canon EF 70-200mm F4l USM", "Nikon D5300");

            Console.ReadKey();
        }
    }
}
