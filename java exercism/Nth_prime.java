class PrimeCalculator {

    int nth(int nth) {
        if (nth <= 0){
        throw new IllegalArgumentException("Delete this statement and write your own implementation.");
        }
        if (nth == 1) {
            return 2;
        }
        
        int count=0;
        int number=2;
        while(count<nth){
            if (isPrime(number)){
                count++;
            }
            if(count<nth){
                number++;
            }
        }
        return number;
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
