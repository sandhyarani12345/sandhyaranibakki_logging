class method
{
void add(int x,int y)
{
int z=x+y;
LOGGER.info("addition of two numbers is "+z);
}
void sub(int a,int b)
{
int c=a-b;
LOGGER.info("substraction of two numbers is "+c);
}
void mul(int p,int q)
{
int r=p*q;
LOGGER.info("multiplication of two numbers is "+r);
}
void div(int s,int t)
{
int v=s/t;
LOGGER.info("division of two numbers is "+v);
}
}
class expt
{
private static final Logger LOGGER = LogManager.getLogger(Apptest.class);
public static void main(String[] args)
{
LOGGER.info("This is a INFO Logger");
method m=new method();
m.add(2,4);
m.sub(5,2);
m.mul(2,3);
m.div(8,4);
}
}
