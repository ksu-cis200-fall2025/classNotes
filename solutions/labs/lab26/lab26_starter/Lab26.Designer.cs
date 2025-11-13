namespace lab26_starter
{
    partial class Lab26
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.uxMenu = new System.Windows.Forms.MenuStrip();
            this.uxFile = new System.Windows.Forms.ToolStripMenuItem();
            this.uxOpenMenu = new System.Windows.Forms.ToolStripMenuItem();
            this.uxOpenDialog = new System.Windows.Forms.OpenFileDialog();
            this.uxList = new System.Windows.Forms.ListBox();
            this.uxResult = new System.Windows.Forms.ListBox();
            this.uxLabel = new System.Windows.Forms.Label();
            this.uxLetter = new System.Windows.Forms.TextBox();
            this.uxFind = new System.Windows.Forms.Button();
            this.uxMenu.SuspendLayout();
            this.SuspendLayout();
            // 
            // uxMenu
            // 
            this.uxMenu.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.uxFile});
            this.uxMenu.Location = new System.Drawing.Point(0, 0);
            this.uxMenu.Name = "uxMenu";
            this.uxMenu.Size = new System.Drawing.Size(432, 24);
            this.uxMenu.TabIndex = 0;
            this.uxMenu.Text = "menuStrip1";
            // 
            // uxFile
            // 
            this.uxFile.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.uxOpenMenu});
            this.uxFile.Name = "uxFile";
            this.uxFile.Size = new System.Drawing.Size(37, 20);
            this.uxFile.Text = "File";
            // 
            // uxOpenMenu
            // 
            this.uxOpenMenu.Name = "uxOpenMenu";
            this.uxOpenMenu.Size = new System.Drawing.Size(180, 22);
            this.uxOpenMenu.Text = "Open...";
            this.uxOpenMenu.Click += new System.EventHandler(this.UxOpenMenu_Click);
            // 
            // uxList
            // 
            this.uxList.FormattingEnabled = true;
            this.uxList.ItemHeight = 20;
            this.uxList.Location = new System.Drawing.Point(22, 58);
            this.uxList.Name = "uxList";
            this.uxList.Size = new System.Drawing.Size(157, 304);
            this.uxList.TabIndex = 1;
            // 
            // uxResult
            // 
            this.uxResult.FormattingEnabled = true;
            this.uxResult.ItemHeight = 20;
            this.uxResult.Location = new System.Drawing.Point(206, 158);
            this.uxResult.Name = "uxResult";
            this.uxResult.Size = new System.Drawing.Size(200, 204);
            this.uxResult.TabIndex = 2;
            // 
            // uxLabel
            // 
            this.uxLabel.AutoSize = true;
            this.uxLabel.Location = new System.Drawing.Point(208, 61);
            this.uxLabel.Name = "uxLabel";
            this.uxLabel.Size = new System.Drawing.Size(92, 20);
            this.uxLabel.TabIndex = 3;
            this.uxLabel.Text = "Enter letter:";
            // 
            // uxLetter
            // 
            this.uxLetter.Location = new System.Drawing.Point(306, 58);
            this.uxLetter.Name = "uxLetter";
            this.uxLetter.Size = new System.Drawing.Size(100, 26);
            this.uxLetter.TabIndex = 4;
            // 
            // uxFind
            // 
            this.uxFind.Location = new System.Drawing.Point(247, 103);
            this.uxFind.Name = "uxFind";
            this.uxFind.Size = new System.Drawing.Size(116, 32);
            this.uxFind.TabIndex = 5;
            this.uxFind.Text = "Find Words";
            this.uxFind.UseVisualStyleBackColor = true;
            this.uxFind.Click += new System.EventHandler(this.UxFind_Click);
            // 
            // GUI
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(432, 381);
            this.Controls.Add(this.uxFind);
            this.Controls.Add(this.uxLetter);
            this.Controls.Add(this.uxLabel);
            this.Controls.Add(this.uxResult);
            this.Controls.Add(this.uxList);
            this.Controls.Add(this.uxMenu);
            this.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.MainMenuStrip = this.uxMenu;
            this.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.MaximizeBox = false;
            this.Name = "GUI";
            this.Text = "Letter Finder";
            this.uxMenu.ResumeLayout(false);
            this.uxMenu.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip uxMenu;
        private System.Windows.Forms.ToolStripMenuItem uxFile;
        private System.Windows.Forms.ToolStripMenuItem uxOpenMenu;
        private System.Windows.Forms.OpenFileDialog uxOpenDialog;
        private System.Windows.Forms.ListBox uxList;
        private System.Windows.Forms.ListBox uxResult;
        private System.Windows.Forms.Label uxLabel;
        private System.Windows.Forms.TextBox uxLetter;
        private System.Windows.Forms.Button uxFind;
    }
}
