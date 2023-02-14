package com.calculator.views.calculadora;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Calculadora")
@Route(value = "")
public class CalculadoraView extends VerticalLayout {

    public CalculadoraView() {
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
        setClassName("calculadora");
        setSpacing(false);

        VerticalLayout layout = new VerticalLayout();
        add(layout);
        layout.setClassName("layout");

        Div display = new Div();
        Div buttons = new Div();
        layout.add(display);
        layout.add(buttons);
        display.setClassName("display");
        buttons.setClassName("buttons");

        VerticalLayout historico = new VerticalLayout();
        Div tela = new Div();
        display.add(historico);
        display.add(tela);
        historico.setClassName("historico");
        tela.setClassName("tela");

        Div historicoTextField = new Div();
        historico.add(historicoTextField);

        VerticalLayout modulo = new VerticalLayout();
        VerticalLayout resultado = new VerticalLayout();
        tela.add(modulo);
        tela.add(resultado);
        modulo.setClassName("modulo");
        resultado.setClassName("resultado");

        Div moduloTextField = new Div();
        Div resultadoTextField = new Div();
        modulo.add(moduloTextField);
        resultado.add(resultadoTextField);

        Image imagemCe = new Image("images/CE.png", "CE");
        Button ce = new Button(imagemCe, clickEvent -> {
            // apaga o número
            resultadoTextField.removeAll();
        });
        buttons.add(ce);
        ce.setClassName("ce");

        Image imagemC = new Image("images/C.png", "C");
        Button c = new Button(imagemC, clickEvent -> {
            // apaga toda a operação
            resultadoTextField.removeAll();
            moduloTextField.removeAll();
            historicoTextField.removeAll();
        });
        buttons.add(c);
        c.setClassName("ce");

        Image imagemPorcentagem = new Image("images/Percent.png", "Porcentagem");
        Button porcentagem = new Button(imagemPorcentagem, clickEvent -> {
            moduloTextField.removeAll();
            var hist = resultadoTextField.getText();
            moduloTextField.add("%");
            historicoTextField.removeAll();
            historicoTextField.add(hist);
            resultadoTextField.removeAll();
        });
        buttons.add(porcentagem);
        porcentagem.setClassName("ce");

        Image imagemDivide = new Image("images/Divide.png", "divide");
        Button divisao = new Button(imagemDivide, clickEvent -> {
            moduloTextField.removeAll();
            var hist = resultadoTextField.getText();
            moduloTextField.add("/");
            historicoTextField.removeAll();
            historicoTextField.add(hist);
            resultadoTextField.removeAll();
        });
        buttons.add(divisao);
        divisao.setClassName("modulos");

        Image imagemSete = new Image("images/7.png", "7");
        Button sete = new Button(imagemSete, clickEvent -> resultadoTextField.add("7"));
        buttons.add(sete);
        sete.setClassName("ce");

        Image imagemOito = new Image("images/8.png", "8");
        Button oito = new Button(imagemOito, clickEvent -> resultadoTextField.add("8"));
        buttons.add(oito);
        oito.setClassName("ce");

        Image imagemNove = new Image("images/9.png", "9");
        Button nove = new Button(imagemNove, clickEvent -> resultadoTextField.add("9"));
        buttons.add(nove);
        nove.setClassName("ce");

        Image imagemMulti = new Image("images/X.png", "multi");
        Button multiplicacao = new Button(imagemMulti, clickEvent -> {
            moduloTextField.removeAll();
            var hist = resultadoTextField.getText();
            moduloTextField.add("X");
            historicoTextField.removeAll();
            historicoTextField.add(hist);
            resultadoTextField.removeAll();
        });
        buttons.add(multiplicacao);
        multiplicacao.setClassName("modulos");

        Image imagemQuatro = new Image("images/4.png", "4");
        Button quatro = new Button(imagemQuatro);
        buttons.add(quatro);
        quatro.setClassName("ce");
        quatro.addClickListener(clickEvent -> {
            resultadoTextField.add("4");
        });

        Image imagemCinco = new Image("images/5.png", "5");
        Button cinco = new Button(imagemCinco, clickEvent -> resultadoTextField.add("5"));
        buttons.add(cinco);
        cinco.setClassName("ce");

        Image imagemSeis = new Image("images/6.png", "6");
        Button seis = new Button(imagemSeis, clickEvent -> resultadoTextField.add("6"));
        buttons.add(seis);
        seis.setClassName("ce");

        Image imagemMenos = new Image("images/Minus.png", "menos");
        Button menos = new Button(imagemMenos, clickEvent -> {
            moduloTextField.removeAll();
            var hist = resultadoTextField.getText();
            moduloTextField.add("-");
            historicoTextField.removeAll();
            historicoTextField.add(hist);
            resultadoTextField.removeAll();
        });
        buttons.add(menos);
        menos.setClassName("modulos");

        Image imagemUm = new Image("images/1.png", "1");
        Button um = new Button(imagemUm, clickEvent -> resultadoTextField.add("1"));
        buttons.add(um);
        um.setClassName("ce");

        Image imagemDois = new Image("images/2.png", "2");
        Button dois = new Button(imagemDois, clickEvent -> resultadoTextField.add("2"));
        buttons.add(dois);
        dois.setClassName("ce");

        Image imagemTres = new Image("images/3.png", "3");
        Button tres = new Button(imagemTres, clickEvent -> resultadoTextField.add("3"));
        buttons.add(tres);
        tres.setClassName("ce");

        Image imagemMais = new Image("images/Plus.png", "mais");
        Button mais = new Button(imagemMais, clickEvent -> {
            moduloTextField.removeAll();
            var hist = resultadoTextField.getText();
            moduloTextField.add("+");
            historicoTextField.removeAll();
            historicoTextField.add(hist);
            resultadoTextField.removeAll();
        });
        buttons.add(mais);
        mais.setClassName("modulos");

        Image imagemMaisOuMenos = new Image("images/PlusMinus.png", "MaisOuMenos");
        Button maisOuMenos = new Button(imagemMaisOuMenos, clickEvent -> {
            var teste2 = resultadoTextField.getText();
            resultadoTextField.removeAll();
            double number = Double.parseDouble(teste2) * (-1);
            String s = String.valueOf(number);
            resultadoTextField.add(s);
        });
        buttons.add(maisOuMenos);
        maisOuMenos.setClassName("ce");

        Image imagemZero = new Image("images/0.png", "0");
        Button zero = new Button(imagemZero, clickEvent -> resultadoTextField.add("0"));
        buttons.add(zero);
        zero.setClassName("ce");

        Image imagemVirgula = new Image("images/,.png", "virgúla");
        Button virgula = new Button(imagemVirgula, clickEvent -> resultadoTextField.add("."));
        buttons.add(virgula);
        virgula.setClassName("ce");

        Image imagemIgual = new Image("images/Equals.png", "igual");
        Button igual = new Button(imagemIgual);
        buttons.add(igual);
        igual.setClassName("igual");
        igual.addClickListener(clickEvent -> {
            String moduloHist = moduloTextField.getText();

            var histResult = historicoTextField.getText();
            var y = resultadoTextField.getText();
            double number = Double.parseDouble((histResult));
            double number2 = Double.parseDouble((y));

            historicoTextField.removeAll();
            historicoTextField.add(histResult + moduloHist + y);
            resultadoTextField.removeAll();

            switch (moduloHist) {
                case "+": {
                    var result = number + number2;
                    String s = String.valueOf(result);
                    resultadoTextField.add(s);
                    moduloTextField.removeAll();
                    moduloTextField.add("=");
                    break;
                }
                case "-": {
                    var result = number - number2;
                    String s = String.valueOf(result);
                    resultadoTextField.add(s);
                    moduloTextField.removeAll();
                    moduloTextField.add("=");
                    break;
                }
                case "X": {
                    var result = number * number2;
                    String s = String.valueOf(result);
                    resultadoTextField.add(s);
                    moduloTextField.removeAll();
                    moduloTextField.add("=");
                    break;
                }
                case "/": {
                    var result = number / number2;
                    String s = String.valueOf(result);
                    resultadoTextField.add(s);
                    moduloTextField.removeAll();
                    moduloTextField.add("=");
                    break;
                }
                case "%": {
                    var result = number % number2;
                    String s = String.valueOf(result);
                    resultadoTextField.add(s);
                    moduloTextField.removeAll();
                    moduloTextField.add("=");
                    break;
                }
                default:
                    resultadoTextField.add("Erro");
                    break;
            }
        });

    }
}
