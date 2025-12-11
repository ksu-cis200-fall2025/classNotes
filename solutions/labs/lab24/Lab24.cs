using System;
using System.IO;
using System.Collections.Generic;

Dictionary<String, Student> map = new Dictionary<String, Student>();

try {
    using (StreamReader inFile = new StreamReader("studentInfo.txt")) {
        while (!inFile.EndOfStream) {
            string line = inFile.ReadLine();
            string[] tokens = line.Split(':');

            string name = tokens[0].Trim();
            double score = Convert.ToDouble(tokens[1].Trim());

            Student match = null;
            if (!map.ContainsKey(name)) {
                match = new Student(name);
                map.Add(name, match);
            }
            else {
                match = map[name];
            }
            match.AddScore(score);
        }
    }
}
catch(IOException) {
    Console.WriteLine("Error reading input file");
}

//YOU DO THIS
//Ask the user for a student name, and print their information
//If the student isn't found, print an error instead
Console.Write("Enter a name: ");
string str = Console.ReadLine();

if (!map.ContainsKey(str)) {
    Console.WriteLine($"{str} not found");
}
else {
    Console.WriteLine(map[str]);
}

Console.WriteLine();

//YOU DO THIS
//Find the student with the highest average, and print their information

Student high = null;
double highAvg = 0;
foreach (string curName in map.Keys) {
    Student cur = map[curName];
    if (cur.Average > highAvg) {
        high = cur;
        highAvg = cur.Average;
    }
}
Console.WriteLine($"Highest scoring student: {high}");