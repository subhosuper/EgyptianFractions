import java.io.*;
class egyptian_fraction
{
    int cases,eg_frac; 
    int fraction; 
    double res; 
    int c=0; 
    int a,b; 
    int cmf; 
    int p; 
    int z=0; 
    String output="";
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        cases=Integer.parseInt(br.readLine());
        
        p=cases;
        while(p!=0)
        {
            res=z=a=b=c=cmf=0;
            egyptian_frac();
            p--;
            if(p==0)
        {System.out.println(output);}
        }
    }
    private void egyptian_frac()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        eg_frac=Integer.parseInt(br.readLine());
        for(int i=1;i<=eg_frac;i++)
        {
            fraction=Integer.parseInt(br.readLine());
            solve(fraction); 
            output(fraction,i);       
          
        }
        
        
    }
    private void output(int fraction,int i)
    {
        if(i==1 && eg_frac!=1)
        {output=output+"1/"+Integer.toString(fraction);}
        else if(i>1 && i<eg_frac)
        {output=output+" + 1/"+Integer.toString(fraction);}
        else if(i==1 && eg_frac==1)
        {
            
            output=output+"1/"+Integer.toString(fraction)+" = 1/"+Integer.toString(fraction)+ "\n";
        }
        else if(eg_frac!=1 && i==eg_frac)
        {
            reduce();
            output=output+" + 1/"+Integer.toString(fraction)+" = "+ a/cmf +"/"+Integer.toString(b/cmf)+"\n";
        }
        
    }
    
    private void solve(int fraction)
    {
        res=res+(1/(double)fraction);
    }

private void reduce()
{
     while(res%1!=0 && c<=4)
            {
                res=res*10;
                c++;
            }
            a=(int)res;
            b=(int)Math.pow(10,c);
    int d=0;
    d=(a>=b)?a:b;
    for(int i=2;i<=d;i++)
    {
        if(a%i==0 && b%i==0)
        {cmf=i; break;}
    }
    
}
}
