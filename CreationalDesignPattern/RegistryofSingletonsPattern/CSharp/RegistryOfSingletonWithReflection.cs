using System;
using System.Collections.Generic;
using System.Text;
using System.Collections;

namespace DesignPatthenStudy
{
    class RegistryOfSingletonWithReflection
    {
        static void Main(string[] args)
        {
            object tSingleton = SingletonRegistry.Lookup("RegistryOfSingletonWithReflection.MySingleton");
            if (null != tSingleton)
                Console.WriteLine(((DesignPatthenStudy.MySingleton)tSingleton).InstanceValue);
        }
    }

    public class MySingleton
    {
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
            if (!mRegister.ContainsKey(pName))
                mRegister.Add(pName, pInstance);
        }

        public static object Lookup(string pName)
        {
            if (!mRegister.ContainsKey(pName))
                Register(pName, (object)Activator.CreateInstance(Type.GetType(pName)));
            return (object)mRegister[pName];
        }
    }
}
