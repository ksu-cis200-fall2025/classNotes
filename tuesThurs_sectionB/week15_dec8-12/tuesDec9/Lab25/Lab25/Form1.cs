namespace Lab25
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void uxHello_Click(object sender, EventArgs e)
        {
            //pop up a dialog to say hello

            string name = uxName.Text;
            //MessageBox.Show("Hello, " + name);

            uxResult.Text = "Hello, " + name;
        }
    }
}
