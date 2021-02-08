package _09_Ternary;

import java.util.Scanner;

public class Practice_2_Grades {
	/*
	 Write a method and calculate grade of three exams with the given values
A==> 90-100
B==>80-89
C==>70-79
D==>60-69
F==>0-59
EXAMPLE:
INPUT      :        Math=70
                   Science=60
                   Chemistry=89

                   A==> 90-100
                   B==>80-89
                   C==>70-79
                   D==>60-69
                   F==>0-59

OUTPUT  :           Math Grade =  C
                   Science Grade = D
                   Chemistry Grade = B

	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your Math grade ? ");
		int mathGrade = scan.nextInt();
		System.out.println(mathGrade>=90 && mathGrade <=100 ? "Math Grade = A" : mathGrade>=80 && mathGrade <=89 ? 
		"Math Grade = B" : mathGrade>=70 && mathGrade <=79 ? "Math Grade = C" : mathGrade>=60 && mathGrade <=69 ? 
		"Math Grade = D" : mathGrade>=0 && mathGrade <=59 ? "Math Grade = F" : "Wrong grade");
		
		System.out.println("What is your Science grade ? ");
		int scienceGrade = scan.nextInt();
		System.out.println(scienceGrade>=90 && scienceGrade <=100 ? "Science Grade = A" : scienceGrade>=80 && scienceGrade <=89 ? 
		"Science Grade = B" : scienceGrade>=70 && scienceGrade <=79 ? "Science Grade = C" : scienceGrade>=60 && scienceGrade <=69 ?
		"Science Grade = D" :scienceGrade>=0 && scienceGrade <=59 ? "Science Grade = F" : "Wrong grade");
		
		System.out.println("What is your Chemistry grade ? ");
		int chemistryGrade = scan.nextInt();
		System.out.println(chemistryGrade>=90 && chemistryGrade <=100 ? "Chemistry Grade = A" : chemistryGrade>=80 && chemistryGrade <=89 ? 
		"Chemistry Grade = B" : chemistryGrade>=70 && chemistryGrade <=79 ? "Chemistry Grade = C" : chemistryGrade>=60 && chemistryGrade <=69 ?
		"Chemistry Grade = D" :chemistryGrade>=0 && chemistryGrade <=59 ? "Chemistry Grade = F" : "Wrong grade");
		
		scan.close();
	}
}
