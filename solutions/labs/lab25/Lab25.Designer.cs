namespace lab25
{
    partial class Lab25
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
            uxText = new TextBox();
            uxLabelText = new Label();
            uxMin = new Button();
            uxMax = new Button();
            uxAvg = new Button();
            uxResult = new TextBox();
            SuspendLayout();
            // 
            // uxText
            // 
            uxText.Location = new Point(13, 73);
            uxText.Margin = new Padding(4);
            uxText.Multiline = true;
            uxText.Name = "uxText";
            uxText.ScrollBars = ScrollBars.Vertical;
            uxText.Size = new Size(489, 141);
            uxText.TabIndex = 1;
            // 
            // uxLabelText
            // 
            uxLabelText.AutoSize = true;
            uxLabelText.Location = new Point(31, 24);
            uxLabelText.Name = "uxLabelText";
            uxLabelText.Size = new Size(467, 32);
            uxLabelText.TabIndex = 7;
            uxLabelText.Text = "Enter whole numbers separated by spaces:";
            // 
            // uxMin
            // 
            uxMin.Location = new Point(46, 237);
            uxMin.Name = "uxMin";
            uxMin.Size = new Size(152, 51);
            uxMin.TabIndex = 8;
            uxMin.Text = "Minimum";
            uxMin.UseVisualStyleBackColor = true;
            uxMin.Click += uxMin_Click;
            // 
            // uxMax
            // 
            uxMax.Location = new Point(204, 237);
            uxMax.Name = "uxMax";
            uxMax.Size = new Size(137, 51);
            uxMax.TabIndex = 9;
            uxMax.Text = "Maximum";
            uxMax.UseVisualStyleBackColor = true;
            uxMax.Click += uxMax_Click;
            // 
            // uxAvg
            // 
            uxAvg.Location = new Point(347, 237);
            uxAvg.Name = "uxAvg";
            uxAvg.Size = new Size(124, 51);
            uxAvg.TabIndex = 10;
            uxAvg.Text = "Average";
            uxAvg.UseVisualStyleBackColor = true;
            uxAvg.Click += uxAvg_Click;
            // 
            // uxResult
            // 
            uxResult.Location = new Point(13, 315);
            uxResult.Multiline = true;
            uxResult.Name = "uxResult";
            uxResult.ReadOnly = true;
            uxResult.ScrollBars = ScrollBars.Vertical;
            uxResult.Size = new Size(485, 69);
            uxResult.TabIndex = 11;
            uxResult.TextAlign = HorizontalAlignment.Center;
            // 
            // Lab25
            // 
            AutoScaleDimensions = new SizeF(13F, 32F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(532, 416);
            Controls.Add(uxResult);
            Controls.Add(uxAvg);
            Controls.Add(uxMax);
            Controls.Add(uxMin);
            Controls.Add(uxLabelText);
            Controls.Add(uxText);
            Font = new Font("Segoe UI", 12F, FontStyle.Regular, GraphicsUnit.Point, 0);
            Margin = new Padding(4);
            Name = "Lab25";
            Text = "Lab 25";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion
        private TextBox uxText;
        private Label uxLabelText;
        private Button uxMin;
        private Button uxMax;
        private Button uxAvg;
        private TextBox uxResult;
    }
}
