package com.cursoandroid.flappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class FlappyBird extends ApplicationAdapter {

    private SpriteBatch batch;
    private Texture[] passaros;
    private Texture fundo;
    private Texture canoBaixo;
    private Texture canoTopo;
    private Random numeroRandomico;

    // Atributos de confguracao

    private int larguraDispositivo;
    private int alturaDispositivo;

    private float variacao = 0;
    private float velocidadeQueda = 0;
    private float posicaoInicialVertical = alturaDispositivo / 2;
    private float posicaoMovimentoCanoHorizontal;
    private float espacoEntreCanos;
    private float deltaTime;
    private float alturaEntreCanosRandomica;

    @Override
    public void create() {

        batch = new SpriteBatch();
        numeroRandomico = new Random();
        passaros = new Texture[3];
        passaros[0] = new Texture("passaro1.png");
        passaros[1] = new Texture("passaro2.png");
        passaros[2] = new Texture("passaro3.png");

        fundo = new Texture("fundo.png");
        canoBaixo = new Texture("cano_baixo.png");
        canoTopo = new Texture("cano_topo.png");

        larguraDispositivo = Gdx.graphics.getWidth();
        alturaDispositivo = Gdx.graphics.getHeight();
        posicaoInicialVertical = alturaDispositivo / 2;
        posicaoMovimentoCanoHorizontal = larguraDispositivo - 100;
        espacoEntreCanos = 300;
    }

    @Override
    public void render() {

        // += Signica que o atributo recebe o proprio atributo + algum outro valor

        /* DeltaTime calcula a diferenção entre uma executação do metado public void render() e
            outra dentro do loop de condicao*/

        deltaTime = Gdx.graphics.getDeltaTime();

        variacao += deltaTime * 10;
        posicaoMovimentoCanoHorizontal -= deltaTime * 200;
        velocidadeQueda++;

        if (variacao > 2) variacao = 0;

        if (Gdx.input.justTouched()) {

            velocidadeQueda = -15;

        }

        if (posicaoInicialVertical > 0 || velocidadeQueda < 0)

            posicaoInicialVertical = posicaoInicialVertical - velocidadeQueda;

        //Verifica se o cano saiu inteiramente da tela

        if (posicaoMovimentoCanoHorizontal < -canoTopo.getWidth()) {

            posicaoMovimentoCanoHorizontal = larguraDispositivo;
            alturaEntreCanosRandomica = numeroRandomico.nextInt(400) - 200;
        }

        batch.begin();

        batch.draw(fundo, 0, 0, larguraDispositivo, alturaDispositivo);
        batch.draw(canoTopo, posicaoMovimentoCanoHorizontal, alturaDispositivo / 2 + espacoEntreCanos / 2 + alturaEntreCanosRandomica);
        batch.draw(canoBaixo, posicaoMovimentoCanoHorizontal, alturaDispositivo / 2 - canoBaixo.getHeight() - espacoEntreCanos / 2 + alturaEntreCanosRandomica);

        // Conversao de float para int: (int) variacao

        batch.draw(passaros[(int) variacao], 30, posicaoInicialVertical);
        batch.end();

    }
}
