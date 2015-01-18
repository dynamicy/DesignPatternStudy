using System;
using System.Collections.Generic;
using System.Text;

namespace ClassAdapter
{
    public class LensAdaptor : CanonLens, INikonLens
    {
        public void SetupNikonCamera(string pLens, string pCamera)
        {
            this.mName = pLens;
            this.SetupCanonCamera(pCamera);
        }
    }
}
