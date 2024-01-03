import java.util.*;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ATM extends JFrame{
    private double balance;

    public ATM(double intialBalance){
        this.balance = intialBalance;

        //create atm machine notification

         setTitle("ATM machine");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel balanceLabel = new JLabel("Blance: $"+balance);
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");

        depositButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter deposit amount:"));
                deposit(depositAmount);
                balanceLabel.setText("Balance: $"+balance);
            }
        });

        withdrawButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter withdraw amount:"));
                withdraw(withdrawAmount);
                balanceLabel.setText("Balance: $"+balance);


            }
        });

        setLayout(new GridLayout(3,1));
        

        add(balanceLabel);
        add(depositButton);
        add(withdrawButton);

      //get balance

    }
    public double getBalance(){
        return balance;
    }

    //deposit amount
    private void deposit(double amount){
        if (amount > 0){
            balance += amount;
            JOptionPane.showMessageDialog(this,"Deposit successful. New balance: $"+balance);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Invalid deposit amount or insufficient funds.");
        }
    }
    //withdraw amount
    private void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            JOptionPane.showMessageDialog(this,"withdraw successful. New balance: $"+balance);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Invalid withdrawal amount or insufficient funds.");
        }
    }
    // swich cases
    public static void displayMenu(){
        System.out.println("ATM Machine");
        System.out.println("1.check balance.");
        System.out.println("2.Withdraw");
        System.out.println("3.deposit");
        System.out.println("4.Exit");
    }


    public static void main(String[] args){
        ATM userAccount = new ATM(100.0);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.println("select a choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("current balance:"+userAccount.getBalance());
                    break;
                case 2:
                    System.out.println("Enter withdraw amount:");
                    double withdrawAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                     
                    break;

                case 3:
                System.out.println("Enter deposit amount:");
                double depositAmount = scanner.nextDouble();
                userAccount.deposit(depositAmount);
                
                break;
                case 4:
                    System.out.println("Available balance:"+userAccount.getBalance());
                    System.out.println("Thank you!");

                    return;
                default:
                System.out.println("Enter valid choice.");


    }

    }


            
    }
}