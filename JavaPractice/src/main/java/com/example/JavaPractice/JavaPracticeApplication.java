package com.example.JavaPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import AlgoExpert.MatrixAndGraph;
import AlgoExpert.MaxSubsetSumNoAdjacent;

@SpringBootApplication
public class JavaPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaPracticeApplication.class, args);
		
		MatrixAndGraph.GenerateAdj_dict();
		MatrixAndGraph.TraverseBFT();
		
	}

}
