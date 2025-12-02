// See https://aka.ms/new-console-template for more information

using System;

//got a user's age and printed it out

/*
Console.Write("Enter age: ");
int age = Convert.ToInt32(Console.ReadLine());

//print: You are ?? years old
Console.WriteLine($"You are {age} years old");
*/

//Bob, age 20
Person p = new Person(){Name = "Bob", Age = 20};

Console.WriteLine(p.Name);
p.Name = "Robert";
p.Print();