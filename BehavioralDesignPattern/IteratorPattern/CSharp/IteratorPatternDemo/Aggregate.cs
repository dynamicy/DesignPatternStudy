using System;
using System.Collections.Generic;
using System.Text;

namespace IteratorPattern
{
    public abstract class Aggregate
    {
        public abstract Iterator CreateIterator();
    }
}
