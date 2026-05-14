/**
 * 
 * @author Henri Lopes Schons
 */

for (int i = 1; i < vetor.lenght; i++) {
    int chave = vetor[i];
    int j = i - 1;
    
    while (j >= 0 && vetor[j] > chave) {
        vetor[j + 1] = vetor[j];
        j = j - 1;
    }
    vetor[j + 1] = chave;
}

/**
 * Resposta da pergunta:
 * Toda vez que um algoritmo faz muitas escritas na memória como usar varias vezes o metodo swap,
 *  ele força mais ciclos de escrita que demanda mais da memoria flash.
 */