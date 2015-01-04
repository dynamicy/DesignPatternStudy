using System;
using System.Collections.Generic;
using System.Text;

namespace DecoratorPattern
{
    public abstract class BusDecorator : IBus
    {
        protected IBus mBus;

        public virtual void Decorator(IBus Bus)
        {
            this.mBus = Bus;
        }

        public virtual string GetDescription()
        {
            return mBus.GetDescription() + " with Decorator";
        }
    }
}
