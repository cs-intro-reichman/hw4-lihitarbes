public class Primes {
    public static void main(String[] args) {
     int finaln = Integer.parseInt(args[0]);
    boolean[] isprime = new boolean[finaln + 1];
    isprime[0] = false;
    isprime[1] = false;

    for(int i = 2; i < finaln+1; i++){
        isprime[i] =true;
    }

    int p = 2;
    int count = 0;
    while(p<10){
        if(primecheck(p) == true ){
         for( int i = 2; i < finaln+1; i++) {
            if (isprime[i] == true && i!=p) {
                
            if((i % p) == 0){
                isprime[i] = false;
            }
        }
               
            }
            
         }
       
         p++;
        }
        

    System.out.println("Prime numbers up to " + finaln + ":");
    for (int i =2; i < finaln+1; i++){
        if( isprime[i] == true ) {
            System.out.println(i);
            count ++;
        }
        

    }
    int percectage = ((count) * 100)/finaln;
    System.out.println("There are " + count + " primes between 2 and " + finaln + " (" + (int)percectage + "% are primes)");
    
}
public static boolean primecheck(int p){
for (int i=2; i<p; i++){
    if(p%i == 0){
    
        return false;
    }
}
return true;
}
}



