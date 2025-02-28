package com.meuprojeto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class BancoDeDados {
    private static final String ARQUIVO_JSON = "dados_financeiros.json";
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private Map<String, DadosMes> dados;

    public BancoDeDados() {
        this.dados = carregarDados();
    }

    private Map<String, DadosMes> carregarDados() {
        try (FileReader reader = new FileReader(ARQUIVO_JSON)) {
            Type tipo = new TypeToken<Map<String, DadosMes>>() {}.getType();
            return gson.fromJson(reader, tipo);
        } catch (IOException e) {
            return new HashMap<>();  // Retorna um novo mapa se o arquivo não existir
        }
    }

    public void salvarDados() {
        try (FileWriter writer = new FileWriter(ARQUIVO_JSON)) {
            gson.toJson(dados, writer);
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    public void adicionarReceita(String mes, Receita receita) {
        dados.computeIfAbsent(mes, k -> new DadosMes(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()))
             .getReceitas().add(receita);
        salvarDados();
    }

    public void adicionarGasto(String mes, Gasto gasto) {
        dados.computeIfAbsent(mes, k -> new DadosMes(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()))
             .getGastos().add(gasto);
        salvarDados();
    }

    public void adicionarMeta(String mes, Meta meta) {
        dados.computeIfAbsent(mes, k -> new DadosMes(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()))
             .getMetas().add(meta);
        salvarDados();
    }

    public void visualizarFinancasGerais() {
        if (dados.isEmpty()) {
            System.out.println("Nenhuma informação financeira cadastrada.");
            return;
        }

        for (Map.Entry<String, DadosMes> entry : dados.entrySet()) {
            String mes = entry.getKey();
            DadosMes dadosMes = entry.getValue();
            System.out.println("\n=== Finanças de " + mes + " ===");
            System.out.println("Receitas: " + gson.toJson(dadosMes.getReceitas()));
            System.out.println("Gastos: " + gson.toJson(dadosMes.getGastos()));
            System.out.println("Metas: " + gson.toJson(dadosMes.getMetas()));
        }
    }
}
