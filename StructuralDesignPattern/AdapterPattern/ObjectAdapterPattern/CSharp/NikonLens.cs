using System;
using System.Collections.Generic;
using System.Text;

namespace ObjectAdapter
{
    public abstract class NikonLens
    {
        protected string mName;

        public NikonLens(string pName)
        {
            mName = pName;
        }

        public abstract void SetupNikonCamera(string pCamera);
    }
}
