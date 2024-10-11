public class Main {
    public static void main(String[] args) {

        int n = 100; // First 100 prime numbers
        int num = 3; // Start checking for primes from 3
        int count = 1; // Already counted '2' as a prime

        System.out.println("Hello World!");
        System.out.println("First " + n + " prime numbers are:");
        System.out.println(2); // Print the first prime number

        while (count < n) { // Loop until we find n primes
            boolean isPrime = true; // Assume num is prime
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false; // Not prime
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
                count++; // Increment count of primes found
            }
            num++; // Check the next number
        }

    }
}