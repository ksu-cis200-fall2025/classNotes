// See https://aka.ms/new-console-template for more information
EncryptionView v = new EncryptionView();
        
int count = 0;
bool done = false;
int k = 0;
while (count < 3 && !done) {
    try {
        k = v.GetKey();
        done = true;
    }
    catch (FormatException) {
        v.PrintError();
    }
    count++;
}
if (count == 3 && !done) {
    return;
}

Cipher c = new Cipher() {Key = k};
string msg = v.GetMessage();
string enc = c.Encrypt(msg);

v.PrintResult(enc, "encrypt");

string dec = c.Decrypt(enc);

v.PrintResult(dec, "decrypt");