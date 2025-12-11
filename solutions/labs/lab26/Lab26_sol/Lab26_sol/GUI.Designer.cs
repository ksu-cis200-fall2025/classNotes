namespace Lab26
{
    partial class GUI
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            uxList = new ListBox();
            uxVote = new Button();
            uxLabel = new Label();
            uxName = new TextBox();
            uxAdd = new Button();
            uxWinner = new Button();
            uxResult = new Label();
            SuspendLayout();
            // 
            // uxList
            // 
            uxList.FormattingEnabled = true;
            uxList.ItemHeight = 30;
            uxList.Location = new Point(36, 140);
            uxList.Margin = new Padding(4);
            uxList.Name = "uxList";
            uxList.ScrollAlwaysVisible = true;
            uxList.Size = new Size(473, 244);
            uxList.TabIndex = 1;
            // 
            // uxVote
            // 
            uxVote.Location = new Point(99, 407);
            uxVote.Margin = new Padding(4);
            uxVote.Name = "uxVote";
            uxVote.Size = new Size(134, 41);
            uxVote.TabIndex = 2;
            uxVote.Text = "Vote";
            uxVote.UseVisualStyleBackColor = true;
            uxVote.Click += uxVote_Click;
            // 
            // uxLabel
            // 
            uxLabel.AutoSize = true;
            uxLabel.Location = new Point(33, 26);
            uxLabel.Margin = new Padding(4, 0, 4, 0);
            uxLabel.Name = "uxLabel";
            uxLabel.Size = new Size(176, 30);
            uxLabel.TabIndex = 3;
            uxLabel.Text = "Candidate name:";
            // 
            // uxName
            // 
            uxName.Location = new Point(217, 26);
            uxName.Margin = new Padding(4);
            uxName.Name = "uxName";
            uxName.Size = new Size(292, 37);
            uxName.TabIndex = 4;
            // 
            // uxAdd
            // 
            uxAdd.Location = new Point(150, 81);
            uxAdd.Margin = new Padding(4);
            uxAdd.Name = "uxAdd";
            uxAdd.Size = new Size(222, 41);
            uxAdd.TabIndex = 5;
            uxAdd.Text = "Add Candidate";
            uxAdd.UseVisualStyleBackColor = true;
            uxAdd.Click += uxAdd_Click;
            // 
            // uxWinner
            // 
            uxWinner.Location = new Point(267, 407);
            uxWinner.Margin = new Padding(4);
            uxWinner.Name = "uxWinner";
            uxWinner.Size = new Size(180, 41);
            uxWinner.TabIndex = 6;
            uxWinner.Text = "Find Winner";
            uxWinner.UseVisualStyleBackColor = true;
            uxWinner.Click += uxWinner_Click;
            // 
            // uxResult
            // 
            uxResult.AutoSize = true;
            uxResult.Location = new Point(85, 535);
            uxResult.Margin = new Padding(4, 0, 4, 0);
            uxResult.Name = "uxResult";
            uxResult.Size = new Size(0, 30);
            uxResult.TabIndex = 7;
            // 
            // Lab26
            // 
            AutoScaleDimensions = new SizeF(12F, 30F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(554, 565);
            Controls.Add(uxResult);
            Controls.Add(uxWinner);
            Controls.Add(uxAdd);
            Controls.Add(uxName);
            Controls.Add(uxLabel);
            Controls.Add(uxVote);
            Controls.Add(uxList);
            Font = new Font("Segoe UI", 11F, FontStyle.Regular, GraphicsUnit.Point, 0);
            Margin = new Padding(4);
            Name = "Lab26";
            Text = "Voting App";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private ListBox uxList;
        private Button uxVote;
        private Label uxLabel;
        private TextBox uxName;
        private Button uxAdd;
        private Button uxWinner;
        private Label uxResult;
    }
}
