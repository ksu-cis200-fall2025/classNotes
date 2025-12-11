namespace Lab26
{
    public partial class GUI : Form
    {
        private List<Candidate> _cands;
        public GUI()
        {
            InitializeComponent();

            _cands = new List<Candidate>();
        }

        private void uxAdd_Click(object sender, EventArgs e)
        {
            //YOU DO THIS
            //Add a new Candidate whose name matches the one in 
            //your TextBox to your list of candidates
            string name = uxName.Text;
            if (name == "")
            {
                MessageBox.Show("Enter a candidate name in the text box");
            }
            else {
                bool found = false;
                foreach(Candidate c in _cands)
                {
                    if (c.Name.ToLower() == name.ToLower())
                    {
                        found = true;
                    }
                }

                if (!found)
                {
                    _cands.Add(new Candidate() { Name = name });
                }
            }
            
            //Once the above part works, only add a new Candidate
            //if there isn't already another Candidate with the same name

            //Once all above parts work, make sure the TextBox isn't empty
            //before adding a new Candidate (do nothing if it is)


            //Leave the following lines alone
            uxList.DataSource = null;
            uxList.DataSource = _cands;
            uxName.Text = "";
        }

        private void uxVote_Click(object sender, EventArgs e)
        {
            //This gets which candidate was selected
            Candidate selected = (Candidate) uxList.SelectedItem;

            if (selected != null)
            {
                //YOU DO THIS
                //Vote for the selected candidate
                selected.CastVote();
            }

            //Leave the following lines alone
            uxList.DataSource = null;
            uxList.DataSource = _cands;
        }

        private void uxWinner_Click(object sender, EventArgs e)
        {
            //YOU DO THIS
            //Find the candidate with the most votes
            //Display their information in the uxResult TextBox

            if (_cands.Count > 0)
            {
                Candidate win = _cands[0];
                foreach (Candidate c in _cands)
                {
                    if (c.Votes > win.Votes)
                    {
                        win = c;
                    }
                }

                uxResult.Text = $"Winner: {win}";
            }
            else
            {
                MessageBox.Show("Enter candidate names and cast votes first");
            }
        
            //After the above part works, handle the case
            //where the user clicks "Winner" before entering any
            //names
        }
    }
}
