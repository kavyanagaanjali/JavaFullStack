/*
1.class Pattern1
{
public static void main(String [] args)
{
for(int i=1;i<=6;i++)
{
for(int j=1;j<=6;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
output:
******
******
******
******
******
******
*/
/*
2.class Pattern1
{
public static void main(String [] args)
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}
output:
11111
22222
33333
44444
55555
*/
/*
3.class Pattern1
{
public static void main(String [] args)
{
int rows=5;
int cols=5;
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=cols;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}
output:
12345
12345
12345
12345
12345
*/
/*
4.class Pattern1
{
public static void main(String [] args)
{
int count=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(count+" ");
count++;
}
System.out.println();
}
}
}
output:
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/
/*
5.class Pattern1
{
public static void main(String [] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(num+" ");
num++;
if(num>9)
{
num=1;
}
}
System.out.println();
}
}
}
output:
1 2 3 4 5
6 7 8 9 1
2 3 4 5 6
7 8 9 1 2
3 4 5 6 7
*/
/*
6.class Pattern1
{
public static void main(String [] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(num+" ");
num+=2;
}
System.out.println();
}
}
}
output:
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49
*/
/*
7.class Pattern1
{
public static void main(String [] args)
{
int num=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(j%2==1)
{
System.out.print("1");
}
else
{
System.out.print("0");
}
}
System.out.println();
}
}
}
output:
10101
10101
10101
10101
10101
*/
class Pattern1
{
public static void main(String [] args)
{
for(int i=1;i<=2*j-2;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print("  *  ");
}
System.out.println();
}
}
}