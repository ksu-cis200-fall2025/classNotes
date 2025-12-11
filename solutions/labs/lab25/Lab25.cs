using System.Text;

namespace lab25
{
    public partial class Lab25 : Form
    {
        public Lab25()
        {
            InitializeComponent();
        }

        private List<int> GetNumbers(string text)
        {
            char[] space = { ' ' };
            string[] pieces = text.Split(space, StringSplitOptions.RemoveEmptyEntries);

            List<int> nums = new List<int>();

            for (int i = 0; i < pieces.Length; i++)
            {
                try
                {
                    nums.Add(Convert.ToInt32(pieces[i]));
                }
                catch
                {
                    MessageBox.Show("Error: " + pieces[i] + " is not an integer");
                }
            }

            return nums;
        }

        private void uxMin_Click(object sender, EventArgs e)
        {
            List<int> list = GetNumbers(uxText.Text);

            if (list.Count > 0)
            {
                int min = list[0];
                for (int i = 1; i < list.Count; i++)
                {
                    if (list[i] < min)
                    {
                        min = list[i];
                    }
                }

                uxResult.Text = "Minimum value: " + min;
            }
            else
            {
                uxResult.Text = "Enter a list of numbers above";
            }
        }

        private void uxMax_Click(object sender, EventArgs e)
        {
            List<int> list = GetNumbers(uxText.Text);

            if (list.Count > 0)
            {
                int max = list[0];
                for (int i = 1; i < list.Count; i++)
                {
                    if (list[i] > max)
                    {
                        max = list[i];
                    }
                }

                uxResult.Text = "Maximum value: " + max;
            }
            else
            {
                uxResult.Text = "Enter a list of numbers above";
            }
        }

        private void uxAvg_Click(object sender, EventArgs e)
        {
            List<int> list = GetNumbers(uxText.Text);

            if (list.Count > 0)
            {
                int sum = 0;
                for (int i = 0; i < list.Count; i++)
                {
                    sum += list[i];
                }

                double avg = sum / (double)list.Count;

                uxResult.Text = $"Average value: {avg:0.00}";
            }
            else
            {
                uxResult.Text = "Enter a list of numbers above";
            }
        }
    }
}
