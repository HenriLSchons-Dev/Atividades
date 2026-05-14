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
 *"O" representa o uso de recursos (como memória) cresce conforme a entrada aumenta.
 * 
 * O "1" em O(1) significa que esse uso é constante, ou seja, não depende do tamanho da entrada.
 */