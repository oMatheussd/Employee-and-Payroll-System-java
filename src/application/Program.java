package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.FullTimeEmployee;
import entities.Manager;
import entities.PartTimeEmployee;
import services.PayrollException;
import services.PayrollService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		PayrollService ps = new PayrollService();
		int response, employeeType;

		do {

			System.out.println("========= SISTEMA DE FUNCIONARIOS =========");
			System.out.println();

			System.out.println("1 - Cadastrar funcionario");
			System.out.println("2 - Listar funcionarios");
			System.out.println("3 - Consultar funcionario");
			System.out.println("4 - Remover funcionario");
			System.out.println("5 - Calcular folha de pagamento");
			System.out.println("0 - Sair");
			System.out.println();

			System.out.print("Escolha uma opção: ");
			response = sc.nextInt();
			sc.nextLine();

			switch (response) {

			case 1:
				try {
					do {

						System.out.println();
						System.out.println("1 - Funcionario integral");
						System.out.println("2 - Funcionario parcial");
						System.out.println("3 - Gerente");
						System.out.println();

						System.out.print("Tipo: ");
						employeeType = sc.nextInt();

						switch (employeeType) {

						case 1:
							System.out.println();

							System.out.print("ID: ");
							long id = sc.nextLong();
							sc.nextLine();

							System.out.print("Nome: ");
							String name = sc.nextLine();

							System.out.print("Salario: ");
							double baseSalary = sc.nextDouble();
							sc.nextLine();

							ps.addEmployee(new FullTimeEmployee(id, name, baseSalary));

							break;

						case 2:
							System.out.println();

							System.out.print("ID: ");
							id = sc.nextLong();
							sc.nextLine();

							System.out.print("Nome: ");
							name = sc.nextLine();

							System.out.print("Salario: ");
							baseSalary = sc.nextDouble();

							System.out.print("Horas trabalhadas: ");
							int hoursWorked = sc.nextInt();

							System.out.print("Valor por hora: ");
							double hourlyRate = sc.nextDouble();
							sc.nextLine();

							ps.addEmployee(new PartTimeEmployee(id, name, baseSalary, hoursWorked, hourlyRate));

							break;

						case 3:
							System.out.println();

							System.out.print("ID: ");
							id = sc.nextLong();
							sc.nextLine();

							System.out.print("Nome: ");
							name = sc.nextLine();

							System.out.print("Salario: ");
							baseSalary = sc.nextDouble();
							sc.nextLine();

							ps.addEmployee(new Manager(id, name, baseSalary));

							break;

						default:
							System.out.println("Numero invalido! Tente novamente.");
							break;
						}

					} while (employeeType != 1 && employeeType != 2 && employeeType != 3);

				} catch (PayrollException e) {
					System.out.println(e.getMessage());
				}

				System.out.println();
				System.out.println("Funcionario cadastrado com sucesso!");
				System.out.println();

				sc.nextLine();
				break;
			case 2:

				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 0:

				System.out.println("Saindo...");

				break;

			default:

				break;
			}
		} while (response != 0);

		sc.close();
	}

}
