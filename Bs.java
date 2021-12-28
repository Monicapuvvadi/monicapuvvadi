import java.util.*;
public class Bs
{
static int i,a[],max=7,key,temp=0;
static Scanner sc;
public static void binarysearch(int a[],int key)
{
int l=0,h=max-1,m;
while(l<=h)
{
m=(l+h)/2;
if(a[m]==key)
{
System.out.println("elements found");
temp=1;
break;
}
else if(a[m]<key)
l=m+1;
else
h=m-1;
}
if(temp==0)
System.out.println("elements not found");
}
public static void main(String args[])
{
sc=new Scanner(System.in);
a=new int[max];
System.out.println("enter array element");
for(int i=0;i<max;i++)
a[i]=sc.nextInt();
System.out.println("enter key element");
key=sc.nextInt();
binarysearch(a,key);
}
}
