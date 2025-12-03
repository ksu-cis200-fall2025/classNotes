// See https://aka.ms/new-console-template for more information

using System;
using System.IO;
using System.Collections.Generic;

//create a list of rectangles

//read from input file

//print all information

List<Rectangle> list = new List<Rectangle>();

try {
    using (StreamReader reader = new StreamReader("dim.txt")) {
        while (!reader.EndOfStream) {
            string line = reader.ReadLine();

            string[] pieces = line.Split(' ');

            //how to add rectangle with new info to the list?
        }
    }
}
catch (IOException) {
    Console.WriteLine("error reading file");
}

//how to print all rectangles?
