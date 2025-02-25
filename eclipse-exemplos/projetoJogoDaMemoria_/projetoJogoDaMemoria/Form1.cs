﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Threading;

namespace projetoJogoDeMemoria
{
    public partial class Form1 : Form
    {
        int movimentos, cliques, cartasEncontradas, tagIndex;
        Image[] img = new Image[7];
        List<string> lista = new List<string>();
        int[] tags = new int[2];
         int X; 
         int Y;


        public Form1()
        {
            InitializeComponent();
            Inicio();
        }

        private void Inicio()
        {

            foreach (PictureBox item in Controls.OfType<PictureBox>())
            {
                int tagIndex = int.Parse(String.Format("{0}", item.Tag));
                img[tagIndex] = item.Image;
                item.Image = projetoJogoDaMemoria.Properties.Resources.Verso;
                item.Enabled = true;
                
            }

            Posicoes();

        }

        private void Posicoes()
        {
            foreach (PictureBox item in Controls.OfType<PictureBox>())
            {
                Random rdn = new Random();

               //  int[] xP = {287,449,8,170,566,728,88,250,485,647,8,170,566,728};
                // int[] yP = {12,144,276,408};

               int[] xP = { 287, 449, 8, 170 };
               int[] yP = { 12, 144};

                Repete:

                // X = xP[rdn.Next(0, xP.Length)];
                //Y = yP[rdn.Next(0, yP.Length)];
                X = xP[rdn.Next(0, xP.Length)];
                Y = yP[rdn.Next(0, yP.Length)];


                string verificacao = X.ToString() + Y.ToString();

                if (lista.Contains(verificacao))
                {

                    goto Repete;

                }
                else
                {

                    item.Location = new Point(X, Y);
                    lista.Add(verificacao);
                }

            }
        }

        private void ImagensClick_Click(object sender, EventArgs e)
        {

            bool parEncontrado = false;

            PictureBox pic = (PictureBox)sender;
            cliques++;
            tagIndex = int.Parse(String.Format("{0}", pic.Tag));
            pic.Image = img[tagIndex];
            pic.Refresh();
           
            if (cliques == 1)
            {

                tags[0] = int.Parse(String.Format("{0}", pic.Tag));

            }
            else if (cliques == 2)
            {

                movimentos++;
                lblMovimentos.Text = "Movimentos: " + movimentos.ToString();
                tags[1] = int.Parse(String.Format("{0}", pic.Tag));
                parEncontrado = ChecagemPares();
                Desvirar(parEncontrado);
            }
            
        }

        private void exibeMsgLoction()
        {
            MessageBox.Show("X= " + X.ToString() + " -- " + " Y= " + Y.ToString() );
        }

        private bool ChecagemPares()
        {

            cliques = 0;

            if (tags[0] == tags[1]) { return true; } else { return false; }

        }

        private void Desvirar(bool check)
        {

            Thread.Sleep(800);

            foreach (PictureBox item in Controls.OfType<PictureBox>())
            {

                if (int.Parse(String.Format("{0}", item.Tag)) == tags[0] ||
                    int.Parse(String.Format("{0}", item.Tag)) == tags[1])
                {

                    if (check == true)
                    {

                        item.Enabled = false;
                        cartasEncontradas++;

                    }
                    else
                    {

                        item.Image = projetoJogoDaMemoria.Properties.Resources.Verso;
                        item.Refresh();

                    }

                }

            }

            FinalJogo();

        }

        private void FinalJogo()
        {

            if (cartasEncontradas == (img.Length * 2))
            {

                MessageBox.Show("Parabéns, você terminou o jogo com " + movimentos.ToString() + " movimentos!");
                DialogResult msg = MessageBox.Show("Deseja continuar o jogo?", "Caixa de pergunta", MessageBoxButtons.YesNo);

                if (msg == DialogResult.Yes)
                {

                    cliques = 0; movimentos = 0; cartasEncontradas = 0;
                    lista.Clear();
                    Inicio();

                }
                else if (msg == DialogResult.No)
                {

                    MessageBox.Show("Obrigada por jogar! Até a proxima...");
                    Application.Exit();


                }

            }

        }

    }
}

