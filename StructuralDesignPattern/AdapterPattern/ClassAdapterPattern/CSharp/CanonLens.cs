using System;
using System.Collections.Generic;
using System.Text;

namespace ClassAdapter
{
    public class CanonLens
    {
        protected string mName;
        public void SetupCanonCamera(string pCamera)
        {
            Console.WriteLine(mName + " setup on camera : " + pCamera);
        }
    }
}
