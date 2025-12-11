using System.Text;

public class Cipher {

    private int _key;
    public int Key { 
        get => _key;
        set {
            _key = value;

            while (_key < 0) {
                _key += 26;
            }

            while (_key > 25) {
                _key -= 26;
            }
        }
    }

    public string Encrypt(string msg) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < msg.Length; i++) {
            char c = msg[i];

            //lower-case check
            if (c >= 'a' && c <= 'z') {
                c = (char)(c + Key);
                if (c > 'z') {
                    c = (char)(c - 26);
                }
            }
            //upper-case check
            else if (c >= 'A' && c <= 'Z') {
                c = (char)(c + Key);
                if (c > 'Z') {
                    c = (char)(c - 26);
                }
            }

            result.Append(c);
        }

        return result.ToString();
    }

    public string Decrypt(string msg) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < msg.Length; i++) {
            char c = msg[i];

            //lower-case check
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - Key);
                if (c < 'a') {
                    c = (char)(c + 26);
                }
            }
            //upper-case check
            else if (c >= 'A' && c <= 'Z') {
                c = (char)(c - Key);
                if (c < 'A') {
                    c = (char)(c + 26);
                }
            }

            result.Append(c);
        }

        return result.ToString();
    }
}