using System;

public class EncryptionView {
    public string GetMessage() {
        Console.Write("Enter message: ");
        string? msg = Console.ReadLine();
        return msg == null ? "" : msg;
    }

    public int GetKey() {
        Console.Write("Enter the key: ");
        return Convert.ToInt32(Console.ReadLine());
    }

    public void PrintError() {
        Console.WriteLine("Error: key should be an integer.");
    }

    public void PrintResult(string msg, string type) {
        Console.WriteLine($"Result from {type}: {msg}");
    }
}