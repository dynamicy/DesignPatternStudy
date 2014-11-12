#include <iostream>

using namespace std;
　　
class Singleton
{
    public:
        static Singleton& GetInstance()
        {
            return instance;
        }
        
        void Print()
        {
            cout<<"I'm singleton\n";
        }

    private:
        Singleton()
        {
        }
        static Singleton instance;
};

Singleton Singleton::instance;

int main(int argc, char **argv)
{
    Singleton::GetInstance().Print();
    return 0;
}
