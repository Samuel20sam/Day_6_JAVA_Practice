package com.bridgelabz.logicalprogram;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StopWatch
{
    public static void main(String[] args) throws InterruptedException {
        int i = 0;

        System.out.println("\nEnter 'y' to start");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        while (i >= 0 && input.equals("y"))
        {
            Instant instantStarted = Instant.now();

            System.out.println("\nEnter any number to lap and 0 to stop");
            int num = sc.nextInt();
            if (num != 0)
            {
                int in = 0;
                TimeUnit.MICROSECONDS.sleep(in);
                Instant instantStopped = Instant.now();
                Duration durationBetween = Duration.between(instantStarted, instantStopped);

                long ms = durationBetween.toMillis();
                long sec = durationBetween.toSeconds();
                long min = durationBetween.toMinutes();
                long hrs = durationBetween.toHours();

                System.out.println("\n" + hrs + ":" + min + ":" + sec + ":" + ms);
            }
            if (num == 0)
            {
                Instant instantStopped = Instant.now();
                Duration durationBetween = Duration.between(instantStarted, instantStopped);

                long ms = durationBetween.toMillis();
                long sec = durationBetween.toSeconds();
                long min = durationBetween.toMinutes();
                long hrs = durationBetween.toHours();

                System.out.println("\n" + hrs + ":" + min + ":" + sec + ":" + ms);

                System.exit(0);
            }
            i++;
        }
    }
}
