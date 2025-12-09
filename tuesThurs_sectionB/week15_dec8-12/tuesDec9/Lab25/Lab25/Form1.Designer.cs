namespace Lab25
{
    partial class Form1
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
            uxPrompt = new Label();
            uxName = new TextBox();
            uxHello = new Button();
            uxResult = new Label();
            SuspendLayout();
            // 
            // uxPrompt
            // 
            uxPrompt.AutoSize = true;
            uxPrompt.Location = new Point(67, 101);
            uxPrompt.Margin = new Padding(6, 0, 6, 0);
            uxPrompt.Name = "uxPrompt";
            uxPrompt.Size = new Size(289, 48);
            uxPrompt.TabIndex = 0;
            uxPrompt.Text = "Enter your name:";
            // 
            // uxName
            // 
            uxName.Location = new Point(390, 98);
            uxName.Margin = new Padding(6);
            uxName.Name = "uxName";
            uxName.Size = new Size(296, 55);
            uxName.TabIndex = 1;
            
            // 
            // uxHello
            // 
            uxHello.Location = new Point(291, 247);
            uxHello.Margin = new Padding(6);
            uxHello.Name = "uxHello";
            uxHello.Size = new Size(224, 65);
            uxHello.TabIndex = 2;
            uxHello.Text = "Say Hello";
            uxHello.UseVisualStyleBackColor = true;
            uxHello.Click += uxHello_Click;
            // 
            // uxResult
            // 
            uxResult.AutoSize = true;
            uxResult.Location = new Point(349, 383);
            uxResult.Name = "uxResult";
            uxResult.Size = new Size(0, 48);
            uxResult.TabIndex = 3;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(20F, 48F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(856, 546);
            Controls.Add(uxResult);
            Controls.Add(uxHello);
            Controls.Add(uxName);
            Controls.Add(uxPrompt);
            Font = new Font("Segoe UI", 18F, FontStyle.Regular, GraphicsUnit.Point, 0);
            Margin = new Padding(6);
            Name = "Form1";
            Text = "Hello";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label uxPrompt;
        private TextBox uxName;
        private Button uxHello;
        private Label uxResult;
    }
}
