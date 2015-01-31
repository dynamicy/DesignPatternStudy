using System;
using System.Collections.Generic;
using System.Text;
using System.Collections;

namespace IteratorPattern
{
    public class ConcreteAggregate : Aggregate
    {
        private ArrayList mItems = new ArrayList();

        public override Iterator CreateIterator()
        {
            return new ConcreteIterator(this);
        }

        public int Count
        {
            get { return mItems.Count; }
        }

        public object this[int index]
        {
            get { return mItems[index]; }
            set { mItems.Insert(index, value); }
        }
    }
}
