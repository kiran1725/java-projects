package kiran;
import java.util.Scanner;
import java.util.ArrayList;
public class ToDoListapp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>tasks=new ArrayList<>();
		while(true) {
			System.out.println("Simpl TO Do List App");
			System.out.println("1.Add a task");
			System.out.println("2.view a task");
			System.out.println("3.Delete a task");
			System.out.println("4.exit");
			System.out.println("choose an option (1-4)");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter your task:");
				String task=sc.nextLine();
				tasks.add(task);
				System.out.println("Task Added succesfully");
			}
			else if(choice == 2) {
				if(tasks.isEmpty()) {
					System.out.println("no tasks found");
				}
				else {
					System.out.println("Your Tasks");
					for(int i=0;i<tasks.size();i++) {
						System.out.println((i+1)+" "+tasks.get(i));
					}
				}
			}
			else if(choice==3) {
				if(tasks.isEmpty()) {
					System.out.println("nothing to delete ");
				}
				else {
					System.out.println("enter task number to delete");
					int tasknum=sc.nextInt();
					if(tasknum>=1 &&tasknum<=tasks.size()) {
						tasks.remove(tasknum-1);
						System.out.println("Task deletedr");
					}else{
							System.out.println("Invalid number");
						}
				}
			}else if(choice==4) {
						System.out.println("Goodbye !!");
						break;
					}
					else {
						System.out.println("please choose a valid option");
					}
				}
				sc.close();
			}
	}