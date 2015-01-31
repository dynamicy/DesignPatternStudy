using System;
using System.Collections.Generic;
using System.Text;

namespace IteratorPattern
{
    public class ConcreteIterator : Iterator
    {
        private ConcreteAggregate mAggregate;
        private int mCurrent = 0;

        public ConcreteIterator(ConcreteAggregate pAggregate)
        {
            this.mAggregate = pAggregate;
        }

        public override object First()
        {
            return mAggregate[ConvertIndex(0)];
        }

        public override object Next()
        {
            object tResult = null;
            if (mCurrent < mAggregate.Count - 1)
            {
                tResult = mAggregate[ConvertIndex(++mCurrent)];
            }

            return tResult;
        }

        public override object CurrentItem()
        {
            return mAggregate[ConvertIndex(mCurrent)];
        }

        public override bool IsDone()
        {
            return mCurrent >= mAggregate.Count;
        }

        private int ConvertIndex(int pIndex)
        {
            int nNewIndex = 0;
            if (0 == pIndex % 2)
            {
                nNewIndex = pIndex / 2;
            }
            else
            {
                nNewIndex = (pIndex - 1) / 2 + ((0 == mAggregate.Count % 2) ? mAggregate.Count / 2 : (mAggregate.Count - 1 / 2));
            }

            return nNewIndex;
        }
    }
}
