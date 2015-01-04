using System;
using System.Collections.Generic;
using System.Text;

namespace DecoratorPattern
{
    class DecoratorPatternDemon
    {
        static void Main(string[] args)
        {
            IBus tBus307 = new Bus307();
            AdBannerDecorator tAdBannerDecorator = new AdBannerDecorator();
            tAdBannerDecorator.Decorator(tBus307);
            Console.WriteLine(tAdBannerDecorator.GetDescription());

            Console.ReadKey();
        }
    }
}
