using System;
using System.Collections.Generic;
using System.Text;

namespace ObjectAdapter
{
    public class LensAdaptor : NikonLens
    {
        private CanonLens mCanonLens = null;

        public LensAdaptor(string pName)
            : base(pName)
        {
            mCanonLens = new CanonLens(pName);
        }

        public override void SetupNikonCamera(string pCamera)
        {
            mCanonLens.SetupCanonCamera(pCamera);
        }
    }
}
