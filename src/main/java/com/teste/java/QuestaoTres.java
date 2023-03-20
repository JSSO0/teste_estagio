package com.teste.java;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class QuestaoTres {
    public static void main(String[] args) throws IOException {
        try {

        ObjectMapper mapper = new ObjectMapper();
        /*
         * Primeiro, ao baixar o arquivo, troque o caminho para sua maquina,
         * Segundo não coloque em local com espaços, tipo:
         * 'Area de trabalho' até o momento não descobri importação em nuvem ou leitura de link e ao tentar colocar
         * com espaços o caminho do arquivo ele dá erro, qualquer feedback fico agradecido.
         */
        File file = new File("C:\\Users\\Joely\\maven\\src\\main\\java\\com\\teste\\java\\dados.json");
        JsonNode rootNode = mapper.readTree(file);



        // Inicializar variáveis
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double totalFaturamento = 0;
        int numDiasAcimaDaMedia = 0;
        int numDiasComFaturamento = 0;

        // Iterar sobre os valores do JSON
        for (JsonNode node : rootNode) {
            int dia = node.get("dia").asInt();
            double valor = node.get("valor").asDouble();

            // Atualizar menor e maior faturamento
            if (valor < menorFaturamento) {
                menorFaturamento = valor;
            }
            if (valor > maiorFaturamento) {
                maiorFaturamento = valor;
            }

            // Atualizar total e número de dias com faturamento
            totalFaturamento += valor;
            numDiasComFaturamento++;

            // Verificar se o valor é superior à média
            double mediaMensal = totalFaturamento / numDiasComFaturamento;
            if (valor > mediaMensal) {
                numDiasAcimaDaMedia++;
            }
        }

        // Imprimir resultados
        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento superior à média: " + numDiasAcimaDaMedia);

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
