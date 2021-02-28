package com.example.JavaPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import AlgoExpert.MaxSubsetSumNoAdjacent;

@SpringBootApplication
public class JavaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaPracticeApplication.class, args);
		int[] array = new int[]{75,105,120,75,90,135};
		System.out.println(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(array));
	}

}
