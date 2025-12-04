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
            Rectangle r = new Rectangle(){Length = Convert.ToInt32(pieces[0]), Width = Convert.ToInt32(pieces[1])};
            r.Length = 4;
            list.Add(r);
        }
    }
}
catch (IOException) {
    Console.WriteLine("error reading file");
}

//how to print all rectangles?
foreach (Rectangle r in list) {
    Console.WriteLine(r);
}
