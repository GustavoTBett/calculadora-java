package com.calculator.views.calculadora;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Calculadora")
@Route(value = "")
public class CalculadoraView extends VerticalLayout {

    public CalculadoraView() {
        Div teste = new Div();
        teste.add("=");
        
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
        setClassName("calculadora");
        setSpacing(false);

        VerticalLayout layout = new VerticalLayout();
        add(layout);
        layout.setClassName("layout");
        
        VerticalLayout display = new VerticalLayout();
        Div buttons = new Div();
        layout.add(display);
        layout.add(buttons);
        display.setClassName("display");
        buttons.setClassName("buttons");
        
        VerticalLayout historico = new VerticalLayout();
        VerticalLayout tela = new VerticalLayout();
        display.add(historico);
        display.add(tela);
        historico.setClassName("historico");
        tela.setClassName("tela");
        
        Div historicoTextField = new Div();
        historicoTextField.add("1 + 1");
        historico.add(historicoTextField);
        
        VerticalLayout modulo = new VerticalLayout();
        VerticalLayout resultado = new VerticalLayout();
        tela.add(modulo);
        tela.add(resultado);
        modulo.setClassName("modulo");
        resultado.setClassName("resultado");
        
        Div moduloTextField = new Div();
        Div resultadoTextField = new Div();
        moduloTextField.add("=");
        resultadoTextField.add("");
        modulo.add(moduloTextField);
        resultado.add(resultadoTextField);

        Button ce = new Button("CE");
        buttons.add(ce);
        ce.setClassName("ce");
        ce.addClickListener(clickEvent -> {
            //apaga o número
            resultadoTextField.removeAll();
        });
        
        Button c = new Button("C");
        buttons.add(c);
        c.setClassName("ce");
        c.addClickListener(clickEvent -> {
            //apaga toda a operação
            resultadoTextField.removeAll();
            moduloTextField.removeAll();
            historicoTextField.removeAll();
        });
        
        Button porcentagem = new Button("%");
        buttons.add(porcentagem);
        porcentagem.setClassName("ce");
        porcentagem.addClickListener(clickEvent -> {
            moduloTextField.removeAll();
            var hist = resultadoTextField.getText();
            moduloTextField.add("%");
            historicoTextField.removeAll();
            historicoTextField.add(hist);
            resultadoTextField.removeAll();
        });
        
        Button divisao = new Button("/");
        buttons.add(divisao);
        divisao.setClassName("modulos");
        divisao.addClickListener(clickEvent -> {
            moduloTextField.removeAll();
            var hist = resultadoTextField.getText();
            moduloTextField.add("/");
            historicoTextField.removeAll();
            historicoTextField.add(hist);
            resultadoTextField.removeAll();
        });
        
        Button sete = new Button("7");
        buttons.add(sete);
        sete.setClassName("ce");
        sete.addClickListener(clickEvent -> {
            resultadoTextField.add("7");
        });
        
        Button oito = new Button("8");
        buttons.add(oito);
        oito.setClassName("ce");
        oito.addClickListener(clickEvent -> {
            resultadoTextField.add("8");
        });
        
        Button nove = new Button("9");
        buttons.add(nove);
        nove.setClassName("ce");
        nove.addClickListener(clickEvent -> {
            resultadoTextField.add("9");
        });
        
        Button multiplicacao = new Button("X");
        buttons.add(multiplicacao);
        multiplicacao.setClassName("modulos");
        multiplicacao.addClickListener(clickEvent -> {
            moduloTextField.removeAll();
            var hist = resultadoTextField.getText();
            moduloTextField.add("X");
            historicoTextField.removeAll();
            historicoTextField.add(hist);
            resultadoTextField.removeAll();
        });
        
        Button quatro = new Button("4");
        buttons.add(quatro);
        quatro.setClassName("ce");
        quatro.addClickListener(clickEvent -> {
            resultadoTextField.add("4");
        });
        
        Button cinco = new Button("5");
        buttons.add(cinco);
        cinco.setClassName("ce");
        cinco.addClickListener(clickEvent -> {
            resultadoTextField.add("5");
        });
        
        Button seis = new Button("6");
        buttons.add(seis);
        seis.setClassName("ce");
        seis.addClickListener(clickEvent -> {
            resultadoTextField.add("6");
        });
        
        Button menos = new Button("-");
        buttons.add(menos);
        menos.setClassName("modulos");
        menos.addClickListener(clickEvent -> {
            moduloTextField.removeAll();
            var hist = resultadoTextField.getText();
            moduloTextField.add("-");
            historicoTextField.removeAll();
            historicoTextField.add(hist);
            resultadoTextField.removeAll();
        });
        
        Button um = new Button("1");
        buttons.add(um);
        um.setClassName("ce");
        um.addClickListener(clickEvent -> {
            resultadoTextField.add("1");
        });
        
        Button dois = new Button("2");
        buttons.add(dois);
        dois.setClassName("ce");
        dois.addClickListener(clickEvent -> {
            resultadoTextField.add("2");
        });
        
        Button tres = new Button("3");
        buttons.add(tres);
        tres.setClassName("ce");
        tres.addClickListener(clickEvent -> {
            resultadoTextField.add("3");
        });
        
        Button mais = new Button("+");
        buttons.add(mais);
        mais.setClassName("modulos");
        mais.addClickListener(clickEvent -> {
            moduloTextField.removeAll();
            var hist = resultadoTextField.getText();
            moduloTextField.add("+");
            historicoTextField.removeAll();
            historicoTextField.add(hist);
            resultadoTextField.removeAll();
        });
        
        Button maisOuMenos = new Button("+/-");
        buttons.add(maisOuMenos);
        maisOuMenos.setClassName("ce");
        maisOuMenos.addClickListener(clickEvent -> {
            var teste2 = resultadoTextField.getText();
            resultadoTextField.removeAll();
            int number = Integer.parseInt(teste2) * (-1);
            String s = String.valueOf(number);
            resultadoTextField.add(s);
        });
        
        Button zero = new Button("0");
        buttons.add(zero);
        zero.setClassName("ce");
        zero.addClickListener(clickEvent -> {
            resultadoTextField.add("0");
        });
        
        Button virgula = new Button(",");
        buttons.add(virgula);
        virgula.setClassName("ce");
        virgula.addClickListener(clickEvent -> {
            resultadoTextField.add(".");
            String teste5 = resultadoTextField.getText();
            int number = Integer.parseInt(teste5);
            String s = String.valueOf(number);
            resultadoTextField.removeAll();
            resultadoTextField.add(s);
        });
        
        Button igual = new Button("=");
        buttons.add(igual);
        igual.setClassName("igual");
        igual.addClickListener(clickEvent -> {
            String moduloHist = moduloTextField.getText();
            
            var histResult = historicoTextField.getText();
            var y = resultadoTextField.getText();
            int number = Integer.parseInt(histResult);
            int number2 = Integer.parseInt(y);

            historicoTextField.removeAll();
            historicoTextField.add(histResult + moduloHist + y);
            resultadoTextField.removeAll();
            
            switch (moduloHist) {
                case "+":
                    {
                        var result = number + number2;
                        String s = String.valueOf(result);
                        resultadoTextField.add(s);
                        break;
                    }
                case "-":
                    {
                        var result = number - number2;
                        String s = String.valueOf(result);
                        resultadoTextField.add(s);
                        break;
                    }
                case "X":
                    {
                        var result = number * number2;
                        String s = String.valueOf(result);
                        resultadoTextField.add(s);
                        break;
                    }
                case "/":
                    {
                        var result = number / number2;
                        String s = String.valueOf(result);
                        resultadoTextField.add(s);
                        break;
                    }
                case "%":
                    {
                        var result = number % number2;
                        String s = String.valueOf(result);
                        resultadoTextField.add(s);
                        break;
                    }
                default:
                    resultadoTextField.add("Erro");
                    break;
            }
        });
        
        

    }
}
