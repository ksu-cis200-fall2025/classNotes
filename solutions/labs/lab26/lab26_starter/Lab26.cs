namespace lab26_starter
{
    public partial class Lab26 : Form
    {
        private List<string> _allWords = null;
        private Dictionary<char, List<string>> _wordsByLetter = null;

        public Lab26()
        {
            InitializeComponent();
        }

        private void UxOpenMenu_Click(object sender, EventArgs e)
        {
            if (uxOpenDialog.ShowDialog() == DialogResult.OK)
            {
                string filename = uxOpenDialog.FileName;
                List<string> temp = new List<string>();
                try
                {
                    using (StreamReader inFile = new StreamReader(filename))
                    {
                        while (!inFile.EndOfStream)
                        {
                            string word = inFile.ReadLine().ToLower();

                            //YOU DO THIS
                            //Add word to temp
                        }
                    }

                    //this puts the word list from the input file in the left-hand ListBox
                    _allWords = temp;
                    uxList.DataSource = null;
                    uxList.DataSource = _allWords;

                    BuildDictionary();

                }
                catch (IOException)
                {
                    MessageBox.Show("Error reading file");
                }
            }
        }

        private void BuildDictionary()
        {
            _wordsByLetter = new Dictionary<char, List<string>>();


            //YOU DO THIS

            //Loop through each word in _allWords
            //Get the first letter of the current word
            //if we've seen that letter before (call ContainsKey on _wordsByLetter with the letter)
            //get the list of words that begin with that letter (use _wordsByLetter[the first letter])
            //add the current word to that list
            //otherwise (we haven't seen that letter before)
            //create a new List<string> object
            //add the current word to your new list
            //add the (first letter, new list) entry to _wordsByLetter (call its Add method)
        }

        private void UxFind_Click(object sender, EventArgs e)
        {
            uxResult.DataSource = null;

            if (_wordsByLetter != null && uxLetter.Text.Length > 0)
            {
                //YOU DO THIS

                //Get the character out of the uxLetter TextBox (use [0] to turn it from a string to a char)
                //if we've seen that letter (call ContainsKey on _wordsByLetter with the letter)
                //Update uxResult.DataSource to be the list of words associated with that letter
                //((use _wordsByLetter[the letter] to get the list)
                //otherwise (we haven't seen that letter before)
                //display a MessageBox (MessageBox.Show) saying that the letter isn't found 
            }
        }
    }
}
