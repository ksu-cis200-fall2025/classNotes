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
            uxLabel = new Label();
            uxText = new TextBox();
            uxButton = new Button();
            uxHello = new Label();
            SuspendLayout();
            // 
            // uxLabel
            // 
            uxLabel.AutoSize = true;
            uxLabel.Location = new Point(92, 93);
            uxLabel.Margin = new Padding(6, 0, 6, 0);
            uxLabel.Name = "uxLabel";
            uxLabel.Size = new Size(236, 48);
            uxLabel.TabIndex = 0;
            uxLabel.Text = "Enter a name:";
            // 
            // uxText
            // 
            uxText.Location = new Point(416, 105);
            uxText.Margin = new Padding(6);
            uxText.Name = "uxText";
            uxText.Size = new Size(296, 55);
            uxText.TabIndex = 1;
            
            // 
            // uxButton
            // 
            uxButton.Location = new Point(272, 228);
            uxButton.Margin = new Padding(6);
            uxButton.Name = "uxButton";
            uxButton.Size = new Size(224, 65);
            uxButton.TabIndex = 2;
            uxButton.Text = "Click Me";
            uxButton.UseVisualStyleBackColor = true;
            uxButton.Click += uxButton_Click;
            // 
            // uxHello
            // 
            uxHello.AutoSize = true;
            uxHello.Location = new Point(274, 353);
            uxHello.Name = "uxHello";
            uxHello.Size = new Size(0, 48);
            uxHello.TabIndex = 3;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(20F, 48F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(812, 515);
            Controls.Add(uxHello);
            Controls.Add(uxButton);
            Controls.Add(uxText);
            Controls.Add(uxLabel);
            Font = new Font("Segoe UI", 18F, FontStyle.Regular, GraphicsUnit.Point, 0);
            Margin = new Padding(6);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label uxLabel;
        private TextBox uxText;
        private Button uxButton;
        private Label uxHello;
    }
}
