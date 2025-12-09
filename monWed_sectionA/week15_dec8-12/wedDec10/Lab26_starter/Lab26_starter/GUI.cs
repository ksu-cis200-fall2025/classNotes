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

            //YOU DO THIS
            //Vote for the selected candidate


            //Leave the following lines alone
            uxList.DataSource = null;
            uxList.DataSource = _cands;
        }

        private void uxWinner_Click(object sender, EventArgs e)
        {
            //YOU DO THIS
            //Find the candidate with the most votes
            //Display their information in the uxResult TextBox


            //After the above part works, handle the case
            //where the user clicks "Winner" before entering any
            //names
        }
    }
}
