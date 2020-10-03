package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
	
		System.out.print("Enter the number of tax payers: ");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch=sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome=sc.nextDouble();
			
			if (ch=='i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures=sc.nextDouble();
				list.add(new Individual(name,annualIncome,healthExpenditures));
			} else if (ch=='c') {
				System.out.print("Number of employees: ");
				Integer employeesNumber=sc.nextInt();
				list.add(new Company(name,annualIncome,employeesNumber));
			}
		}
		
		for (TaxPayer tx : list ) {
			System.out.println(tx.getName()+" $ "+String.format("%.2f", tx.taxCalc()));
		}
		
		double sum=0;
		for (TaxPayer tx : list) {
			sum+=tx.taxCalc();
		}
		System.out.printf("TOTAL TAXES: $%.2f", sum);

		
		sc.close();
	}

}
