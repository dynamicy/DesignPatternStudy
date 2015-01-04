using System;
using System.Collections.Generic;
using System.Text;

namespace DecoratorPattern
{
    public class AdBannerDecorator : BusDecorator
    {
        public override void Decorator(IBus Bus)
        {
            base.Decorator(Bus);
        }

        public override string GetDescription()
        {
            return mBus.GetDescription() + " with ad banner";
        }
    }
}
