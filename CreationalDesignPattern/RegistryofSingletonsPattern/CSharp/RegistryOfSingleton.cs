using System;
using System.Collections.Generic;
using System.Text;
using System.Collections;

namespace DesignPatthenStudy
{
    class RegistryOfSingleton
    {
        static void Main(string[] args)
        {
            SingletonRegistry.Register("RegistryOfSingleton.MySingleton", new MySingleton());

            object tSingleton = SingletonRegistry.Lookup("RegistryOfSingleton.MySingleton");
            if (null != tSingleton)
                Console.WriteLine(((DesignPatthenStudy.MySingleton)tSingleton).InstanceValue);
        }
    }

    public sealed class MySingleton
    {
        public MySingleton() {}

        public string InstanceValue
        {
            get { return "This is MySingleton"; }
        }
    }

    public class SingletonRegistry
    {
        private static Dictionary<string, object> mRegister = new Dictionary<string, object>();
        private SingletonRegistry() { }

        public static void Register(string pName, object pInstance)
		{
            if(!mRegister.ContainsKey(pName))
                mRegister.Add(pName, pInstance);
		}

        public static object Lookup(string pName)
		{
            if (!mRegister.ContainsKey(pName))
                return null;
            else
                return (object)mRegister[pName];
		}
    }
}
