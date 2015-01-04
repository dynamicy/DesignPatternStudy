using System;
using System.Collections.Generic;
using System.Text;
using System.Collections;

namespace FlyweightPattern
{
    public class StoneFactory
    {
        private Hashtable flyweights = new Hashtable();

        public Stone GetStone(string key)
        {
            if (!flyweights.ContainsKey(key))
            {
                flyweights.Add(key, new ConcreteStone(key));
            }
            return (Stone)flyweights[key];
        }
    }
}
