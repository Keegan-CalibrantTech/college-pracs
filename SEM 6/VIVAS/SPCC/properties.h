int fact(x)
{
    int p=1, i=1;      
    for(i=1; i<=x; i++)
    {
        p = p * i;          
    }                    
    return p;                  
}
#define sum_n(n) n * (n + 1) / 2
int print_factors(n)
{
    int i;  
    for(i=1; i<=n; i++){  
        if(n%i == 0){        
            printf("%d ", i);
        }                    
    }                        
}