package com.te.HibernateAssignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.HibernateAssignment.bean.Employee;



public class MainEmploye {

	public static void main(String[] args) {
		EmployeeData data = new EmployeeData();
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.println("For All Data=1 / Perticular Data=2 / update=3 / Delete=4 / Exit=5");
			int no = scanner.nextInt();

			if (no == 1) {
				data.allData();
			}
			else if (no == 2) {
             data.readData();
			}
			else if (no == 3) {
             data.upData();
			}
			else if (no == 4) {
             data.delData();
			}
			else if (no == 5) {
             break;
			}
		}
	}
}


