package edu.trenirovkadoma.algoritmyistructurydannyh;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long [] mem = new long[n + 1];

        Arrays.fill(mem, -1);

        System.out.println(FibNaive(n, mem));

    }

    //наивный, медленный, очевидный алгоритм, но уже с мемоизацией, поэтому стал быстрым
    private static long FibNaive(int n, long[] mem) {
        if(mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;
        long result = FibNaive(n - 1, mem) + FibNaive(n - 2, mem);
        mem[n] = result;

        return result;
    }
    //медленный простой
    private static long FibNaive2(int n){
        if(n <= 1)
            return n;
        return FibNaive2(n - 1) + FibNaive2(n - 2);
    }

// быстрый алгоритм О(n)
    private static long FibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];
            return arr[n];
    }
}

