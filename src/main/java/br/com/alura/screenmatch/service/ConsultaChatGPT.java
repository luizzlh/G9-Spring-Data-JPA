package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}