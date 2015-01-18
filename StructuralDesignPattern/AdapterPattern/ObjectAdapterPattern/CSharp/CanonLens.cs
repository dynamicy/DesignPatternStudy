using System;
using System.Collections.Generic;
using System.Text;

namespace ObjectAdapter
{
    public class CanonLens
    {
        protected string mName;

        public CanonLens(string pName)
        {
            mName = pName;
        }

        public void SetupCanonCamera(string pCamera)
        {
            Console.WriteLine(mName + " setup on camera : " + pCamera);
        }
    }
}
