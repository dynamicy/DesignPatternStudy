using System;
using System.Collections.Generic;
using System.Text;

namespace BuilderPatternStudy
{
    class BuilderPattern
    {
        static void Main(string[] args)
        {
            // Create director and builders
            Director tDirector = new Director();

            Builder tBuilder1 = new ConcreteBuilder1();
            Builder tBuilder2 = new ConcreteBuilder2();

            // Construct two products
            tDirector.Construct(tBuilder1);
            Product tProduct1 = tBuilder1.GetResult();
            tProduct1.Show();

            tDirector.Construct(tBuilder2);
            Product tProduct2 = tBuilder2.GetResult();
            tProduct2.Show();
        }
    }

    /// <summary>
    /// Director
    /// </summary>
    class Director
    {
        /// <summary>
        /// Construct the product by using Builder
        /// </summary>
        /// <param name="builder"></param>
        public void Construct(Builder builder)
        {
            builder.BuildPartA();
            builder.BuildPartB();
        }
    }

    /// <summary>
    /// Builder
    /// </summary>
    abstract class Builder
    {
        /// <summary>
        /// The product contains two parts
        /// </summary>
        public abstract void BuildPartA();
        public abstract void BuildPartB();

        /// <summary>
        /// Get builded product
        /// </summary>
        /// <returns></returns>
        public abstract Product GetResult();
    }

    /// <summary>
    /// ConcreteBuilder1
    /// </summary>
    class ConcreteBuilder1 : Builder
    {
        private Product mProduct = new Product();

        public override void BuildPartA()
        {
            mProduct.Add("Part A");
        }

        public override void BuildPartB()
        {
            mProduct.Add("Part B");
        }

        public override Product GetResult()
        {
            return mProduct;
        }
    }

    /// <summary>
    /// ConcreteBuilder2
    /// </summary>
    class ConcreteBuilder2 : Builder
    {
        private Product mProduct = new Product();

        public override void BuildPartA()
        {
            mProduct.Add("Part X");
        }

        public override void BuildPartB()
        {
            mProduct.Add("Part Y");
        }

        public override Product GetResult()
        {
            return mProduct;
        }
    }

    /// <summary>
    /// Product
    /// </summary>
    class Product
    {
        private List<string> szParts = new List<string>();

        /// <summary>
        /// Add one part in Product
        /// </summary>
        /// <param name="pPart"></param>
        public void Add(string pPart)
        {
            szParts.Add(pPart);
        }

        /// <summary>
        /// Enum all parts of product
        /// </summary>
        public void Show()
        {
            Console.WriteLine("\nParts on product:");
            foreach (string szPart in szParts)
                Console.WriteLine(szPart);
        }
    }
}
