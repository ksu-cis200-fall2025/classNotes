using System;
using System.Collections.Generic;

public class Student {
    private List<double> _examScores;

    public Student(string n) {
        Name = n;
        _examScores = new List<Double>();
    }

    public string Name { get; }

    public void AddScore(double s) {
        _examScores.Add(s);
    }

    public double Average {
        get {
            double sum = 0;
            foreach (double d in _examScores) {
                sum += d;
            }

            return sum/_examScores.Count;
        }
    }

    public char Grade {
        get {
            double avg = Average;

            if (avg >= 90) return 'A';
            else if (avg >= 80) return 'B';
            else if (avg >= 70) return 'C';
            else if (avg >= 60) return 'D';
            else return 'F';
        }
    }

    public override string ToString() {
        return $"{Name}, average: {Average:0.00}, grade: {Grade}";
    }
}