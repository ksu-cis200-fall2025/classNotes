namespace Lab25
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void uxButton_Click(object sender, EventArgs e)
        {
            //will be called when you click button
            //get the name from the TextBox
            //display it in a dialog

            string name = uxText.Text;
            //MessageBox.Show("Hello, " + name);

            uxHello.Text = "hello, " + name;
        }
    }
}
